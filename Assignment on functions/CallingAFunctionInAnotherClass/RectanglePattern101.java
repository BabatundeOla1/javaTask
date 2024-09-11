public class RectanglePattern101{

   public static void main(String...args){

   java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.print("Enter number of row: ");
	int userInput = sc.nextInt();

	System.out.print("Enter number of column: ");
	int userInput1 = sc.nextInt();

	RectanglePattern.rectanglePattern(userInput, userInput1);
    }

}