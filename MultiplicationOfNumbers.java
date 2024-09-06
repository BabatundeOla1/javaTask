public class MultiplicationOfNumbers{

   public static void main(String...args){


	int row = 9;
	int column =15;


	for (int count = 1; count <= row; count++){

		for(int counts = 1; counts <= column; counts++){
		      System.out.printf("%d * %d = %d\t",  counts,count, count * counts);	
		}

	    System.out.println(" ");
	}

    }

}