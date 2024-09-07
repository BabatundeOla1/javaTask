import java.util.Scanner;

public class Kata{

	public static void main(String... args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter an integer: ");
		int userInput = scanner.nextInt();
		System.out.println(isEven(userInput));

		System.out.print("Enter an integer: ");
		int userInput1 = scanner.nextInt();
		System.out.println(isPrime(userInput1));

		System.out.print("Enter an integer: ");
		int userInput2 = scanner.nextInt();
		System.out.println(factorOf(userInput2)+" is the factor");

		System.out.print("Enter an integer: ");
		int userInput3 = scanner.nextInt();
		System.out.println(isSquare(userInput3));
	
		System.out.print("Enter an integer: ");
		int userInput4 = scanner.nextInt();
		System.out.println(squareOf(userInput4)+ " is the square");
	
		/*System.out.print("Enter an integer: ");
		int userInput5 = scanner.nextInt();
		System.out.println(factorialOf(userInput5));*/


		System.out.print("Enter the first integer: ");
		int firstInteger = scanner.nextInt();
		System.out.print("Enter the second integer: ");
		int secondinteger = scanner.nextInt();
		System.out.println(subtractInteger(firstInteger , secondinteger ));


		System.out.print("Enter the first integer: ");
		int thirdinteger = scanner.nextInt();
		System.out.print("Enter the second integer: ");
		int fourthinteger = scanner.nextInt();
		System.out.println(division(thirdinteger , fourthinteger ));


		System.out.print("Enter the five integers: ");
		int palindromeTest = scanner.nextInt();
		System.out.println(isPalindrome(palindromeTest));
	
	}



	public static boolean isEven(int number){
	
		if (number % 2 == 0 ? true : false);	

	}




	public static boolean isPrime(int prime){
		int counter = 0;
		for(int count = 1;count <= prime; count= count + 1) {
			if(prime % count == 0) {
				counter++;		
			}   		
		} return counter == 2;
	}





	public static int subtractInteger(int minus, int num){
		
		return minus > num ? minus - num: num - minus;
	}





	public static int division(int thirdinteger , int fourthinteger ){
	
		int quotient = thirdinteger / fourthinteger;
	
			return quotient;

	}




	public static int factorOf(int factor){

			int counter = 0;

		for(int count = 1;count <= factor; count= count + 1) {

			if(factor % count == 0) {

				counter++;	
			}	

		} return counter;

	}



	public static boolean isSquare(double number){

		double square = Math.sqrt(number);

		if(number % square == 0){

			return true;
		}

		return false;
	}




	public static boolean isPalindrome(int palindromeTest){

		int firstNumber = palindromeTest / 10000;

		int toGetSecondNumber = palindromeTest / 10;

		int secondNumber = toGetSecondNumber % 10;

		int toGetThirdNumber = palindromeTest / 100;

		int thirdNumber = toGetThirdNumber % 100;
	
		int toGetFourthNumber  = palindromeTest / 10;

		int fourthNumber  = toGetFourthNumber  % 10;

		int fifthNumber = palindromeTest % 10;

			return firstNumber == fifthNumber;
		}

	}



	public static long factorialOf(int factor){
	
			int factorial = 1;

		for(int count = factor; count<= 1; count--) {

			factor = factorial * count;
		
		}

	}




	public static int squareOf(int number){

		int squared = Math.sqrt(number);

		if (squared * squared == number){ 
		
			System.out.print("true"); 
		}
			return squared;
	}

	
}

