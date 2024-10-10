public class CreditCardValidation{

   public static void main(String [] args){

   java.util.Scanner sc = new java.util.Scanner(System.in);
	
	System.out.print("Enter Card Number: ");
	String cardNumber = sc.nextLine();

	String card = validateCard(cardNumber);

	System.out.println("*************************");
	System.out.println("Card Number: " +  cardNumber);
	System.out.println("Card Type: " + card);
	System.out.print("*************************");
   
   } 

   

   public static String validateCard(String theNumber){

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
   }



/*public static int checkValidity(int cardNumber){
	
	int reverseCount = 0;

	int firstNumber ;

	int secondNumber ;

	int sum = 0;

	for(int count = 0; count < cardNumber.length-1; count += 2){
		
		reverseCount = count * 2;

		if(reverseCount > 9){

			firstNumber = reverseCount / 10;

			secondNumber = reverseCount % 10;

			sum = firstNumber + secondNumber;

		}

	}
	
	


  }*/


}

