public class DuplicateWords{

   public static void main(String [] args){

	String[] words = {"come", "go", "is", "go", "is", "ji", "come"};

	getDuplicate(words);
	

   }

   public static void getDuplicate(String [] input){

	int len = input.length;
	
	int occur;

	for(int index = 0; index < len; index++){
		occur = 1;

		for(int element = index + 1; element < input.length; element++){
			if(input[index] == input[element]){
				occur ++;
			}		
		}

		if(occur > 1){	
			System.out.print(input[index] + " ");
		}
	}

   }


}