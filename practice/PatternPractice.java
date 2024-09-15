// A square pattern

/***public class PatternPractice{

   public static void main(String...args){

	int row = 5;
	int column = 5;

	for(int count = 1; count <= row; count++){
		
		for(int counter = 1; counter <= column; counter++){
			System.out.print("* ");
		}
		System.out.println();
	}


}

}***/


// A right angle triangle 
/***public class PatternPractice{

   public static void main(String...args){

	int row = 5;
	//int column = 5;

	for(int count = 1; count <= row; count++){
		
		for(int counter = 1; counter <= count; counter++){
			System.out.print("* ");
		}
		System.out.println();
	}


}

}***/


//Inverted right angle triangle

/***public class PatternPractice{

   public static void main(String...args){

	int row = 5;

	for(int count = 1; count <= row; count++){
		
		for(int counter = 1; counter <= row-count+1; counter++){
			System.out.print(counter + " ");
		}
		System.out.println();
	}


}

}***/



public class PatternPractice{

   public static void main(String...args){

	int row = 10;
	for(int count = 1; count <= row; count++){
		
		for(int counter = 2 * (row - 1); counter >= row; counter--){
			System.out.print(counter + " ");
		}

			for(int space = 1; space <= row; space++){
				System.out.print(" ");
			}
		System.out.println();
	}


}

}












