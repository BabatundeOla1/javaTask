import java.util.Scanner;

public class MultipleOfFirstAndSecondNumber {

public static void main (String [] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter seconf number: ");
	int secondNumber = input.nextInt();

	int Firstnumber = firstNumber * firstNumber;

	int count=0;
	for (;count<secondNumber-2;) {
	   Firstnumber = Firstnumber*firstNumber;
		count++;
	}
	
	System.out.print(Firstnumber);



	} 

}