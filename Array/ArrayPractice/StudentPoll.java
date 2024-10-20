public class StudentPoll{

   public static void main(String [] args){

	int [] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};


	int [] frequency = new int[6];

	for(int count = 0; count < responses.length-1; count++){
		
		for(int index = 1; index < responses.length-1; index++){
	
			if(responses[count] == responses[index]){
				++frequency[responses[count]];
			}
		
		}
	}

	System.out.println("rating\tfrequency");


	for(int rating = 1; rating < frequency.length; rating++){

	System.out.println(frequency[rating]);

	}
   }


} 