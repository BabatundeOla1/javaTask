import java.util.Scanner; 

public class BankeBank{

   public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	MyBank bank = new MyBank(myName, myAccountNumber, myPin);	

	while(true){

		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Balance");
		System.out.println("4. Create Account");
		System.out.println("0. Exit");	

		System.out.print("Choose an option: ");
           	int userOption = sc.nextInt();

		switch(userOption){

			case 1: bank.makeDeposit();
				break;

			case 2: bank.makewithdrawal();
				break;

			case 3: bank.checkBalance();
				break;

			case 4: bank.createAccount();
				break;
		}
	}   
   }

}