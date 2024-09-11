public class PrimeNumber{

   public static void main(String...args){
	
	java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.println("Enter numbers");
	int userInput = sc.nextInt();
	
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
}
