import java.util.Scanner;

public class NokiaPhone2{

public static void main (String [] args){

   Scanner input = new Scanner(System.in);
   
   System.out.println("Select Number: ");
   int UserInput = input.nextInt();
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

		System.out.println("Enter Number ");
		int UserInput1 = input.nextInt();
		switch (UserInput1) {
			   
		   case 1: System.out.println("Search book"); break;

		   case 2: System.out.println("Service NOs"); break;

		   case 3: System.out.println("Add Names"); break;

		   case 4: System.out.println("Erase"); break;

		   case 5: System.out.println("Edit"); break;

		   case 6: System.out.println("Assign tone"); break;

		   case 7: System.out.println("Send b'card"); break;

		   case 8: System.out.println("Options"); 

			System.out.println("1: Search book");
 
			System.out.println("2: Service NOs");
 
			System.out.println("Select Number: ");
		        int UserInput2= input.nextInt();
			switch (UserInput2) {

			   case 1: System.out.println("Search book"); break;

		  	   case 2: System.out.println("Service NOs"); break;

			   default: System.out.println("You've selected the wrong number");

			 } break;

		   case 9: System.out.println("Speed dial"); break;

		   case 10: System.out.println("Voice tags"); break;  
		   
		   default: System.out.println("You've selected the wrong number");

		} break;

	case 2: System.out.println("Message");
		System.out.println("1: Write message");

		System.out.println("2: Inbox");

		System.out.println("3: Outbox");

		System.out.println("4: Picture message");

		System.out.println("5: Templates");

		System.out.println("6: Smileys");

		System.out.println("7: Message settings");
		
		System.out.println("8: Info service");

		System.out.println("9: Voice mailbox number");

		System.out.println("10: Service command operator");

		System.out.println("Enter Number ");
		int UserInput3 = input.nextInt();
		switch (UserInput3) {
			   
		   case 1: System.out.println("Write message"); break;

		   case 2: System.out.println("Inbox"); break;

		   case 3: System.out.println("Outbox"); break;

		   case 4: System.out.println(" Picture message"); break;

		   case 5: System.out.println("Templates"); break;

		   case 6: System.out.println("Smileys"); break;

		   case 7: System.out.println("Message settings");

			System.out.println("1: Set 1");
 
			System.out.println("2: Common"); 

		         System.out.println("Select Number: ");
		         int UserInput4= input.nextInt();
			 switch (UserInput4) {

			   case 1: System.out.println("Set 1"); 
				
				System.out.println("1: Message centre number");

				System.out.println("2: Message sent as");

				System.out.println("3: Message validity");

				System.out.println("Select Number: ");
				int UserInput5= input.nextInt();
				switch (UserInput5) {

				  case 1: System.out.println("Message centre number"); break;

		   		  case 2: System.out.println("Message sent as"); break;

		  		  case 3: System.out.println("Message validity"); break;

				  default: System.out.println("You've selected the wrong number");
				
				} break;

		  	   case 2: System.out.println("Common");

				System.out.println("1: Delivery reports");

				System.out.println("2: Reply via same centre");

				System.out.println("3: Character support");

				System.out.println("Select Number: ");
				int UserInput6= input.nextInt();
				switch (UserInput6) {

				  case 1: System.out.println("Delivery reports"); break;

		   		  case 2: System.out.println("Reply via same centre"); break;

		  		  case 3: System.out.println("Character support"); break;

				  default: System.out.println("You've selected the wrong number");
				
				} break;


			   default: System.out.println("You've selected the wrong number");

			 } break;
		   
		   case 8: System.out.println("Info service"); break;

		   case 9: System.out.println("Voice mailbox number"); break;

		   case 10: System.out.println("Service command operator"); break;

		   default: System.out.println("You've selected the wrong number");

		} break;

	case 3: System.out.println("Chat"); break;

	case 4: System.out.println("Call Register"); 

		System.out.println("1: Missed calls");

		System.out.println("2: Received calls");

		System.out.println("3: Dialled numbers");

		System.out.println("4: Erase recent calls list");

		System.out.println("5: Show call duration");

		System.out.println("6: Show call costs");

		System.out.println("7: Call cost settings");

		System.out.println("8: Prepaid credit");

		System.out.println("Enter number: ");
		int UserInput7 = input.nextInt();
		switch (UserInput7){

		  case 1: System.out.println("Missed calls"); break;

		  case 2: System.out.println("Received calls"); break;

		  case 3: System.out.println("Dialled numbers"); break;

		  case 4: System.out.println("Erase recent calls list"); break;

		  case 5: System.out.println("Show call duration"); 

		           System.out.println("1: Last call duration");

				System.out.println("2: All call's duration");

				System.out.println("3: Received call's duration");

				System.out.println("4: Dailled call's duration");

				System.out.println("5: Clear timers");

				System.out.println("Select Number: ");
				int UserInput8= input.nextInt();
				switch (UserInput8) {

				  case 1: System.out.println("Delivery reports"); break;

		   		  case 2: System.out.println("Reply via same centre"); break;

		  		  case 3: System.out.println("Received call's duration"); break;

				  case 4: System.out.println("4: Dailled call's duration"); break;

				  case 5: System.out.println("5: Clear timers"); break;

				  default: System.out.println("You've selected the wrong number");
				
				} break;

		  case 6: System.out.println("Show call costs");
			
				System.out.println("1: Last call cost");

				System.out.println("2: All call's cost");

				System.out.println("3: Clear counters");

				System.out.println("Select Number: ");
				int UserInput9= input.nextInt();
				switch (UserInput9) {

				  case 1: System.out.println("Last call cost"); break;

		   		  case 2: System.out.println("All calls' cost"); break;

		  		  case 3: System.out.println("Clear counters"); break;

				  default: System.out.println("You've selected the wrong number");
				
				} break;

		  case 7: System.out.println("Call cost settings");

				System.out.println("1: call cost limit");

				System.out.println("2: Show costs in");

				System.out.println("Select Number: ");
				int UserInput10= input.nextInt();
				switch (UserInput10) {

				  case 1: System.out.println("call cost limit"); break;

		   		  case 2: System.out.println("Show costs in"); break;

				  default: System.out.println("You've selected the wrong number");
				
				} break;

		  case 8: System.out.println("8: Prepaid credit"); break;


		  default: System.out.println("You've selected the wrong number");

		} break;

	case 5: System.out.println("Tones");
	
		System.out.println("1: Ringing tones");

		System.out.println("2: Ringing volume");

		System.out.println("3: Incoming call alert");

		System.out.println("4: Composer");

		System.out.println("5: Message alert tone");

		System.out.println("6: Keypad tones");

		System.out.println("7: Warning and game tones");

		System.out.println("8: Vibrating alert");

		System.out.println("9: Screen saver");

		System.out.println("Enter number: ");
		int UserInput11 = input.nextInt();
		switch (UserInput11){

		  case 1: System.out.println("Ringing tones"); break;

		  case 2: System.out.println("Ringing volume"); break;

		  case 3: System.out.println("Incoming call alert"); break;

		  case 4: System.out.println("Composer"); break;

		  case 5: System.out.println("Message alert tone"); break;

		  case 6: System.out.println("Keypad tones"); break;

		  case 7: System.out.println("Warning and game tones"); break;

		  case 8: System.out.println("Vibrating alert"); break;
		
		  case 9: System.out.println("Screen saver"); break;

		  default: System.out.println("You've selected the wrong number");

		} break;

	case 6: System.out.println("Settings"); 

		System.out.println("1: Call setting");

		System.out.println("2: Phone settings");

		System.out.println("3: Security settings");

		System.out.println("4: Restore factory settings");

		System.out.println("Enter number: ");
		int UserInput12 = input.nextInt();
		switch (UserInput12){

		  case 1: System.out.println("Call setting");

			System.out.println("1: Automatic redial");

		 	System.out.println("2: Speed dialling");

		 	System.out.println("3: Call waitng options");

		 	System.out.println("4: Own number sending");

		 	System.out.println("5: Phone line in use");

		 	System.out.println("6: Automatic answer");

		 	System.out.println("Enter number: ");
		 	int UserInput13 = input.nextInt();
		 	switch (UserInput13){

		   	   case 1: System.out.println("Automatic redial"); break;

		   	   case 2: System.out.println("Speed dialling"); break;

		   	   case 3: System.out.println("Call waitng options"); break;

		   	   case 4: System.out.println("Own number sending"); break;

		   	   case 5: System.out.println("Phone line in use"); break;

		   	   case 6: System.out.println("Automatic answer"); break;
		  
		   	   default: System.out.println("You've selected the wrong number");

		 	} break;


		  case 2: System.out.println("Phone settings"); 

			System.out.println("1: Language");

		 	System.out.println("2: Cell info display");

		 	System.out.println("3: Welcome note");

		 	System.out.println("4: Network selection");

		 	System.out.println("5: Lights");

		 	System.out.println("6: Confirm SIM service actions");

		 	System.out.println("Enter number: ");
		 	int UserInput14 = input.nextInt();
		 	switch (UserInput14){

		   	   case 1: System.out.println("Language"); break;

		   	   case 2: System.out.println("Cell info display"); break;

		   	   case 3: System.out.println("Welcome note"); break;

		   	   case 4: System.out.println("Network selection"); break;

		   	   case 5: System.out.println("Lights"); break;

		   	   case 6: System.out.println("Confirm SIM service actions"); break;
		  
		   	   default: System.out.println("You've selected the wrong number");

		 	} break;


		  case 3: System.out.println("Security settings");

			System.out.println("1: PIN code request");

		 	System.out.println("2: Call barring service");

		 	System.out.println("3: Fixed dialling");

		 	System.out.println("4: Closed user group");

		 	System.out.println("5: Phone security");

		 	System.out.println("6: Change access codes");

		 	System.out.println("Enter number: ");
		 	int UserInput15 = input.nextInt();
		 	switch (UserInput15){

		   	   case 1: System.out.println("PIN code request"); break;

		   	   case 2: System.out.println("Call barring service"); break;

		   	   case 3: System.out.println("Fixed dialling"); break;

		   	   case 4: System.out.println("Closed user group"); break;

		   	   case 5: System.out.println("Phone security"); break;

		   	   case 6: System.out.println("Change access codes"); break;
		  
		   	   default: System.out.println("You've selected the wrong number");

		 	} break;


		  case 4: System.out.println("Restore factory settings"); break;
		  
		  default: System.out.println("You've selected the wrong number");

		} break;

	case 7: System.out.println("Call divert"); 

	case 8: System.out.println("Games"); break;
	
	case 9: System.out.println("Calulator"); break;

	case 10: System.out.println("Reminders"); break;
	
	case 11: System.out.println("Clock"); 

		 System.out.println("1: Alarm clock");

		 System.out.println("2: Clock settings");

		 System.out.println("3: Date setting");

		 System.out.println("4: Stopwatch");

		 System.out.println("5: Countdown timer");

		 System.out.println("6: Auto update of date and time");

		 System.out.println("Enter number: ");
		 int UserInput16 = input.nextInt();
		 switch (UserInput16){

		   case 1: System.out.println("Last Calls' cost"); break;

		   case 2: System.out.println("All Calls' cost"); break;

		   case 3: System.out.println("Clear counters"); break;

		   case 4: System.out.println("Stopwatch"); break;

		   case 5: System.out.println("Countdown timer"); break;

		   case 6: System.out.println("Auto update of date and time"); break;
		  
		   default: System.out.println("You've selected the wrong number");

		 } break;

	case 12: System.out.println("Profile"); break;
	
	case 13: System.out.println("SIM services"); break;

	default: System.out.println("You've selected the wrong number"); 
}
}



