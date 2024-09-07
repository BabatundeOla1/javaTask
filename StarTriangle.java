public class StarTriangle{


   public static void main(String...a){


	int row = 4;

	for(int count= 0; count <= row ; count++){

		for(int counter = 1; counter <= count; counter++) {

		   System.out.print("* ");
		}
		System.out.println("*");		
	}


	int row2 = 3;
	for(int count= 0; count <= row2; count++){

		for(int counter = count; counter <= row2-1; counter++) {

		   System.out.print("* ");
		}
		System.out.println("*");		
	}



}

}