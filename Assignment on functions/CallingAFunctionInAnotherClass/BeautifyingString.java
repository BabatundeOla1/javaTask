public class BeautifyingString{

   public static String beautifyingString(String userInput){
	userInput = addFullStop(userInput);
	
	userInput = addCapitalLetter(userInput);

	return userInput;  
   }


   public static String addFullStop(String userInput){

	if (!userInput.endsWith(".")){
		userInput = userInput + ".";
	} return userInput;
   }

   
   public static String addCapitalLetter(String userInput){

	if (!Character.isUpperCase(userInput.charAt(0))){
		userInput = userInput.substring(0, 1).toUpperCase() + userInput.substring(1);
	} return userInput;

   }

}