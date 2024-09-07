import java.util.Scanner;

import java.util.Random;

public class RandomNumber1{

   public static void main(String...args){

	Scanner sc = new Scanner(System.in);
	int randomNumber = rnd.nextInt(10);	
	int userInput = 0;


	do{
		System.out.print("Make a guess of number: ");
		userInput = sc.nextInt();

		if(userInput == randomNumber) {System.out.println("WELDONE YOU GUESSED RIGHT!");}

		if(userInput > randomNumber) {System.out.println("NUMBER IS TOO HIGH, TRY AGAIN!");}

		if(userInput < randomNumber) {System.out.println("NUMBER IS TOO LOW, TRY AGAIN!");}

	}

	while (userInput != randomNumber);

	
   }
	
	public static int generatedRandomNumber(){
		int newGenerated = rnd.nextInt(10);
		return newGenerated;
     }

}