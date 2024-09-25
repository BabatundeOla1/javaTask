public class TotalAndSumOfAList{

    public static void main(String [] args){

	int [] arrayNumber = {3, 2, 5, 1, 4};

	getSumUsingForLoop(arrayNumber);  

	getSumUsingDoWhileLoop(arrayNumber);

	getSumUsingWhileLoop(arrayNumber);

    }


   public static void getSumUsingForLoop(int [] numbers){

	int totalSum = 0; 
	
	for(int count = 0; count < numbers.length; count++){
		
		totalSum = totalSum + numbers[count];
		
	        System.out.print(totalSum + " ");

	}	
	
   }

	



   public static void getSumUsingDoWhileLoop(int [] number){
	
	int totalSum = 0;
	int counts = 0;
	do{
	   System.out.print(totalSum + " ");

	   totalSum = totalSum + number[counts];

	   counts++;
	} while (counts < number.length);


   }

   

   public static void getSumUsingWhileLoop(int [] number){

	int totalSum = 0;

	int count = 0;

	while(count < number.length){
		count++;

	totalSum = totalSum + number[count];

	 System.out.print(totalSum + " ");
	
	}



   }





}