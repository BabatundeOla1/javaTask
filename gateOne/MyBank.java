import java.util.Scanner; 
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


   public void displayAccountNumber(){

	System.out.println("Account Number: " + accountNumber);
   } 


   public void makeDeposit(){
	
	System.out.println("DEPOSIT\n");
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter account number: ");
	String inputAccountNumber = sc.nextLine();

	System.out.print("Enter amount to deposit: ");
	double amount = sc.nextDouble();

	if(amount <= 0){
	System.out.println("Invalid deposit");
		
	} else {
		balance += amount;
		System.out.println("=============================================");
		System.out.println("Deposit of $" + amount + " successful!");
		System.out.println("=============================================");
		System.out.println("\tTHANKS FOR BANKING WITH US :) ");
		System.out.println();
	}
   } 

   public void makeWithdrawal(){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Pin: ");
	int inputPin = sc.nextInt();

	System.out.print("Enter account number: ");
	String inputAccountNumber = sc.nextLine();

	sc.nextLine();

	if(inputPin == pin || inputAccountNumber == accountNumber){

       		System.out.print("Enter amount to withdraw: ");
        	double amount = sc.nextDouble();

		if (amount <= balance) {
                	balance -= amount;

			System.out.println();
			
			System.out.println("\tWITHDRAW SUCCESSFUL!");
			System.out.println("===============================");
                	System.out.println("Withdrawal of $" + amount + " successful!");
			System.out.println("===============================");

			System.out.println();

        	} else{
                	System.out.println("Insufficient balance! Kindly Deposit");
        	}	
	} else{
		System.out.println("Incorrect Pin or Incorrect Account Number");
	}
   }


   public void checkBalance(){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Pin: ");
	int inputPin = sc.nextInt();

	if(inputPin == pin){
		System.out.println("Balance: $" + balance);
		
	} else{
		System.out.print("Incorrect Pin");
	}
   }
 
   public void bankDetails(){

		System.out.println();
		System.out.println("Your Bank details are: ");
	System.out.println("===============================");
	
	System.out.println("Account Name:\n " + name);
		System.out.println();
	System.out.println("Account Number:\n " + accountNumber + "\n");

	System.out.println("===============================");

	
	
   }
}