import java.util.Scanner;

public class SumOfTwoNumbers{

   public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	   
	int terminate = 0;	

	do
	{
	System.out.print("Enter first number: ");
	int FirstNumber = input.nextInt();

	System.out.print("Enter second number: ");
	int SecondNumber = input.nextInt();

	int sum = FirstNumber + SecondNumber;

	System.out.println("Sum="+sum);

	System.out.println("Enter 0 to terminate or 1 to repeat the process");
	int choose = input.nextInt();
																
 	} 
	

	while (terminate!= 0); { 
		System.out.println("Program Terminated");
	}		



    }

}