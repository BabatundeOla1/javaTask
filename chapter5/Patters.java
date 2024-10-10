public class Patters {
   public static void main(String[] args) {
 
	int row = 10;

	int column = 10;

	for(int count = 1; count <= row; count++){

		for(int counter = 1; counter <= count; counter++){
			System.out.print("*");
		}
		System.out.println();
	}

	System.out.println();
	
	for(int count = row; count >= 1; count--){

		for(int counter = count; counter >= 1; counter--){
			System.out.print("*");
		}
		System.out.println();
	}

	System.out.println(); 

	for(int count = 1; count <= row; count++){

		for(int space = count; space <= row - 1; space++){
				System.out.print(" ");			
		}
		
		for(int counter = 1; counter <= count; counter++){
			System.out.print("*");
		}
 
		System.out.println();
	}   
 	
 } 

}
