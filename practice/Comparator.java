import java.util.Scanner;

public class Comparator{

   public static void main(String...args){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter two numbers: ");
	int userInput = sc.nextInt();

	int firstNumber = userInput / 10;
	int secondNumber = userInput % 10;

	
	if(firstNumber == secondNumber){
		System.out.println(0);
	}

	
	if(firstNumber > secondNumber){
		System.out.println(1);
	}

	
	if(firstNumber < secondNumber) {

		System.out.println(-1);
	}

	if (userInput < 0) {
            System.out.println("Invalid input: The number should not be negative.");
	}
   }

} 