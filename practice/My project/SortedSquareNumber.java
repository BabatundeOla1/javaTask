import java.util.Arrays;

public class SortedSquareNumber{

   public static void main(String [] args){

	int [] numbers = {3,4,2,7,4,6,5};

	int [] squareNum = getSquare(numbers);

	getSortedNumbers(squareNum);
	

	System.out.print(Arrays.toString(squareNum));
	
   }

   public static void getSortedNumbers(int [] listOfNumber){

	int lengthOfArray = listOfNumber.length;

	for(int index = 0; index < lengthOfArray; index++){
		
		for(int counter = 1; counter < lengthOfArray; counter++){

 			if(listOfNumber[counter - 1] > listOfNumber[counter]){

				int temp =  listOfNumber[counter - 1];

				listOfNumber[counter - 1] = listOfNumber[counter];

				listOfNumber[counter] = temp;
			}
		}
	}

	for(int print = 0; print < lengthOfArray; print++)

		System.out.print(listOfNumber[print]);
	
   }



   public static int[] getSquare(int [] elements){

	int[] square = new int[elements.length];

	for(int count = 0; count < elements.length; count++){
		square[count] = elements[count] * elements[count];

	}
		return square;

   }



}