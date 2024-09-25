public class StringPalindrome1{

    public static void main(String [] args){

	String [] words = new String[]{"r", "a", "d", "a", "r"};
	getStringRevers(words);

    }


    public static String[] getStringRevers(String [] letters){
	
	String[] newWords = new String[letters.length];

	String reverse = "";

	for(int count = newWords.length-1; count < 0; count--){
	
		reverse = letters[count];
	}

		return reverse;
    }

}