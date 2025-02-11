package bankApp;

import java.util.Scanner;

public class Atm {
   private static Bank gtBank = new Bank();
    public static void main(String[] args) {
        MainMenu();
    }
    private static void MainMenu(){
        String mainMain = """
                        ==============================
                            Welcome to Earth Bank
                        ==============================
                        1 -> Create Account
                        2 -> Deposit
                        3 -> Withdraw
                        4 -> Check Balance
                        5 -> Transfer
                        6 -> Exit                        
                        ==============================
                            Select an Option:
                        ==============================
                """;
        char userInput = input(mainMain).charAt(0);

        switch (userInput){
            case '1' -> createAccount();
            case '2' -> deposit();
            case '3' -> withdraw();
            case '4' -> checkBalance();
            case '5' -> Transfer();
            case '6' -> exitApp();
        }
    }
    private static void createAccount() {
        try {
            String accountName = input("Enter your name: ");
            String pinCode = input("Enter your pin: ");
            Account newAccount = gtBank.createAccount(accountName, pinCode);
            display("Account created successfully!!" + "\n" + "your account number is: " + newAccount.getAccountNumber());
        }
        catch (IllegalArgumentException exception){
            display(exception.getMessage());
            MainMenu();
        }
        MainMenu();
    }
    private static void deposit() {
        try{
            int amount = Integer.parseInt(input("Enter amount to deposit: "));
            String accountNumber = input("Enter account number: ");
            gtBank.deposit(amount, accountNumber);
            display("Deposit of NGN " + amount + " successfully!!");
            MainMenu();
        }
        catch(IllegalArgumentException exception){
            display(exception.getMessage());
            MainMenu();
        }

    }

    private static void withdraw() {
        try{
            int amount = Integer.parseInt(input("Enter amount to withdraw: "));
            String pin = input("Enter pin code: ");
            String accountNumber = input("Enter your account number: ");
            gtBank.withdraw(amount, pin, accountNumber);
            display("Withdrawal of NGN " + amount + " successfully!!");
            MainMenu();
        }
        catch (IllegalArgumentException exception){
            display(exception.getMessage());
            MainMenu();
        }

    }

    private static void checkBalance() {
        try{
            String pin = input("Enter your pin: ");
            String accountNumber = input("Enter account number: ");
            Account account = gtBank.findAccount(accountNumber);
            display(String.format("Balance is NGN %,d: ", account.getBalance(pin)));
            MainMenu();
        }
        catch(IllegalArgumentException exception){
            display(exception.getMessage());
            MainMenu();
        }


    }

    private static void Transfer() {
        try{
            String sendersAccountNumber = input("Enter Sender's Account Number: ");
            String recipientAccountNumber = input("Enter Recipient's Account Number: ");
            String pin = input("Enter pin code: ");
            int amount = Integer.parseInt(input("Enter amount to transfer: "));
            gtBank.transfer(sendersAccountNumber, recipientAccountNumber, amount, pin);
            display("Transfer of NGN" + amount + " is successful!!");
            MainMenu();
        }
        catch(IllegalArgumentException exception){
            display(exception.getMessage());
            MainMenu();
        }
    }

    private static void exitApp() {
        display("Thank you for banking with us!!");
        System.exit(1);
    }
    private static String input(String message) {
        display(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
       //return JOptionPane.showInputDialog(message);
    }

    private static void display(String message){
        System.out.println(message);
        //JOptionPane.showMessageDialog(null, message);
    }
}
