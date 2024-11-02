import java.util.Scanner; 
import java.util.Random;
public class MyBank{

	private String name;
	private String accountNumber;
	private double balance;
	private int pin;

 public MyBank(String myName, String myAccountNumber, int myPin){
	
	name = myName;
	accountNumber = myAccountNumber;
	pin = myPin;
   }

   public int getPin(){
	return pin;
   }

   public String getName(){
	return name;
   }

   public double getBalance(){
	return balance;
   }

   public String getAccountNumber(){
	return accountNumber;
	
   }

   public void createAccount(String name, int Pin){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter First Name and Last Name: ");
	String firstName = sc.nextLine().toUpperCase();

	//System.out.print("Enter Last Name: ");
	//String lastName = sc.nextLine().toUpperCase();

	System.out.print("Enter Pin: ");
	int pin = sc.nextInt();

	System.out.println("Welcome To Our Bank " + firstName);
   }


   public void makeDeposit(){

	System.out.println("DEPOSIT\n");

	Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

	if(amount <= 0){
		System.out.println("Invalid deposit");
		
	}
	else{
		balance += amount;
		System.out.println("Deposit of " + "$" + amount + " successful!");
	}
   } 



   public void makewithdrawal(){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Pin: ");
	int inputPin = sc.nextInt();

	if(inputPin == pin){

       		System.out.print("Enter amount to deposit: ");
        	double amount = sc.nextDouble();

		if (amount <= balance) {
                	balance -= amount;
                	System.out.println("Withdrawal successful!");
        	}
		else{
                	System.out.println("Insufficient balance!");
        	}	
	}
	
	else{
		System.out.println("Incorrect Pin");
	}
   }


   public void checkBalance(){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Pin: ");
	int inputPin = sc.nextInt();

	if(inputPin == pin){
		System.out.println("Balance: $" + balance);
		
	}
	
	else{
		System.out.print("Incorrect Pin");
	}
   }

}