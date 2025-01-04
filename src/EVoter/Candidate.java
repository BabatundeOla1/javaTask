package EVoter;

import java.util.Scanner;

public class Candidate {
    private String name;
    private String CandidateID;
    private int countVote;
    public Candidate(String name, String userID){
        this.name = name;
        this.CandidateID = userID;
        this.countVote = 0;
    }

    public void setName(String name) {
        validatName(name);
        this.name = name;
    }
    public int getCountCandidateVote(){
        return countVote;
    }

    public void incrementCandidateVoteCount(){
        this.countVote++;
    }

    public String getName() {
        return name;
    }
    public String getCandidateID(){
        return CandidateID;
    }
    private void validatName(String name){
        if(name.matches(".*\\d.*")){
            throw new IllegalArgumentException("Invalid Name");
        }
    }

}
