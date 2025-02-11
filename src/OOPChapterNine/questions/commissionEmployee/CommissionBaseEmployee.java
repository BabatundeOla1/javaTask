package OOPChapterNine.questions.commissionEmployee;
public class CommissionBaseEmployee {

    private  final String firstName;
    private  final String lastName;
    private final String socialSecurityNumber;
    private double commissionRate;
    private double grossSale;

    public CommissionBaseEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSale) {
        validateGrossSale(grossSale);
        validateCommissionRate(commissionRate);
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.commissionRate = commissionRate;
        this.grossSale = grossSale;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setCommissionRate(double commissionRate) {
        validateCommissionRate(commissionRate);
        this.commissionRate = commissionRate;
    }

    public void setGrossSale(double grossSale) {
        validateGrossSale(grossSale);
        this.grossSale = grossSale;
    }


    public double earning() {
        return getGrossSale() * getCommissionRate();
    }

    private void validateGrossSale(double amount){
        if (amount < 1){
            throw new IllegalArgumentException("Gross Sale cant be less than 1");
        }
    }

    private void validateCommissionRate(double commissionRate){
        if (commissionRate < 0.0 || commissionRate > 1.0){
            throw new IllegalArgumentException("Commission Rate cant be less than 0.0 or 1.0");
        }
    }
}
