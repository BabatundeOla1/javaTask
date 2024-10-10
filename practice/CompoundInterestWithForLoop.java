public class CompoundInterestWithForLoop{

   public static void main(String [] args){

java.util.Scanner sc = new java.util.Scanner(System.in);

	double principal = 1000;

	double rate = 0.05;

	System.out.println("Year\tAmount on deposit");

	for(int years = 1; years <= 10; years++){

		double amountExpected = principal * Math.pow(1.0 + rate, years);


	System.out.printf("%3d%, 20.2f%n", years, amountExpected);

	}
		
		
   }

}