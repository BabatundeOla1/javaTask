public class PascalTriangle{

    public static void main(String [] args){
	int row = 8;
	
	int column = 8;

	for(int count = 0; count <= row; count++){

	    for(int space = 2*(row -1); space <= column; space--){
		System.out.print(space + " "); 
	    }
		System.out.println();
	}




}

}