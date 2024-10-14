public class Triangles{

   public static void main(String [] args){

	int row = 6;

	int column = 6;

// Inverted Right Angle Triangle
	for(int count = 0; count < row; count++){
		for(int star = count; star < row; star++){
			System.out.print("*");
		}
		System.out.println();
	}

	System.out.println();

//Right Angle Triangle
	for(int count = 0; count < row; count++){
		for(int star = 0; star <= count; star++){
			System.out.print("*");
		}
		System.out.println();
	}

	System.out.println();

//left Angle Triangle
	for(int count = 0; count < row; count++){

		for(int space = count; space < row; space++){
			System.out.print(" ");
		}

		for(int star = 0; star <= count; star++){					System.out.print("*");
		}
		System.out.println();
	}

	System.out.println();

//Inverted Left Triangle

	for(int count = 0; count < row; count++){

		for(int space = 0; space <= count; space++){
			System.out.print(" ");
		}

		for(int star = row-1; star >= count; star--){					System.out.print("*");
		}
		System.out.println();
	}


   }

}