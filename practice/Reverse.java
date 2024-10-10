public class Reverse{

   public static void main(String [] args){

	java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.print("Enter number for pentagonal number: ");
	int number = sc.nextInt();

	reverse(number);
	
	
   }

   public static void reverse(int integer){
	
	int reverse = 0;

	while(integer != 0){
		
 	    reverse = (reverse * 10) + integer % 10;

	    integer = integer / 10;

   }
	System.out.print(reverse);
}

}