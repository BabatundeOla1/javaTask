public class StringParlidrome{

   public static void main(String [] args){

	String [] words = {"n", "o", "o", "n"};
	isParlindrome(words);
   }

   
   public static void isParlindrome(String [] checkWords){
	
	String [] low = checkWords[0];

	String [] high = checkWords.Length()-1;


	while(low < high){
		if(checkWords.CharAt(low) != checkWords.CharAt(high))
						
			System.out.println(checkWords + "is palindrome");

	else
		System.out.println(checkWords + "is not a palindrome");

   }
}
}