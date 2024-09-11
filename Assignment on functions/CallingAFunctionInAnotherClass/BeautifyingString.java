public class BeautifyingString{

   public static String beautifyingString(String word){
	word = addFullStop(word);
	
	word = addCapitalLetter(word);

	return word;  
   }


   public static String addFullStop(String word){

	if (!word.endsWith(".")){
		word = word + ".";
	} return word;
   }

   
   public static String addCapitalLetter(String word){

	if (!Character.isUpperCase(word.charAt(0))){
		word = word.substring(0, 1).toUpperCase() + word.substring(1);
	} return word;

   }

}