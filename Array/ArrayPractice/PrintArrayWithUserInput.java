import java.util.Arrays;

import java.util.Scanner;

public class PrintArrayWithUserInput{

   public static void main(String [] arg){

   Scanner input = new Scanner(System.in);

	System.out.print("How many numbers do you want to enter? ");
	int userInput = input.nextInt();

	while(userInput <= 0 && userInput >= 20){

	    System.out.print("Try again. Enter length of an array: ");
	    userInput = input.nextInt();
	}

	int [] arrays = new int[userInput];

	getUserInput(arrays);

	for(int count = 0; count < arrays.length; count++){
	    System.out.print(getUserInput(arrays));
	}
   }


   public static int getUserInput(int [] numbers){

	Scanner input = new Scanner(System.in);
	int number = 0;
	for(int count = 0; count < numbers.length; count++){
		numbers[count] =input.nextInt();
		number =  numbers[count];
	}
		return number;

   }

}