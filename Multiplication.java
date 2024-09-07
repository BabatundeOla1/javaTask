import java.util.Scanner;

public class Multiplication{

   public static void main(String...args){

      Scanner sc = new Scanner(System.in);

	System.out.print("Enter number: ");
	int userInput = sc.nextInt();


	int column = 10;
	
	for (int count = 1; count <= column; count++){

		int result = userInput * count;
		System.out.println(userInput + "*" + count + "=" + (result));
		
	}
	



}


}