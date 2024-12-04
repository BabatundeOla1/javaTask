package Estore;

public class Product{

    private String productId;
    private String productName;
    private double productPrice;
    private String productDescription;

    private enum ProductCategory{
       ELECTRONICS,
       GROCERIES,
        UTENSILS,
      CLOTHING;
    }
}
