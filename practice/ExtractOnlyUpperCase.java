public class ExtractOnlyUpperCase{

   public static void main(String [] args){

	String input = "E123DBabNatuA16U5hdkBjaretAndeT12";
	extractDigit(input);
		
   }


   public static void extractDigit(String words){

	String newWords = "";
	
   	for(int count = 0; count < words.length(); count++){

		char letter = words.charAt(count);

		if(Character.isUpperCase(letter))

			newWords = newWords + letter + " ";

			

	}
		System.out.print(newWords + " ");
   }

}