package Estore;

public class Item extends ShoppingCart{

    private String quantityOfProduct;
    Product product;

    public Item(String quantityOfProduct){
        product = new Product();
    }
}
