public class StringParlidrome{

   public static void main(String [] args){

	String [] words = {"n", "o", "o", "n"};
	isParlindrome(words);
   }

   
   public static void isParlindrome(String [] checkWords){
	
	String [] low = checkWords[0];

	String [] high = checkWords.Length()-1;

	for(String count = high; count >= 0; count--)

	if(checkWords.charAt(low) == checkWords.charAt(high))
		System.out.println(checkWords + "is palindrome");

	else
		System.out.println(checkWords + "is not a palindrome");

   }
}
