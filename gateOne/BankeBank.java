import java.util.Scanner; 
import java.security.SecureRandom;
public class BankeBank{

   public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	MyBank bank = null;	

	SecureRandom rand = new SecureRandom();

	while(true){

		System.out.println("\tWELCOME TO BANKE BANK!");
		System.out.println("===============================");

		System.out.println("1. Create Account");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Balance");
		System.out.println("5. Check Bank Details");
		System.out.println("0. Exit");	
		
		System.out.println("===============================");

		System.out.print("Choose an option: ");
           	int userOption = sc.nextInt();

		switch(userOption){
			case 1: 
				if(bank == null){
					System.out.print("Enter First Name and Last Name: ");
					String fullName = sc.next();

					sc.nextLine();

					System.out.print("Enter your PIN: ");
					int pin = sc.nextInt();

					String accountNumber = "29" + Integer.toString(rand.nextInt(10000000));

					bank = new MyBank(fullName, accountNumber, pin);
					
					System.out.println();

					System.out.println("===============================");
					System.out.println("Name: " + fullName);
					bank.displayAccountNumber();
					System.out.println("===============================");

					System.out.println();

					System.out.println("Processing >>>>>>>>>");
					System.out.println("Account Created Successfully!");
					System.out.println();
					
				} else {
					System.out.println("Account Already Exist.");
				}
				break;

			case 2: 
				if(bank != null){
					bank.makeDeposit();
				} else {
					System.out.println("No account created. Please create an account first.");
				}
				break;

			case 3: 
				if (bank != null) {
                       			bank.makeWithdrawal();
                   		} else {
                       			System.out.println("No account created. Please create an account first.");
                  		}
                  		break;

			case 4: 
				if (bank != null) {
                       			bank.checkBalance();
                    		} else {
                        		System.out.println("No account created. Please create an account first.");
                    		}
                    		break;

			case 5: 
				bank.bankDetails();
				break;

			case 6: 
				System.out.println("Exiting the application.");
                   		sc.close();
                   		return;

			default:
				System.out.println("Invalid Option. PLEASE TRY AGAIN!!");
			
		}
	}   
   }

}