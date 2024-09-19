public class CallingMaxMethod{

   public static void main(String [] args){

	java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.println("Enter the first number: ");
	int firstNum = sc.nextInt();

	System.out.println("Enter the second number: ");
	int secondNum = sc.nextInt();

	int Maximum = MaxNuminFunction.max(firstNum, secondNum);
	System.out.println("maximum num between " + "firstNum" + " and " + secondNum + "is" + Maximum);
   }
}