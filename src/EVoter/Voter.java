package EVoter;

public class Voter {
    private int age;
    private String name;
    private String userID;
    private String password;

    public Voter(int age, String name, String userID, String password){
        this.age = age;
        this.name = name;
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
    public void setPassword(String password) {
        validatePassword(password);
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
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
        boolean checkPassword = password.length() < 8;
        if(checkPassword){
            throw new IllegalArgumentException("Password length should be four");
        }
    }
    private void validateAge(int age){
        if (age < 18 || age > 120){
            throw new IllegalArgumentException("Invalid age, you cant vote.");
        }
    }
}
