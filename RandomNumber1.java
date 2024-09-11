public class RandomNumber{

   public static void main(String...args){

	java.util.Scanner sc = new java.util.Scanner(System.in);
	
	System.out.print("Enter your guess: ");
	int userInput = sc.nextInt();

	int randomNumber = rnd.nextInt(1000);

	if(userInput == randomNumber){
		System.out.println("You guessed right!!");
	}

	elif(userInput > randomNumber){
		System.out.println(Too High! TRY AGAIN!!)
	}

	else(userInput < randomNumber){
		System.out.println(Too low! TRY AGAIN!!)
	}