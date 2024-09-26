import java.util.Random;

public class RandomGame{

   public static void main(String [] args){

	java.util.Scanner sc = new java.util.Scanner(System.in);
	
	Random rand = new Random();

	System.out.print("How may times do you want to guess? ");
	int userInput = sc.nextInt();

	for(int count = 0; count < userInput; count++)

		System.out.print("Guess the random number: ");
		int userInput1 = sc.nextInt();
	
		int randNumber = rand.nextInt(10);
	

	if (userInput1 == randNumber)
		System.out.print("Congratulations!!");

	else
		System.out.print("Try Again!");

	
	












	/***if(userInput == randNum1){
		System.out.println("You guessed the number right!");
	}

	else {
		System.out.println("Try again!\nRandom number is: " +  randNum1);
	}***/
	


   }

}