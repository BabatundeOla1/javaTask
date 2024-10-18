public class CreditCardValidation{

   public static void main(String [] args){

   //java.util.Scanner sc = new java.util.Scanner(System.in);
	
	//System.out.print("Enter Card Number: ");
	//String userCard = sc.nextLine();

	String userCard = "5199110824684028";
	
	System.out.println(" ");

	System.out.println("************************************");

	System.out.println("Credit Card Type: " + validateCard(userCard));
	System.out.println("Credit Card Number: " +  userCard);
	System.out.println("Credit Card Digit Length: " +  userCard.length());
	System.out.println("Card Type: " + checkValidity(userCard));

	System.out.print("************************************");
   
   }


  public static String validateCard(String theNumber){

	if(theNumber.startsWith("4")){
		return "VisaCard";
	}

	else if(theNumber.startsWith("5")){
		return "MasterCard";
	}

	else if(theNumber.startsWith("6")){
		return "Discover Credit Card";
	}

	else if(theNumber.startsWith("37")){
		return "This is America Express";
	}

	else 
		return "Invalid Card.";
   }


   public static String checkValidity(String cardNumber){

	int size = cardNumber.length();

	int [] newCardNumber = new int[size];

	int totalSumOdd = 0;

	int totalSumEven = 0;
	
	int allSum = 0;

	for(int index = size -1 ; index >= 0; index -= 2){

		newCardNumber[index] = Character.getNumericValue(cardNumber.charAt(index));
		int multiple = newCardNumber[index] * 2;
		
		newCardNumber[index] = multiple;
		

		if(multiple > 9){
			int firstNumber = multiple / 10 % 10; 
			int secondNumber = multiple % 10; 

			int sum = firstNumber + secondNumber;
			newCardNumber[index]= sum;
		}

		totalSumEven += newCardNumber[index];	
	}

	for(int count = 0; count < newCardNumber.length; count++){

		if(count % 2 == 1){
			totalSumOdd += newCardNumber[count];
		}	
	}
		allSum = totalSumEven + totalSumOdd;

		if(allSum % 10 == 0){
			return "Valid";
		}

		else{
			return "Invalid";
		}
   }
}


