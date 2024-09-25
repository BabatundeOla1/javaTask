public class LargestNumPractice{
	
    public static void main(String [] args){
	int [] array = {1,2,3,4,5,6,7};

	System.out.print("largest number is " + getLargest(array));
    }


    public static int getLargest(int [] numbers){

	int largest = numbers[0];

	for(int count = 0; count < numbers.length; count++){
		if(numbers[count] > largest)

		largest = numbers[count];
	}
		return largest;
    }    

}