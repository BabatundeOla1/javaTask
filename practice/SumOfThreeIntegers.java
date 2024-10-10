public class SumOfThreeIntegers{

   public static void main(String [] args){

	java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.print("Enter number for pentagonal number: ");
	int number = sc.nextInt();

	System.out.print(sumDigits(number));
   }

   public static int sumDigits(int n){
	
	int reverse = 0;

	while(n != 0){
		
 	    reverse = reverse + n % 10;

	    n = n / 10;
	}

	return reverse;
   }

}

// 0r

/*public class SumOfThreeIntegers{

   public static void main(String [] args){

	java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.print("Enter number for pentagonal number: ");
	int number = sc.nextInt();

	System.out.print(sumDigits(number));
   }

   public static int sumDigits(int n){
	
	int firstNumber = n % 10;
	
	int secondNumber = (n / 10) % 10;

	int thirdNumber = n / 100;

	return firstNumber + secondNumber + thirdNumber;

   }*/