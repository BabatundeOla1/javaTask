public class ScrabbledWords{

   public static void main(String [] args){

	String input = "BABATUNDE";
	extractDigit(input);
		
   }


   public static void getScrabble(String words){

	String temp ;
	
   	for(int count = 1; count < words.length(); count++){

		//char letter = words.charAt(count);

		if(words(count) > words(count - 1))

			temp = words(count);

			words(count) = words(count - 1);

			words(count - 1) = temp;

			

	}
		System.out.print(words + " ");
   }

}