public class CreditCardValidation{

   public static void main(String [] args){

   java.util.Scanner sc = new java.util.Scanner(System.in);
	
	System.out.print("Enter Card Number: ");
	String userCard = sc.nextLine();

	//checkValidity(userCard);

	String card = validateCard(userCard);

	System.out.println("*************************");

	System.out.println("Card Number: " +  userCard);

	System.out.println("Card Type: " + card);

	System.out.print("*************************");
   
   }

   

   public static String validateCard(String theNumber){

	if(theNumber.startsWith("4")){
		return "Visa Card.";
	}

	else if(theNumber.startsWith("5")){
		return "Master Card.";
	}

	else if(theNumber.startsWith("6")){
		return "Discover Credit Card.";
	}

	else if(theNumber.startsWith("3")){
		return "This is America Express.";
	}

	else 
		return "Invalid Card.";
   }



   public static void checkValidity(String cardNumber){

	int size = cardNumber.length();

	char [] newCardNumber = cardNumber.toCharArray();
	
	int multiple;

	int firstNumber;

	int secondNumber;

	int sum = 0;

	for(int count = newCardNumber.length-1; count > 0; count -= 2){

		int number = Character.getNumericValue(newCardNumber[count]);

		multiple = number * 2;
		
		if(multiple > 9){
			
			firstNumber = multiple / 10;

			secondNumber = multiple % 10;
			
			sum = firstNumber + secondNumber;
		
			System.out.print(sum);
		}

		

	}

   }


}




