public class Counting {
 public static void main( String[] args ) {
    java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.print("Enter numbers: ");
	int userInput = sc.nextInt();

	int sum = 0;

	int first_digit = userInput / 1000;

	int second_digit = userInput / 100 % 10;

	int third_digit = userInput / 10 % 10;

	int fourth_digit = userInput % 10;

	int minimum = first_digit;

	int maximum = first_digit;

	if(second_digit > maximum)
		maximum = second_digit;
		
	if(third_digit > maximum)
		maximum = third_digit;

	if(fourth_digit > maximum)
		maximum = fourth_digit;

	
	
	if(second_digit < minimum)
		minimum = second_digit;
		
	if(third_digit < minimum)
		minimum = third_digit;

	if(fourth_digit < minimum)
		minimum = fourth_digit;

	System.out.print(minimum);

	System.out.print(maximum);		

       } 
 } 