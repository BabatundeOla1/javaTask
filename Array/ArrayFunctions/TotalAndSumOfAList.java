 public class TotalAndSumOfAList{

    public static void main(String [] args){

	int [] arrayNumber = {3, 2, 5, 1, 4};


	System.out.print("Do while loop: " + getSumUsingDoWhileLoop(arrayNumber));
	
	System.out.println();

	System.out.print("Using Foor loop: " + getSumUsingForLoop(arrayNumber));

	System.out.println();

	System.out.print("Using while loop: " + getSumUsingWhileLoop(arrayNumber));

    }


  public static int getSumUsingForLoop(int [] numbers){

	int totalSum = 0; 
	
	for(int count = 0; count < numbers.length; count++){
		
		totalSum = totalSum + numbers[count];
	}
	return totalSum;
   }

   
   public static int getSumUsingDoWhileLoop(int [] number){
	
	int totalSum = 0;
	int counts = 0;

	do{
	   totalSum = totalSum + number[counts];

	   counts++;
	} while (counts < number.length);
		
		return totalSum;
   }

   
   public static int getSumUsingWhileLoop(int [] number){

	int totalSum = 0;

	int count = 0;

	while(count < number.length-1){
		count++;

	totalSum = totalSum + number[count];
	
	}
		return totalSum;


   }

}