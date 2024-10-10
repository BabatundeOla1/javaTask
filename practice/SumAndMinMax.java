import java.util.Arrays;

public class SumAndMinMax{

   public static void main(String [] args){

	int []  numbers = {5, 1, 8, 6, 11};

	int []  sums = new int[numbers.length];

	int store = 0;

	for(int count = 0; count < numbers.length; count++){

		store = numbers[count];

		int sum = 0;
		
		for(int index = 0; index < numbers.length; index++){

			if(numbers [index] != store){

				sum = sum + numbers[index];

			}sums[count] = sum;
		
		}

	}
		System.out.print(Arrays.toString(sums));
   }






}