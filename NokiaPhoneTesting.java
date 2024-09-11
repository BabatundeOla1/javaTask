import java.util.Scanner;

public class NokiaPhoneTesting{

   public static void main (String [] args){

	Scanner input = new Scanner(System.in);

	System.out.println("Select Number: ");
	int UserInput = input.nextInt();
	mainMenu();

   }

   public static void mainMenu(){   

	System.out.println("1: Phone Book");

	System.out.println("2: Message");

	System.out.println("3: Chat");

	System.out.println("4: Call Register");

	System.out.println("5: Tones");

	System.out.println("6: Settings");

	System.out.println("7: Call divert");

	System.out.println("8: Games");

	System.out.println("9: Calculator");

	System.out.println("10: Reminders");

	System.out.println("11: Clock");

	System.out.println("12: Profile");

	System.out.println("13: SIM services");
	
	System.out.println("0: back");

	System.out.println("Menu");

   }

	switch (UserInput) {

	case 1: System.out.println("Phone Book"); 
		System.out.println("1: Search");

		System.out.println("2: Service NOs");

		System.out.println("3: Add name");

		System.out.println("4: Erase");

		System.out.println("5: Edit");

		System.out.println("6: Assign tone");

		System.out.println("7: Send b'card");

		System.out.println("8: Options");

		System.out.println("9: Speed dial");

		System.out.println("10: Voice tags");
		
		System.out.println("0: Main menu");		

		if(userInput == 0){
		    System.out.print(mainMenu());
		}
	}
}