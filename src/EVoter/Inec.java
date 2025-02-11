package EVoter;

import java.util.ArrayList;
import java.util.Scanner;

public class Inec {

    private int numberOfRegisteration;
    private  String voterID;
    private  String candidateID;
    private int numberOfCandidateRegisterated;
    private static ArrayList<Voter> voteRegistration = new ArrayList<>();
    private static ArrayList<Candidate> electionCandidate = new ArrayList<>();
    private ArrayList<Party> candidateParty = new ArrayList<>();

    public Voter voterRegistration(int userAge, String userName, String password) {
        this.voterID = generateVoterID();
        validatePassword(password);
        Voter voters = new Voter(userAge, userName, voterID, password);
        voteRegistration.add(voters);
        return voters;
    }

    public Candidate candidateRegistration(String candidateName) {
        this.candidateID = generateCandidateID();
        Candidate candidates = new Candidate(candidateName, candidateID);
        electionCandidate.add(candidates);
        return candidates;
    }

    public int getNumberOfCandidateRegisterated(){
        return numberOfCandidateRegisterated;
    }
    public int getnumberOfRegisteration(){
        return numberOfRegisteration;
    }

    public Voter findVoterAccount(String voterID){
        for(Voter voters : voteRegistration){
            if (voters.getUserID().equals(voterID)) {
                return voters;
            }
        }
        throw new IllegalArgumentException("Voter Account is Invalid");
    }
    public Candidate findCandidateAccount(String candidateID) {
        for (Candidate candidates : electionCandidate) {
            if (candidates.getCandidateID().equals(candidateID)) {
                return candidates;
            }
        }
        throw new IllegalArgumentException("Candidate Account is Invalid");
    }
    public void castVote(String candidateID){
        Candidate candidate = findCandidateAccount(candidateID);
        candidate.incrementCandidateVoteCount();
    }

    public void displayResults() {
        System.out.println("Election Results:");
        for (Candidate candidate : electionCandidate) {
            display(candidate.getName() + " - Votes: " + candidate.getCountCandidateVote());
        }
    }

    private String generateVoterID(){
        numberOfRegisteration++;
        return "NGv" + Integer.toString(numberOfRegisteration);
    }

    private String generateCandidateID() {
        numberOfCandidateRegisterated++;
        return "NGc" + Integer.toString(numberOfCandidateRegisterated);
    }

    private static String input(String message){
        Scanner sc = new Scanner(System.in);
        display(message);
        return sc.nextLine();
    }

    private static void display(String message){
        System.out.println(message);
    }

    private void validatePassword(String password){
        boolean checkPassword = password.length() < 8;
        if(checkPassword){
            throw new IllegalArgumentException("Password length should be greater than eight");
        }

        if(password.isBlank()){
            throw new IllegalArgumentException("password can not be blank");
        }
    }
}