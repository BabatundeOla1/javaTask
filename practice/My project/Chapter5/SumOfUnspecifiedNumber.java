/*public class SumOfUnspecifiedNumber{

   public static void main(String [] args){

	java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.print("Enter numbers(enter -1 to end): ");
	int number = sc.nextInt();

	int sum = 0;

	while(number != -1){
		sum += number;
		
		System.out.print("Enter numbers(enter -1 to end): ");
		number = sc.nextInt();

		
	}

	System.out.print(sum);
   }

}*/

// this program uses  has the method has.next to prompt user frp the console automatically.
import java.util.Scanner;

public class SumOfUnspecifiedNumber {

    public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);
 	int sum = 0;

 	while (sc.hasNext ()) {
 		sum += sc.nextInt();
	 }

	 System.out.println("The sum is " + sum);
    }
}