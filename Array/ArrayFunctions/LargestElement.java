public class LargestElement{

   public static void main(String [] args){

	int [] numbers = {12, 15, 25, 76, 2008};

	getLargest(numbers);

	System.out.print("Largest Element = " + " " + getLargest(numbers));
   }


    public static int getLargest(int [] elements){	

	int largestElement = elements[0];

	for(int count = 0; count < elements.length; count++)

	if(elements[count] > largestElement) {
		largestElement = elements[count];
	}

	return largestElement;

    }

}
