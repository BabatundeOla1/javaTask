package bookShopping;

import java.util.ArrayList;
import java.util.Random;

public class Order {
    private ShoppingCart shoppingCart;
    private String Id;
    private double totalCost;

    public Order(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
        this.Id = getId();
        this.totalCost = 0.0;
    }


    public String getTotalCost() {
        return "Total cost :  NGN " + totalCost;
    }
    public String getId() {
        Random random = new Random();
        String userId  = "BS" + Integer.toString(random.nextInt(1, 1000));
        return userId;
//        return Id+=1;
    }


    public double placeOrder(){
        ArrayList<Book> books = shoppingCart.viewBook();
        for (Book myBooks : books)
            totalCost += myBooks.getPrice();
        display("Order number: " + getId());
        return totalCost;
    }

    private void display(String message){
        System.out.println(message);
    }

    public void orderHistory(String orderId){
        findOrderId(orderId);
    }

    private void findOrderId(String orderId){
        if (getId().equals(orderId)){
            display("\n");
            display("ORDERS: ");
            display("\n");
            display("" + shoppingCart.viewBook());
            display(getTotalCost());
        }
        else {
            throw new IllegalArgumentException("Invalid Order ID");
        }
    }
}
