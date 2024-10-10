public class SortedNumber{

   public static void main(String [] args){

	java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.print("Enter number for pentagonal number: ");
	double number = sc.nextDouble();

	System.out.print("Enter number for pentagonal number: ");
	double number2 = sc.nextDouble();

	System.out.print("Enter number for pentagonal number: ");
	double number3 = sc.nextDouble();

	displaySortedNumbers(number, number2, number3);
   }

   public static void displaySortedNumbers(double firstNumber, double secondNumber, double thirdNumber){

	double largestNumber = firstNumber;

	double smallestNumber = firstNumber;

	double secondLargest = 0;

	double sum = 0;


	if(firstNumber > secondNumber && firstNumber > thirdNumber) 
		largestNumber = firstNumber;

	if(secondNumber > firstNumber && secondNumber > thirdNumber) 
		largestNumber = secondNumber;

	if(thirdNumber > firstNumber && thirdNumber > secondNumber) 
		largestNumber = thirdNumber;


	if(firstNumber < secondNumber && firstNumber < thirdNumber) 
		smallestNumber = firstNumber;

	if(secondNumber < firstNumber && secondNumber < thirdNumber) 
		smallestNumber = secondNumber;

	if(thirdNumber < firstNumber && thirdNumber < secondNumber) 
		smallestNumber = thirdNumber;

	
	sum = firstNumber + secondNumber + thirdNumber;
	
	secondLargest = sum - largestNumber - smallestNumber;

	System.out.print(largestNumber + "," + secondLargest + "," + smallestNumber);

   }
}