import java.util.Scanner;

public class FutureInvestment{

   public static void main(String...args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Investment Value: ");
	double investmentAmount = sc.nextDouble();
		

	System.out.print("Enter Annual Interest Rate in percentage: ");
	double AnnualInterestRate = sc.nextDouble();

	System.out.print("Enter number Of years: ");
	int Years = sc.nextInt(); 

	System.out.printf("%.2f", futureInvestmentValue(investmentAmount,AnnualInterestRate,Years));

   }


	public static double futureInvestmentValue(double investmentAmount, double AnnualInterestRate, int Years){

	int totalLoanDuration = Years * 12; 

	double MonthlyInterestRate = AnnualInterestRate / 1200;

	double futureInvestmentValue = investmentAmount * (1 + MonthlyInterestRate);

	double TotalFutureInvestment = Math.pow(futureInvestmentValue, totalLoanDuration);


	return TotalFutureInvestment;

	}
}