import java.util.Scanner; 
public class MyBank{

	private String name;
	private String accountNumber;
	private double balance;
	private int pin;

   public void createAccount(){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter First Name: ");
	String firstName = sc.nextLine();

	System.out.print("Enter Last Name: ");
	String lastName = sc.nextLine();

	System.out.println("Welcome To Our Bank" + firstName + lastName);
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


   public void checkBalance(){
	System.out.println("Balance: $" + balance);
   }

}