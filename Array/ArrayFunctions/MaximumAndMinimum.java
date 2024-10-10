import java.util.Arrays;

public class MaximumAndMinimum{

   public static void main(String [] args){

	int [] numbers ={2,3,5,6,7};

	System.out.print(Arrays.toString(getminAndMax(numbers)));
	
}

   public static int[] getminAndMax(int [] arrays){

	int maximum = getMaximum(arrays);

	int minimum = getMinimum(arrays);

	int[] minMax = {minimum, maximum};

	return minMax;
   }



   public static int getMaximum(int [] elements){

	int maximum = elements[0];
	
	for(int count = 0; count < elements.length; count++){
		if(elements[count] > maximum){
			maximum = elements[count];
		}

   	}
		return maximum;

   }

   public static int getMinimum(int [] elements){

	int minimum = elements[0];
	
	for(int count = 0; count < elements.length; count++){
		if(elements[count] < minimum){
			minimum = elements[count];
		}

   	}
		return minimum;

   }






}