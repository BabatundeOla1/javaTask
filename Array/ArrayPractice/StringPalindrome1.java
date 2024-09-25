public class StringPalindrome1{

    public static void main(String [] args){

	String [] words = new String[]{"r", "a", "d", "a", "r"};
	getStringRevers(words);

    }


    public static void getStringRevers(String [] letters){
	
	String reverse = "";

	for(int count = letters.length-1; count >= 0; count--){
	
		reverse = letters[count];
	
		System.out.print(reverse + " ");
	}

	/***System.out.println();

	if(letters.equals(reverse)){
		System.out.println("it is a parlindrome");
	}

	else {
		System.out.println("it is not a parlindrome");
	}***/

    }

}