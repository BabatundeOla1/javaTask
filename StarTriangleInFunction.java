import java.util.Scanner;

public class StarTriangleInFunction{

  public static void main(String...a){
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int userInput = scan.nextInt();
	number(userInput);
  }



   public static void number(int Size){
		topPattern(Size);
		bottomPattern(Size);
   }




   public static void topPattern(int Size){
	for(int count= 0; count <= Size ; count++){

		for(int counter = 1; counter <= count; counter++) {

		   System.out.print("* ");
		}
		System.out.println("*");		
	}
   }


   public static void bottomPattern(int Size){

	for(int count= 1; count <= Size; count++){

		for(int counter = count; counter <= Size-1; counter++) {

		   System.out.print("* ");
		}
		System.out.println("*");		
	}
   }
 

}