public class DivisibleNumber2{

   public static void main(String...args){

	int counter = 0;

	for(int number = 100; number <= 1000; number = number + 1){
 
	   if(number % 3 == 0 && number % 4 == 0){

		System.out.print(number + " ");
		counter++;

		if(counter == 10){
		     System.out.println();
		     counter = 0;
		}

	
	    }


	}

   }


}