package CeaserCipher;

import javax.swing.*;
import java.util.Scanner;

public class EncryptionAndDecryptionDriver {

    private static EncryptionAndDecryption encryptAndDecrypt = new EncryptionAndDecryption();
    public static void main(String[] args) {

        displayMenu();
    }

    public static void displayMenu(){
        String menu = """
                ==============================
                  ENCRYPTION AND DECRYPTION
                ==============================
                    1 -> Encryption
                    2 -> Decryption
                    3 -> Exit
                ==============================
                ==============================    
                """;

        display(menu);

        String userOption = input("Select an Option:");

        switch (userOption){
            case "1":
                    encryption();
            case "2":
                    decryption();
            default:
                    exit();
        }
    }

    private static void  encryption(){
        int number = Integer.parseInt(input("Enter number: "));
        String words = input("Enter word: ");
        display(encryptAndDecrypt.encryption(number, words));
        displayMenu();
    }

    private static void  decryption(){
        int number = Integer.parseInt(input("Enter number: "));
        String words = input("Enter word: ");
        display(encryptAndDecrypt.decryption(number, words));
        displayMenu();
    }
    private static void exit(){
        display("Thank you!");
        displayMenu();
    }
    
    private static String input(String message){
//        display(message);
//        Scanner sc = new Scanner(System.in);
//        return sc.nextLine();
        return JOptionPane.showInputDialog(message);
    }

    private static void display(String message){
        //System.out.println(message);
        JOptionPane.showMessageDialog(null, message);
    }
}
