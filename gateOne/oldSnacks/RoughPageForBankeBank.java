import java.util.Scanner; 
public class MyBank{

	private String name;
	private String accountNumber;
	private double balance;
	private int pin;

   public void createAccount(){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter First Name: ");
	String firstName = sc.nextLine().toUpperCase();

	System.out.print("Enter Last Name: ");
	String lastName = sc.nextLine().toUpperCase();

	System.out.print("Enter Pin: ");
	int pin = sc.nextInt();

	System.out.println("Welcome To Our Bank " + firstName + " " + lastName);
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



    public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	MyBank bank = new MyBank();	

	while(true){

		System.out.println("1. Create Account");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Balance");
		System.out.println("0. Exit");	

		System.out.print("Choose an option: ");
           	int userOption = sc.nextInt();

		switch(userOption){

			case 1: bank.createAccount();
				break;

			case 2: bank.makeDeposit();
				break;

			case 3: bank.makewithdrawal();
				break;

			case 4: bank.checkBalance();
				break;
		}
	}   
   }

}