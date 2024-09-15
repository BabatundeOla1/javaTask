import java.util.Random;

public class GuessGame{

   public static void main(String...args){

   java.util.Scanner sc = new java.util.Scanner(System.in);

   java.util.Random rnd = new java.util.Random();

	System.out.print("Enter a guess number between 1 to 1000: ");
	int userInput = sc.nextInt();

	int randomNumber = rnd.nextInt(1000);
	System.out.println(randomNumber);

	if (userInput > randomNumber){
		System.out.println("Too High! Try Again!!");
	}

	if (randomNumber > userInput){
		System.out.println("Too Low! Try Again!!");
	}

	
	while (userInput != -1){

		System.out.print("Enter guess number again: ");
		int userinput = sc.nextInt();	

		int guessNumber = rnd.nextInt(1000);
		System.out.println(guessNumber);

		if (userinput > guessNumber){
			System.out.println("Too High! Try Again!!");
		}

		if (userinput < guessNumber){
			System.out.println("Too Low! Try Again!!");
		}	 

		if (userinput == guessNumber){
			System.out.println("You Guessed right. Congratulation!!");
		}

		if (userinput == -1){

			break;
		}

	}
   }

}