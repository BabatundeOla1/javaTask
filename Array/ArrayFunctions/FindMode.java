import java.util.Arrays;

public class FindMode{

   public static void main(String [] args){

	int [] array1 = {5, 5, 5, 2, 3};
	int [] array2 = {1, 2, 2, 4, 5, 5, 5, 5, 5}; 

	int[] firstMostOccur = getMostOccuring(array1);
	int[] secondMostOccur = getMostOccuring(array2);

	System.out.print(Arrays.toString(firstMostOccur));
	System.out.print(Arrays.toString(secondMostOccur));
   }

    
   public static int[] getMostOccuring(int[] arrays){
	
	int[] mostOccur = new int[1];

	int most = 0;

 	  for(int elements = 0; elements < arrays.length; elements++){

		int temporaryElement = arrays[elements];

		int tally = 0;

		for(int count = 0; count < arrays.length; count++){

			if(arrays[count] == temporaryElement)

				tally++;

				if(tally > most)

			most = tally;

			mostOccur = arrays[elements];
		}
			
   	}
		return mostOccur;
  }


}