public class TotalOfAList{

    public static void main(String [] args){

	int [] arrayNumber = {3, 2, 5, 1, 4};
	getSum(arrayNumber);

    }


   public static void getSum(int [] numbers){

	int totalSum = 0; 
	
	for(int count = 0; count < numbers.length; count++){
		
		totalSum = totalSum + numbers[count];

	System.out.println(totalSum);
	}
	
   }

}