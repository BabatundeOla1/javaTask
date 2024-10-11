public class TriangleWithStar{

   public static void main(String [] args){

	int number = 7;
	
	for(int column = 0; column < number; column++){

		for(int row = 1; row < column; row++){
			
			
			System.out.print(row + " ");
		}
		
		System.out.println();
	}

   }

}