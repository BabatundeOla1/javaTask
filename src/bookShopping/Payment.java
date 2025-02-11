package bookShopping;

public class Payment {

    private ShoppingCart shoppingCart = new ShoppingCart();
    private Order order = new Order(shoppingCart);
    private double amount;

    public double getAmount() {
        return amount;
    }

//    private void validateAmount(double amount){
//        if (amount < order.getTotalCost()){
//
//        }
//    }
}
