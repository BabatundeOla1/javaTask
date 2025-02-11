package OOPChapterNine.questions.commissionEmployee;

public class BasePlusCommissionEmployee {

    private CommissionBaseEmployee commissionBaseEmployee;

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSale;
    private double  commissionRate;
    private double baseSalary;
    public BasePlusCommissionEmployee(CommissionBaseEmployee commissionBaseEmployee, String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate, double baseSalary) {
        validateGrossSale(grossSale);
        validateCommissionRate(commissionRate);
        validateBaseSalary(baseSalary);
        this.commissionBaseEmployee = commissionBaseEmployee;
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
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

    public void setBaseSalary(double baseSalary) {
        validateBaseSalary(baseSalary);
        this.baseSalary = baseSalary;
    }
    public void setCommissionRate(double commissionRate) {
        validateCommissionRate(commissionRate);
        this.commissionRate = commissionRate;
    }

    public void setGrossSale(double grossSale) {
        validateGrossSale(grossSale);
        this.grossSale = grossSale;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earning() {
        return getBaseSalary() + (getCommissionRate() * getGrossSale());
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
    private void validateBaseSalary(double baseSalary){
        if (baseSalary < 0.0 ){
            throw new IllegalArgumentException("base Salary cant be less than 0");
        }
    }
}
