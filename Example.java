import java.util.Scanner;

public class Example {




  public static void main(String [] args){

    Scanner sc = new Scanner (System.in);

    System.out.print("Enter first integer: ");
    int userInput = sc.nextInt();
    
    System.out.print("Enter second integer: ");
    int userInput1 = sc.nextInt();

    int result = subtraction(userInput, userInput1);
    System.out.println("Result: " + result);
  }




    public static int subtraction(int first, int second){
	return first - second;
    }

}