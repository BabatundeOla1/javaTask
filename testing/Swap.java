public class Swap{

   public static int[] getSwap(int [] array){
	
	for(int count = 1; count < array.length; count++){

		if(count % 2 != 0){
			int temp = array[count];

			array[count] = array[count-1];

			array[count-1] = temp;		
	
		}	
	}
	return array;
   }



}