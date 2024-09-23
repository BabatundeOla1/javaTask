public class TwoDimensionalArray1{

   public static void main(String [] args){

   java.util.Scanner sc = new java.util.Scanner(System.in);

	int [][] matrix = new int[2][2];

    System.out.println("Enter " + matrix.length + " rows and " +
      matrix[0].length + " columns: ");
	for (int row = 0; row < matrix.length; row++) {
	 for (int column = 0; column < matrix[row].length; column++) {
 		matrix[row][column] = sc.nextInt(); 
		System.out.print(matrix[row][column] + " ");
	 }

	}

    }

}

