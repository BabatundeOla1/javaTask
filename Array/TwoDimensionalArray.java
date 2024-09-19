public class TwoDimensionalArray{

   public static void main(String [] args){

char [][] matrix = {{'x','o','x'}, {'o','o','o',}, {'x','o','x'}};
 
	for(int row = 0; row < matrix.length; row++){

		for(int column = 0; column < matrix.length; column++){
			System.out.print(matrix[row][column] + " ");
		}

		System.out.println();
	}
 

}

}
