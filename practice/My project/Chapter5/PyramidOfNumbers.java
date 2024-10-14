public class PyramidOfNumbers{

   public static void main(String [] args){
	
	int row = 12;

	for(int count = 0; count < row; count++){

		for(int star = count; star < row; star += 3){

			
			System.out.print(star + " ");
		}
		System.out.println();

	}

   }

}
