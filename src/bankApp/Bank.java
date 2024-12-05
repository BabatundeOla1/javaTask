package bankApp;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();
    private int numberOfAccounts = 0;

    public int getNumberOfAccounts(){
        return this.numberOfAccounts;
    }

    public Account createAccount(String accountName, String pinCode) {
        numberOfAccounts++;
        String accountNumber = Integer.toString(generateAccount());
        Account myAccount = new Account(accountNumber, accountName, pinCode);
        accounts.add(myAccount);
        return myAccount;
    }

    public int generateAccount(){
        return numberOfAccounts;
    }

    public void deposit(int amount, String accountNumber) {
        Account checkAccount = findAccount(accountNumber);
        if(amount < 1){
            throw new IllegalArgumentException("invalid deposit amount.");
        }
        if(checkAccount != null)
            checkAccount.deposit(amount);
        else
            throw new IllegalArgumentException("Account not found");
    }

    private Account findAccount(String accountNumber){
        for(Account myAccount : accounts ){
            if(myAccount.getAccountNumber().equals(accountNumber))
                return myAccount;
        }
        return null;
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
