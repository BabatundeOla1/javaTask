package bankApp;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();
    private int numberOfAccounts = 0;
    private String accountNumber;
    private String accountName;

    public int getNumberOfAccounts(){
        return this.numberOfAccounts;
    }

    public Account createAccount(String accountName, String pinCode) {
        String accountNumber = Integer.toString(generateAccount());
        Account myAccount = new Account(accountNumber, "accountName", "pinCode");
        accounts.add(myAccount);
        numberOfAccounts++;
        return myAccount;
    }

    public int generateAccount(){
        return numberOfAccounts;
    }

    public void deposit(int amount, String accountNumber) {
        Account checkAccount = findAccount(accountNumber);
        if(checkAccount == null)
            throw new IllegalArgumentException("Account not found");
        else
          checkAccount.deposit(amount);
    }

    private Account findAccount(String accountNumber){
        for(Account myAccount : accounts ){
            if(myAccount.getAccountNumber().equals(accountNumber))
                return myAccount;
        }
        return null;
    }
}
