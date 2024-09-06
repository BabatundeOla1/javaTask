import java.util.Scanner;

public class rightAngledTriangle{

    public static void main(String...args){
      
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter length of a base triangle from 1 - 10: ");
      int userInput = sc.nextInt();

	int length = userInput;

	if(userInput > 10){
	    System.out.print("Invalid Number!!");
	}
   
	for(int count = 1; count <= length; count++){

		for(int counter = 1; counter <= count-1; counter++){
			System.out.print("*");
		}
	    System.out.println("* ");	
	}

    }

}