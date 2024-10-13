public class ComputeFutureTuition{

   public static void main(String [] args){

	java.util.Scanner sc = new java.util.Scanner(System.in);

	System.out.print("Enter tuition Fee amount: ");
	int tuitionFee = sc.nextInt();

	System.out.print("Enter annual interest rate: ");
	int rate = sc.nextInt();

	System.out.print("Enter duration: ");
	int year = sc.nextInt();

	System.out.println("Years\tYearly amount");

	final int PERCENTAGE = 100;
	
	for(int count = 1; count <= year; count++){

		int yearlyIncrementAmount = tuitionFee * rate / PERCENTAGE;
		int totalAmountPerYear = tuitionFee + yearlyIncrementAmount;
		tuitionFee = totalAmountPerYear;

		System.out.println("Year" + count + ":" + "\t" + tuitionFee);
	}

   }

}