public class RectanglePattern{

   public static void main(String...args){

   java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.print("Enter number of row: ");
	int userInput = sc.nextInt();

	System.out.print("Enter number of column: ");
	int userInput1 = sc.nextInt();

	rectanglePattern(userInput, userInput1);
    }


   public static void rectanglePattern(int row, int column){

	for(int count = 1; count <= row; count++){

		for(int number = 1; number <= column; number++){
			System.out.print("*");
		}

		System.out.println();
	}

   }

}