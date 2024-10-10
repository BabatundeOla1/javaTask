public class CapitalizeFirstLetter{

   public static void main(String [] args){

	String [] sentence = {stupid, is, as, stupid, does};

		convertToTittleCase(sentence);

   }

   public static String convertToTittleCase(String sentences){
	
	String [] tokens = sentences.split(" ");
	
	String word ;

	String firstLetter ;

	String toUpperCase ;



		for(int index = 0; index < tokens.length; index++){
		
			word = tokens[index];

			firstLetter = word.charAt[0];

			if(!firstLetter.isupperCase){

				toUpperCase = firstLetter.toupperCase;
			}
		}

	
	return toUpperCase;

   }


}