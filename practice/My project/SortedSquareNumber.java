import java.util.Arrays;

public class SortedSquareNumber{

   public static void main(String [] args){

	int [] numbers = {3,1,2,7,4,6,5};

	int [] squareNum = getSquare(numbers);
	

	System.out.print(Arrays.toString(squareNum));
	
   }


   public static void getsortNumbers(int [] array){

	int lengthOfArray = array.length;

	for(int index = 0; index < lengthOfArray; index++){
		
		for(int counter = 1; counter < lengthOfArray; counter++){

 			if(array[counter - 1] > array[counter]){

				int temp =  array[counter - 1];

				array[counter - 1] = array[counter];

				array[counter] = temp;
			}
		}
	}

	for(int print = 0; print < lengthOfArray; print++)

		System.out.print(array[print]);
	
   }



   public static int[] getSquare(int [] elements){

	int[] square = new int[elements.length];

	for(int count = 0; count < elements.length; count++){
		square[count] = elements[count] * elements[count];

	}
		return square;

   }



}