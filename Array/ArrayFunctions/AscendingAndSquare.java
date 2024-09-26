import java.util.Arrays;

public class AscendingAndSquare{

   public static void main(String [] args){

	int [] numbers = {3,1,2,7,4,6,5};
	int [] squareNum = getSquare(numbers);
	Arrays.sort(squareNum);

	System.out.println(Arrays.toString(squareNum));
	
   }

	
   public static int[] getSquare(int [] elements){

	int[] square = new int[elements.length];

	for(int count = 0; count < elements.length; count++){
		square[count] = elements[count] * elements[count];

	}
		return square;

   }



}