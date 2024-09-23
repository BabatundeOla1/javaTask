public class ReversedNumberPractice{

    public static void main(String [] args){
	int [] elements = {1, 2, 3, 4, 5, 6};
	
	Reverse(elements);
	
	
    }


    public static void Reverse(int [] numbers){

	for (int count = numbers.length-1; count >= 0; count--)

		System.out.print(numbers[count] + " ");	
	
 		
   }

}

/***public class OddPosition{

    public static void main(String [] args){

	int [] number = {1, 2, 3, 4, 5, 6, 7};

	getOdd(number);
	System.out.print(getOdd(number));
    }


     public static int getOdd(int [] array){

	int odd = 0;

	for(int count = 0; count < array.length; count++)

		if (array[count] % 2 != 0)
	
		odd = array[count];
	
	return odd;
	
   }

}***/