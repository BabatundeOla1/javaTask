import java.util.Arrays;

public class FindTheLargestProduct{
	
    public static void main(String [] args){
	int [] array = {8, 6, 4, 7, 10};

	int [] numbers = getLargest(array);

	System.out.print(Arrays.toString(numbers));
    }

    public static int [] getLargest(int [] numbers){

	int [] newNumbers = new int[2];

	int largest = numbers[0];

	int secondLargest = numbers[0];

	for(int count = 0; count < numbers.length; count++){

		if(numbers[count] > largest){
			largest = numbers[count];
		}
	}

	for(int counter = 0; counter < numbers.length; counter++){
		if(numbers[counter] > secondLargest && numbers[counter] < largest){
			secondLargest = numbers[counter];
		}
	}

			newNumbers[1] = secondLargest;
			newNumbers[0] = largest;
		
		return newNumbers;
    }    

}
