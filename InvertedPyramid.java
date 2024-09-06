public class InvertedPyramid{

   public static void main(String...args){

	int row = 7;
	int column = 13;


	for(int count = 1; count <= column; count++){

		for(int counter = 1; counter <= column -2; counter++){

			System.out.print(counter);
		}		

	      System.out.print(count + " ");
	}



   }

}