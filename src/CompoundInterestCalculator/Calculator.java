package CompoundInterestCalculator;

public class Calculator {

    public double futureValueInvestment(double initialInvestment, double monthlyContribution, int lengthOfTimeInYear, double interestRateEstimate, int compoundFrequency){
        double futureValue = calculateInvestmentAmount(initialInvestment, lengthOfTimeInYear, interestRateEstimate, compoundFrequency) + calculateMonthlyContribution(monthlyContribution, lengthOfTimeInYear, interestRateEstimate, compoundFrequency);
        return futureValue;
    }

    public double calculateMonthlyContribution(double monthlyContribution, int lengthOfTimeInYear, double interestRateEstimate, int compoundFrequency) {
        validatemonthlyContribution(monthlyContribution);
        double interestRateToDecimal = interestRateEstimate / 100;
        double monthlyInterestRate =  interestRateToDecimal / compoundFrequency;
        double futureValueFactor = calculateInterestYear(lengthOfTimeInYear, interestRateEstimate, compoundFrequency) - 1;
        double monthlyInterest = futureValueFactor / monthlyInterestRate;
        double interest = monthlyContribution * monthlyInterest;
        return interest;
    }

    public double calculateInvestmentAmount(double initialInvestment, int lengthOfTimeInYear, double interestRateEstimate, int compoundFrequency){
        validateInitialInvestment(initialInvestment);
        double investment = initialInvestment * calculateInterestYear(lengthOfTimeInYear, interestRateEstimate, compoundFrequency);
        return investment;
    }

    public double calculateInterestYear(int lengthOfTimeInYear, double interestRateEstimate, int compoundFrequency){
        validateInputs(lengthOfTimeInYear, interestRateEstimate, compoundFrequency);
        double interestRateToDecimal = interestRateEstimate / 100;
        double compoundAnnualInterest = (1 + interestRateToDecimal / compoundFrequency);
        int numberOfPayments = compoundFrequency * lengthOfTimeInYear;
        double power = Math.pow(compoundAnnualInterest, numberOfPayments);
        return power;
    }

    private void validateInputs(int lengthOfTimeInYear, double interestRateEstimate, int compoundFrequency){
        if (lengthOfTimeInYear <= 0){
            throw new IllegalArgumentException("Length of time in years must be greater than 0");
        }
        if (interestRateEstimate <= 0){
            throw new IllegalArgumentException("Interest rate must be greater than 0");
        }
        if (compoundFrequency <= 0){
            throw new IllegalArgumentException("Compound frequency must be greater than 0");
        }

    }

    private void validateInitialInvestment(double initialInvestment){
        if (initialInvestment <= 0){
            throw new IllegalArgumentException("Initial Investment must be greater than 0");
        }
    }    private void validatemonthlyContribution(double monthlyContribution){
        if (monthlyContribution <= 0){
            throw new IllegalArgumentException("Monthly Contribution must be greater than 0");
        }
    }

}

