package EVoter;

import bankApp.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

    private int numberOfRegisteration;
    private int numberOfCandidateRegisterated;
    private ArrayList<Voter> voteRegistration = new ArrayList<>();
    private ArrayList<Candidate> electionCandidate = new ArrayList<>();
    public Voter userRegistration(int userAge, String userName, char userGender, String password) {
        String userID = generateVoterID();
        Voter voters = new Voter(userAge, userName, userGender, userID, password);
        display("Registered successfully" + "I.D = " + userID);
        voteRegistration.add(voters);
        return voters;
    }

    public Candidate candidateRegister(String candidatePassword, String candidateName, char m) {
        String candidateID = generateCandidateID();
        Candidate candidates = new Candidate(candidatePassword, candidateName, m, candidateID);
        display("Registered successfully" + "I.D = " + candidateID);
        electionCandidate.add(candidates);
        return candidates;
    }

    private String generateCandidateID() {
        numberOfCandidateRegisterated++;
        return "NGv" + Integer.toString(numberOfCandidateRegisterated);
    }
    public int getNumberOfCandidateRegisterated(){
        return numberOfCandidateRegisterated;
    }
    public int getnumberOfRegisteration(){
        return numberOfRegisteration;
    }
    private String input(String message){
        Scanner sc = new Scanner(System.in);
        display(message);
        return sc.nextLine();
    }
    private String generateVoterID(){
        numberOfRegisteration++;
        return "NGv" + Integer.toString(numberOfRegisteration);
    }
    private void display(String message){
        System.out.println(message);
    }
}
