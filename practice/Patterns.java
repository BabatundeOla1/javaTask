public class Patterns{

    public static void main(String...args){

	java.util.Scanner sc = new java.util.Scanner(System.in);
	
	System.out.print("Enter number of rows: ");
	int rows = sc.nextInt();

	for(int count = 1; count<=rows; count ++){

		for(int counts = 10; counts >= 0; counts--){
			System.out.print("*");
		}	
		System.out.println();

	}

    }

}