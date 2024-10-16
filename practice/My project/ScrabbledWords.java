public class ScrabbledWords{

   public static void main(String [] args){

	String [] input = {"t", "u", "n", "d", "e"};

	System.out.print(getScrabble(input));
		
   }


   public static String getScrabble(String [] words){

	int len = words.length;

	String[] temp = new String[len];
	
   	for(int count = 1; count < words.length(); count++){

		char letter = words.charAt(count);

		if(words[count] > words[count - 1])

			temp = words[count];

			words[count] = words[count - 1];

			words[count - 1] = temp;

			

	}
		
   }

}