package Login;

import java.util.Scanner;

public class Password {
    private String userPassword;

    public Password(String userPassword){
        this.userPassword = userPassword;
    }

    public String getUserPassword(){
        return this.userPassword;
    }

    public void passwordLength() {
        validatePasswordLength(this.userPassword);
    }

    public void passwordNumber() {
        checkNumber(this.userPassword);
    }

    public void passwordCapitalCase() {
        checkForCapitalLetter(this.userPassword);
    }

    public void passwordLowerCase() {
        checkForLowerCase(this.userPassword);
    }
    private void validatePasswordLength(String password){
        boolean passwordLength = password.length() < 8;
        if(passwordLength){
            throw new IllegalArgumentException("Password length should be Greater Than Eight");
        }
    }

    private void checkNumber(String password){
        if (!password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Password must contain at least one number.");
        }
    }

    private void checkForCapitalLetter(String password){
        char character;
        for (int element = 0; element < password.length(); element++){
            character = toString().charAt(element);
            if(!Character.isUpperCase(character)){
                throw new IllegalArgumentException("Password must contain Capital Case");
            }
        }
    }

    private void checkForLowerCase(String password){
        char character;
        for (int element = 0; element < password.length(); element++){
            character = toString().charAt(element);
            if (!Character.isLowerCase(character)){
                throw new IllegalArgumentException("Password must contain Lower Case");
            }
        }
    }

    private String input(String message){
        display(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private void display(String message){
        System.out.println(message);
    }

}