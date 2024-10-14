public class SumOfIntegers{

   public static void main(String [] args){
	
	int sum = 0;

	for(int count = 1; count <= 30; count++)

	if(count % 3 == 0){
		sum += count;
	}

	System.out.println(sum);
	
   }


}