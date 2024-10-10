public class BeautifyingString101{

   public static void main(String...args){

	java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.print("Enter a word: ");
	String userWord = sc.nextLine();

	String x = BeautifyingString.getResult(userWord);

	System.out.println(x);

  }
}