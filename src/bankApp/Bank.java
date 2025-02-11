package bankApp;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();
    private int numberOfAccounts;



    public Account createAccount(String accountName, String pinCode) {
        validatName(accountName);
        validatePin(pinCode);
        numberOfAccounts++;
        String accountNumber = Integer.toString(numberOfAccounts);
        Account myAccount = new Account(accountNumber, accountName, pinCode);
        accounts.add(myAccount);
        return myAccount;
    }
    public int getNumberOfAccounts(){
        return numberOfAccounts;
    }

    public void deposit(int amount, String accountNumber) {
        validateDeposit(amount, accountNumber);
    }

    public Account findAccount(String accountNumber){
        for(Account myAccount : accounts ){
            if(myAccount.getAccountNumber().equals(accountNumber))
                return myAccount;
        }
        throw new IllegalArgumentException("Account Not Found.");
    }

    public int withdraw(int amount, String pin, String accountNumber) {
        Account checkAccount = findAccount(accountNumber);
        validatePin(pin);
        int theBalance = checkAccount.getBalance(pin);

        if(amount > theBalance) {
            throw new IllegalArgumentException("You need to deposit.");

        }
        else
            return checkAccount.withdraw(amount, pin);
    }

    public void transfer(String sendersAccount, String recipientAccount, int amount, String pincode) {
        validateAmount(amount);
        validatePin(pincode);
        Account sender = findAccount(sendersAccount);
        Account receiver = findAccount(recipientAccount);
        sender.withdraw(amount, pincode);
        receiver.deposit(amount);
    }


    private void validateDeposit(int amount, String accountNumber){
        Account checkAccount = findAccount(accountNumber);
        if(amount < 1){
            throw new IllegalArgumentException("invalid deposit amount.");
        }

        if(checkAccount != null) {
            checkAccount.deposit(amount);
        }
        else
            throw new IllegalArgumentException("Account not found");
    }

    private void validatName(String name){
        if(name.matches(".*\\d.*")){
            throw new IllegalArgumentException("Invalid Name");
        }

        if(name.isBlank()){
            throw new IllegalArgumentException("Name can not be blank.");
        }
    }

    private void validateAmount(int amount){
        if(amount < 1){
            throw new IllegalArgumentException("invalid Transfer amount.");
        }
    }

    private void validatePin(String pin){
        if(pin.isBlank()){
            throw new IllegalArgumentException("Pin can not be blank.");
        }
    }
}
