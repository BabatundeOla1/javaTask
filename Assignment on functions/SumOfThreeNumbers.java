public class SumOfThreeNumbers{

   public static void main(String[] args){

      java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.print("Enter number between 0 to 1000: ");
	int userInput = sc.nextInt();

	int sum = 0;

	int first_number = userInput / 100;

	int second_number = (userInput / 10) % 10;

	int third_number = userInput % 10;

	sum = first_number + second_number + third_number;

	System.out.print(sum);


}


}