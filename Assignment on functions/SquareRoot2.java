import java.util.Scanner;

public class SquareRoot2{

  public static void main(String...args){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a positive double number: ");
	double userInput = sc.nextDouble(); 
	isSquareRoot(userInput);

	System.out.println(isSquareRoot(userInput));
}


	public static double isSquareRoot(double number){

		double userNumber = number;
		double squareRoot = (userNumber + 1) / 2;

		while(squareRoot < userNumber){

			userNumber = squareRoot;
			squareRoot = (userNumber + number / userNumber) / 2;
		}

		return squareRoot;
	}
  
}