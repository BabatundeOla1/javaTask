package EVoter;

public class Voter {
    private int age;
    private String name;
    private char gender;
    private String userID;
    private String password;
    public Voter(int age, String name, char gender, String userID, String password){
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.userID = userID;
        this.password = password;
    }

    public void setAge(int age) {
        validateAge(age);
        this.age = age;
    }
    public void setName(String name) {
        validatName(name);
        this.name = name;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        validatePassword(password);
        this.password = password;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        return gender;
    }

    public String getUserID(){
        return userID;
    }
    private void validatName(String name){
        if(name.matches(".*\\d.*")){
            throw new IllegalArgumentException("Invalid Name");
        }
    }

    private void validatePassword(String password){
        if(password.length() != 4){
            throw new IllegalArgumentException("Password length should be four");
        }
    }
    private void validateAge(int age){
        if (age < 18 || age > 120){
            throw new IllegalArgumentException("Invalid age, you cant vote.");
        }
    }
}
