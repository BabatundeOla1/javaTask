public class StringPalindrome{

    public static void main(String [] args){

	String [] words = new String[]{"r", "a", "d", "a", "r"};


	System.out.print(getStringRevers(words));

    }


    public static String getStringRevers(String [] letters){
	
	//String[] newWords = new String[letters.length];

	String reverse = "";

	for(int count = letters.length-1; count < 0; count--){
	
		reverse = letters[count];
	}

		return reverse;
    }

}