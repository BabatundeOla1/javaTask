import java.util.Arrays;

public class CommonPrefix{

   public static void main(){

	String[] words = {"flower", "flood", "flow", "flight"};

   	char [] letters = new char [0];

	for(int count = 0; count < words.length; count++){
		
		letters = addToArray(letters, words[count].toCharArray());

	}

		System.out.print(Arrays.toString(letters));
   }

}