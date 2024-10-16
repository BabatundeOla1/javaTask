import java.util.Arrays;

public class FindIndicesSum2{
   
   public static void main(String [] args){
	
	int [] array = {3, 9, 7, 2, 1, 6};
	
	System.out.print(Arrays.toString(getSumIndices(array)));
		
   }

   public static int[] getSumIndices(int [] list){
	
	int frequency = 0;

	int sum = 15;

	int [] sumIndices = new int[2];

	for(int count = 0; count < list.length; count++){

		for(int counter = 1; counter < list.length; counter++){
			
			if(list[count] + list[counter] == sum)

				sumIndices[0] = counter;
				sumIndices [1] = count;

				}
	}
		return sumIndices;
   }

}