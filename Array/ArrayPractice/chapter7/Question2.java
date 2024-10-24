import java.util.Scanner;
import java.util.Arrays;

public class Question2{

   public static void main(String [] args){
	
	//int [] numbers = {1, 2, 3, 4, 5};
	System.out.print(average(1, 3, 4, 5, 6));
   }

   public static int average(int...array){

	int average = 0;
	int sum = 0;

	for(int index = 0; index < array.length; index++){
		sum += array[index];
		average = sum / array.length;
		
	}return average;
   }


}




//prompt user for array input.

/*Scanner sc = new Scanner(System.in);
	System.out.print("How many numbers do you want to enter? ");
	int userinput = sc.nextInt();

	System.out.print("Enter " + userinput + " numbers between 10 - 100, both inclusive: ");
	int [] arrayOfNumbers = new int[userinput];

	for (int i = 0; i < userinput; i++){
		arrayOfNumbers[i] = sc.nextInt();
	}

	System.out.print(Arrays.toString(arrayOfNumbers));*/