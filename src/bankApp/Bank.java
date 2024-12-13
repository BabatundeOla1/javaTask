package bankApp;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();
    private int numberOfAccounts;

    private String phoneNumber;



    public Account createAccount(String accountName, String pinCode) {
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

    public Account findAccount(String accountNumber){
        for(Account myAccount : accounts ){
            if(myAccount.getAccountNumber().equals(accountNumber))
                return myAccount;
        }
        throw new IllegalArgumentException("invalid deposit amount.");
    }

    public int withdraw(int amount, String pin, String accountNumber) {
        Account checkAccount = findAccount(accountNumber);
        int theBalance = checkAccount.getBalance(pin);
        if(amount > theBalance)
            throw new IllegalArgumentException("Account not found");
        else
            return checkAccount.withdraw(amount, pin);
    }

    public void transfer(String sendersAccount, String recipientAccount, int amount, String pincode) {
        Account sender = findAccount(sendersAccount);
        Account receiver = findAccount(recipientAccount);
        sender.withdraw(amount, pincode);
        receiver.deposit(amount);

    }
}
