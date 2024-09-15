public class RandomNumber{

   public static void main(String...args){

	java.util.Scanner sc = new java.util.Scanner(System.in);
	
	System.out.print("Guess a number between 1 and 1000: ");
	int guess = sc.nextInt();

	while(guess != randomNumber) {
	
	System.out.print("Guess an number between 1 and 1000: ");
	int userInput = sc.nextInt();

	getRandomNumber(guess);
   }


    public static void getRandomNumber(int userInput){

	int randomNumber = (int)(Math.random() * 1000);	

	if(userInput == randomNumber) {
		System.out.println("You guessed right!!");
	}

	if(userInput > randomNumber) {
		System.out.println("Too High! TRY AGAIN!!");
	}

	if(userInput < randomNumber){
		System.out.println("Too low! TRY AGAIN!!");
	}
    }
}