package bankApp;

import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.in;

public class Atm {

    public static void main(String[] args) {

        displayMainMenu();

    }

    private static void displayMainMenu(){
        String mainMain = """
                        1 -> Create Account
                        2 -> Deposit
                        3 -> Withdraw
                        4 -> Check Balance
                        5 -> Transfer
                        6 -> Exit
                """;
        char userInput = input(mainMain).charAt(0);

        switch (userInput){
            case '1' -> createAccount();
            case '2' -> deposit();
//            case '3' -> withdraw();
            case '4' -> checkBalance();
            case '5' -> Transfer();
//            case '6' -> exit();
        }
    }

    private static void checkBalance() {
        String pin = input("Enter your pin: ");

    }

    private static void Transfer() {
        String sendersAccountNumber = input("Enter Sender's Account Number: ");
        String recipientAccountNumber = input("Enter Recipient's Account Number: ");
        String pin = input("Enter pin code: ");
        int amount = Integer.parseInt(input("Enter amount to transfer: "));
        Bank gtBank = new Bank();
        gtBank.transfer(sendersAccountNumber, recipientAccountNumber, amount, pin);
        display("Transfer successful!!");
        displayMainMenu();
    }

//    private static void withdraw() {
//        int amount = Integer.parseInt(input("Enter amount to withdraw: "));
//        String pin = input("Enter pin code: ");
//        Bank gtBank = new Bank();
//        gtBank.withdraw(amount, pin, );
//        display("Withdrawal of " + amount + "successfully!!");
//    }

    private static void deposit() {
        int amount = Integer.parseInt(input("Enter amount to deposit: "));
        String account = input("Enter account number: ");
        Bank gtBank = new Bank();
        gtBank.deposit(amount, account);
        display("Deposit of " + amount + "successfully!!");
        displayMainMenu();
    }

    private static void createAccount() {
        String accountName = input("Enter your name: ");
        String pinCode = input("Enter your pin: ");
        Bank gtBank = new Bank();
        gtBank.createAccount(accountName, pinCode);
        display("Account created successfully!!");
        displayMainMenu();
    }

    private static String input(String message) {
        display(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static void display(String message){
        System.out.println(message);
    }
}
