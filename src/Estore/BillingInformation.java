package Estore;

public class BillingInformation{

    private String receiversPhoneNumber;
    private String receiversName;
    private String deliveryAddress;
    CreditCardInformation creditCardInformations;

    public BillingInformation(String receiversPhoneNumber, String receiversName, String deliveryAddress, CreditCardInformation creditCardInformations) {
        this.receiversPhoneNumber = receiversPhoneNumber;
        this.receiversName = receiversName;
        this.deliveryAddress = deliveryAddress;
        this.creditCardInformations = creditCardInformations;
    }
}
