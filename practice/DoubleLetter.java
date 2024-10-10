public class DoubleLetter{

   public static void main(String [] args){

	String input = "Baba";
	extractDigit(input);
		
   }


   public static boolean extractDigit(String words){

   	for(int count = 0; count < words.length(); count++){

		if(words.charAt(count) == words.charAt(count)){

			return true;
		}


	}

   }

}