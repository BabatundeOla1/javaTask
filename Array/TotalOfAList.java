public class TotalOfAList{

    public static void main(String [] args){

	int [] arrayNumber = {3, 2, 5, 1, 4};
	

	System.out.println(getRunningTotal(arrayNumber));

    }


   public static int [] getRunningTotal(int [] numbers){

	int [] totalSum = 0; 
	
	for(int count = 0; count < numbers.length; count++){
		
		totalSum = totalSum + numbers[count];

	
	}return totalSum;
	
   }

}