public class CreditCardValidation{

   public static void main(String [] args){

   java.util.Scanner sc = new java.util.Scanner(System.in);
 
	System.out.print("Enter Card Number: ");
	String userCard = sc.nextLine();
	
	System.out.println(" ");

	System.out.println("************************************");

	System.out.println("Credit Card Type: " + validateCard(userCard));
	System.out.println("Credit Card Number: " +  userCard);
	System.out.println("Credit Card Digit Length: " +  userCard.length());
	System.out.println("Card Type: " + checkValidity(userCard));

	System.out.print("************************************");
   }


  public static String validateCard(String theNumber){

	if(theNumber.length() <= 13 || theNumber.length() > 16){
		return "Invalid Card Length";
	}

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
		return "America Express";
	}

	else 
		return "Invalid Card";

   }


   public static String checkValidity(String cardNumber){

	int sumOdd = 0, sumEven = 0, totalSum = 0;
	
	int size = cardNumber.length();

        int[] cardDigits = new int[size];

        for (int index = size - 1; index >= 0; index--) {

            cardDigits[index] = Character.getNumericValue(cardNumber.charAt(index));

            if ((size - index) % 2 == 0) {

                int doubled = cardDigits[index] * 2;

                if (doubled > 9) {

                    doubled = (doubled / 10) + (doubled % 10);
                }
                sumEven += doubled;		
            } 
		else {
              		sumOdd += cardDigits[index];
            	}
        }

        totalSum = sumEven + sumOdd;

        return (totalSum % 10 == 0) ? "Valid" : "Invalid";
   }
}
