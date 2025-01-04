package CompoundInterestCalculator;

import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {
        compoundInterestCalculator();
    }

    public static void compoundInterestCalculator(){
        Calculator compoundInterest = new Calculator();
        double initialInvestment = convertInputToDouble("Enter Initail Investment Amount: ");
        double monthlyContribution = convertInputToDouble("Enter Amount To Be Contributed Monthly: ");
        int lengthOfTimeInYear = convertInputToInteger("Enter Length Of Time In Year: ");
        double interestRateEstimate = convertInputToDouble("Enter Interest Rate Estimate: ");
        int compoundFrequency = convertInputToInteger("Enter Times Per Year That Interest Will Be Compounded: ");
        double result = compoundInterest.futureValueInvestment(initialInvestment, monthlyContribution, lengthOfTimeInYear, interestRateEstimate, compoundFrequency);
        display(String.format("The final amount after %d years with $%,.2f contributions is $%,.2f", lengthOfTimeInYear, monthlyContribution, result));
    }

    private static String input(String message){
        Scanner sc = new Scanner(System.in);
        display(message);
        return sc.nextLine();
    }

    private static void display(String message){
        System.out.println(message);
    }

    private static double convertInputToDouble(String message){
        double toDouble = Double.parseDouble(input(message));
        return toDouble;
    }

    private static int convertInputToInteger(String message){
        int toInteger = Integer.parseInt(input(message));
        return toInteger;
    }
}
