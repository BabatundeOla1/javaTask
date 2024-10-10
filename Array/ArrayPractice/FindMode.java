import java.util.Arrays;

public class FindMode{

   public static void main(String [] args){

	int [] array1 = {5, 5, 5, 2, 3};
	int [] array2 = {1, 2, 2, 4, 5, 5, 5, 5, 5}; 

	int[] firstMostOccur = getMostOccuring(array1);

	System.out.print(Arrays.toString(firstMostOccur));
   }

    
   public static int[] getMostOccuring(int[] arrays){

	int length = arrays.length;
	
	int[] mostOccur = new int[1];

	int most = 0;

	int tally = 0;
 	  for(int count = 0; count < length; count++){ 
	
		for(int elements = 0; elements < length; elements++){

			if(arrays[count] == arrays[elements])
				tally++;

				if(tally > most)

			most = tally;

			mostOccur = arrays[elements];
		}
			
   	}
		return mostOccur;
  }


}