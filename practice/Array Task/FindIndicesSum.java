import java.util.Arrays;

public class FindIndicesSum{
   
   public static void main(String [] args){
	
	int [] array = {2, 8, 1, 9, 6};
	int sum = 15;

	int [] sumIndices = new int[2];

	for(int count = 0; count < array.length; count++){

		for(int counter = 1; counter < array.length; counter++){
			
			if(array[count] + array[counter] == sum)
				sumIndices[0] = counter;
				sumIndices[1] = count;
			}
	}
	
	System.out.print(Arrays.toString(sumIndices));
   }   

}




