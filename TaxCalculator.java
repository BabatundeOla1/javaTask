import java.util.Scanner;

public class TaxCalculator{

   public static void main(String...args){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Earning: ");
        int Earnings = sc.nextInt();

	int taxRateBelow30000 = 15 / 100;
	int taxRateAbove30000 = 20 / 100;

	if(Earnings <= 30000){

		double tax = taxRateBelow30000 * Earnings;
	   System.out.println(tax);
	}
	
	if(Earnings > 30000){

		double tax = taxRateAbove30000 * Earnings;
	   System.out.println(tax);
	}


   }

}