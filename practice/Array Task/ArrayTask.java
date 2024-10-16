//1. write a function that returns the largest element in a list.

/*public class ArrayTask{

   public static void main(String [] args){

	int [] array = {553, 465, 9000, 600, 1400, 800};

	int arr = returnLargest(array);

	System.out.print("Largest = " + arr);
   }

   public static int returnLargest(int [] list){
	
	int max = list[0];
	
	for(int count = 0; count < list.length-1; count++){

		if(list[count] > max)
			max = list[count];

	}

	return max;
   }

}*/

//2. Write function that reverses a list.

/*public class ArrayTask{

   public static void main(String [] args){

	int [] array = {553, 465, 9000, 600, 1400, 800};
	reverseList(array);
   }

   public static void reverseList(int [] list){
	
	for(int count = list.length-1; count > 0; count--){

		System.out.print(list[count] + " ");

	}
   }

}*/

//3. Write a function that checks whether an elements on odd position in a list.

//Not done.

/*public class ArrayTask{

   public static void main(String [] args){

	int [] array = {5, 4, 9, 5, 6, 14, 8};
	getOccur(array);
   }

   public static void getOccur(int [] list){
	
	int frequency = 1;	
	for(int counter = 0; counter < list.length; counter++){
		for(int count = 1; count < list.length; count++){

			if(list[counter] == list[count]){

				frequency++;
				System.out.print(frequency);
			}
		}	
	}
		
   }

}*/

//4. Write a function that prints the elements on odd podition in a list

/*public class ArrayTask{

   public static void main(String [] args){

	int [] array = {5, 4, 9, 5, 6, 14, 8};

	getOddPosition(array);

	System.out.println("****************");

	getEvenPosition(array);
   }	

   public static void getOddPosition(int [] list){
		
	for(int counter = 1; counter < list.length; counter= counter + 2){

		System.out.println(list[counter] );
	}
		
   }

    public static void getEvenPosition(int [] list){
		
	for(int counter = 0; counter < list.length; counter= counter + 2){

		System.out.println(list[counter] );
	}
		
   }

}*/


//6. Write a function that compute all running total list of an array.

/*public class ArrayTask{

   public static void main(String [] args){

	int [] array = {5, 4, 9, 5, 6, 14, 8};
	getTotalList(array);
   }

   public static void getTotalList(int [] list){
	
	int sum = 0;
	for(int counter = 0; counter < list.length; counter++){	
		sum += list[counter];	
		System.out.print(sum + " ");	
	}
	
		
   }

}*/

//7. write  a function that test whether a string is a palindrome.

/*public class ArrayTask{

   public static void main(String [] args){

	String [] array = {"m", "a", "l", "l", "a", "m"};
	getPalindrome(array);
   }

   public static void getPalindrome(String [] list){

	String reverse = "";

	for(int count = list.length-1; count >= 0; count--){
	
		reverse = list[count];

		if(list.equals(reverse)){
			System.out.print("it is palindrome");
		}
	}	
   }

}*/

public class ArrayTask{

   public static void main(String [] args){

	String [] array = {"m", "a", "l", "l", "a", "m"};
	getPalindrome(array);
   }

   public static void getPalindrome(String [] list){

	String reverse = "";

	for(int count = list.length-1; count >= 0; count--){
	
		reverse = list[count];

		if(list.equals(reverse)){
			System.out.print("it is palindrome");
		}
	}	
   }

}
































