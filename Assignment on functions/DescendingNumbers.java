public class DescendingNumbers{

   	public static void main(String...args){
	java.util.Scanner sc = new java.util.Scanner(System.in);

	displaySortedNumbers(sc.nextInt(), sc.nextInt(), sc.nextInt());	
		
	}

	public static void displaySortedNumbers(int firstNumber, int secondNumber, int thirdNumber){

		int highestNum = firstNumber;
		int secondHighest = firstNumber;
		int smallestNum = firstNumber;
		int sum = 0;

		if(firstNumber > secondNumber && firstNumber > thirdNumber)
			highestNum = firstNumber;

		if(secondNumber > firstNumber && secondNumber > thirdNumber)
			highestNum = secondNumber;

		if(thirdNumber > firstNumber && thirdNumber > secondNumber)
			highestNum = thirdNumber;


		if(firstNumber < secondNumber && firstNumber < thirdNumber)
			smallestNum = firstNumber;

		if(secondNumber < firstNumber && secondNumber < thirdNumber)
			smallestNum = secondNumber;

		if(thirdNumber < firstNumber && thirdNumber < secondNumber)
			smallestNum = thirdNumber;

		sum = firstNumber + secondNumber + thirdNumber;

		secondHighest = sum - highestNum - smallestNum;

		System.out.printf("%d %d %d", highestNum, secondHighest, smallestNum);
	} 

}
