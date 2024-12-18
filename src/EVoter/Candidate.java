package EVoter;

public class Candidate {
    private String password;
    private String name;
    private char gender;
    private String CandidateID;
    public Candidate(String password, String name, char gender, String userID){
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.CandidateID = userID;
    }

    public void setAge(String password) {
        validateAge(password);
        this.password = password;
    }
    public void setName(String name) {
        validatName(name);
        this.name = name;
    }
    public String getPassWord() {
        return password;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }

    public String getCandidateID(){
        return CandidateID;
    }
    private void validatName(String name){
        if(name.matches(".*\\d.*")){
            throw new IllegalArgumentException("Invalid Name");
        }
    }
    private void validateAge(String password){
        if(password.matches(".*\\d.*")){
            throw new IllegalArgumentException("Invalid Name");
        }
    }
}
