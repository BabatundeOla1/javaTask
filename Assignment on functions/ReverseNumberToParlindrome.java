public class ReverseNumberToParlindrome{

   public static void main(String...args){
	
	getPrime(300);
	getParlindrome(getPrime(300));
	

   }
  
	public static int getPrime(int userInput) {

		for(int number = 2; number <= userInput; number++){

		int count = 0; 

		for(int counter = 1; counter <= userInput; counter++){
			if(number % counter == 0)			
				count++;
		}
		

		if(count == 2){			
			System.out.println(number + " ");
		}

		}
   	}

	
	public static boolean getParlindrome(int num) {

		int reverse = 0;

		int theNumberUserInput = num;

			while(num != 0){

		 		reverse = (reverse * 10) + num % 10;

		   		num = num / 10;

				return theNumberUserInput == reverse;
			}
	}	
}

