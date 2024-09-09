import java.util.Scanner;

public class LengthOfString{

   public static void main(String...args){

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter String: ");
	String userInput = sc.nextLine();
	
	countLetters(userInput);

	System.out.println(countLetters(userInput));
	
   }



   public static int countLetters(String letters){

	//int lengthOfLetters 

	return letters.length();
   }

}