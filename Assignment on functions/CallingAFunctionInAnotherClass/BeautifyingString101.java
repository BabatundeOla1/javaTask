public class BeautifyingString101{

public static void main(String...args){

	java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.print("Enter a word: ");
	String userInput = sc.nextLine();

	System.out.println(BeautifyingString.beautifyingString(userInput));

  }
}