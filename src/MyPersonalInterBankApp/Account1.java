package MyPersonalInterBankApp;

public class Account1 {
    private String name;
    private int balance;
    private String pin;
    private String accountNumber;
    public Account1(String name, String accountNumber, String pin){
        this.name = name;
        this.balance = 0;
        this.pin = pin;
        this.accountNumber = accountNumber;
    }

    public void setName(String name){
        if(!name.isEmpty()){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Invalid name");
        }
    }
    public String getName(){
        return this.name;
    }
    public int getBalance() {
        return balance;
    }
    public String getPin() {
        return pin;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(int amount){
        if(amount > 0){
            balance += amount;
        }
        else{
            throw new IllegalArgumentException("invalid Amount");
        }
    }

    public void withdraw(int amount, String pin) {
        if(amount > 0){
            balance -= amount;
        }
        else{
            throw new IllegalArgumentException("invalid Amount");
        }
    }
}
