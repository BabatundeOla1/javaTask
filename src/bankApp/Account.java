package bankApp;

public class Account {
    private String number;
    private String name;
    private int balance;
    private String pincode;

    public Account(String number, String name, String pinCode) {
        this.number = number;
        this.name = name;
        this.balance = 0;
        this.pincode = pinCode;
    }
    public String getAccountNumber() {
        return this.number;
    }

    public int getBalance(String pin) {
        validatePincode(pin);
        return this.balance;
    }

    public int deposit(int amount) {
        return this.balance += amount;
    }
    public int withdraw(int amount, String pin) {
        validatePincode(pin);
        return this.balance -= amount;
    }

    private void validatePincode(String pin) {
        if(!this.pincode.equals(pin)){
            throw new IllegalArgumentException("Incorrect pincode");
        }
    }

    public String getPin() {
        return pincode;
    }
}
