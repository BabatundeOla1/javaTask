public class DescendingNumbers101{

   	public static void main(String...args){
	java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.print("Enter first number: ");
	int first_Number = sc.nextInt();

	System.out.print("Enter second number: ");
	int second_Number = sc.nextInt();

	System.out.print("Enter third number: ");
	int third_Number = sc.nextInt();

	DescendingNumbers.displaySortedNumbers(first_Number, second_Number, third_Number);	
		
	}

}