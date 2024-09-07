import java.util.Scanner;

import java.util.Random;

public class RandomNumber{

   public static void main(String...args){

	Scanner sc = new Scanner(System.in);

	Random rnd = new Random();	


	System.out.print("Make a guess of number: ");
	int userInput = sc.nextInt();

	int randomNumber = rnd.nextInt(10);
	


	while (userInput != -1 ) {

		
		int newRandomNumber = rnd.nextInt(10);
		//System.out.print("Guess what the number is: ");


		for (int count = 1; count <= 2; count++) {
		
			System.out.println(randomNumber);


			if(userInput == randomNumber) {
				System.out.println("WELDONE YOU GUESSED RIGHT!");
				break;
			}

			if(userInput > randomNumber) {
				System.out.println("NUMBER IS TOO HIGH, TRY AGAIN!");
				
			}

			if(userInput < randomNumber) {
				System.out.println("NUMBER IS TOO LOW, TRY AGAIN!");
				
			}
		
			System.out.print("Try guessing again: ");
	     		int userInput1 = sc.nextInt();	
	
		}
		
		System.out.print("QUIT!!");
		//int userInput2 = sc.nextInt();

	}	

	main();
   }


} 