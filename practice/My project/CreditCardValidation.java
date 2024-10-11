public class CreditCardValidation{

   public static void main(String [] args){

   java.util.Scanner sc = new java.util.Scanner(System.in);
	
	System.out.print("Enter Card Number: ");
	String userCard = sc.nextLine();

	checkValidity(userCard);

	/*String card = validateCard(userCard);

	System.out.println("*************************");
	System.out.println("Card Number: " +  cardNumber);
	System.out.println("Card Type: " + card);
	System.out.print("*************************");
	*/
   
   }

   

   /*public static String validateCard(String theNumber){

	if(theNumber.startsWith("4")){
		return "This is Visa Card.";
	}

	else if(theNumber.startsWith("5")){
		return "This is Master Card.";
	}

	else if(theNumber.startsWith("6")){
		return "This is Discover Credit Card.";
	}

	else if(theNumber.startsWith("3")){
		return "This is America Express.";
	}

	else 
		return "Invalid Card.";
   }*/



   public static void checkValidity(String cardNumber){

	int [] newCard =new int[cardNumber];
	
	

	for(int count = newCard.length() - 1; count >= 0; count -= 2){

		System.out.print(newCard[count]);

	}

   }


}




