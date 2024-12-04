package Estore;

import java.util.ArrayList;

public class Customer extends User{
    private ShoppingCart shoppingCart = new ShoppingCart();
    ArrayList<BillingInformation> billingInformation = new ArrayList<>();

    public Customer(String name, int age, String emailAddress, String homeAddress, String password, String phone, ShoppingCart shoppingCart, BillingInformation billingInformation) {
        super(name, age, emailAddress, homeAddress, password, phone);

    }
}
