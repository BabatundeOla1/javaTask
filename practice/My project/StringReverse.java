public class StringReverse{

   public static void main(String [] args){

	String sentence = "Babatunde";

	String reversedSentences = "";

	for(int count = 0; count < sentence.length(); count++){

	   reversedSentences = sentence.charAt(count) + reversedSentences;
	
	}

	System.out.print("Reversed Words: " + reversedSentences);

   }

   public static void getReverse(String sen){

	Char [] words = sen.toCharArray();

	int lengthOfWords = words.length - 1;


	for(int count = lengthOfWords; count >= 0; count--){

		System.out.print(words[count] + " ");

	}
   }
}











