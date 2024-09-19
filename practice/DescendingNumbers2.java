public class DescendingNumbers3{

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
			return highestNum;

		if(secondNumber > firstNumber && secondNumber > thirdNumber)
			highestNum = secondNumber;
			return highestNum;

		if(thirdNumber > firstNumber && thirdNumber > secondNumber)
			highestNum = thirdNumber;
			return highestNum;

		if(firstNumber < secondNumber && firstNumber < thirdNumber)
			smallestNum = firstNumber;
			return smallestNum;

		if(secondNumber < firstNumber && secondNumber < thirdNumber)
			smallestNum = secondNumber;
			return smallestNum;

		if(thirdNumber < firstNumber && thirdNumber < secondNumber)
			smallestNum = thirdNumber;
			return smallestNum;

		sum = firstNumber + secondNumber + thirdNumber;

		secondHighest = sum - highestNum - smallestNum;
		
		return highestNum secondHighest smallestNum;

		
	} 

}
