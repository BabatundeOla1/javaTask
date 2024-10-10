import java.util.Random;

public class SumOfRandomNumbers{

   public static void main(String[] args){

      java.util.Scanner sc = new java.util.Scanner(System.in);

	Random rnd = new Random();

	System.out.print("Enter number between 0 to 100: ");
	int userInput = sc.nextInt();

	int randomNumber = rnd.nextInt(100);
		

	int first_radom_number = randomNumber / 10;

	int second_random_number = randomNumber % 10;

	int sum = first_radom_number + second_random_number;

		if(userInput == sum)

			System.out.print("true");
		else
			System.out.print("false");

}


}