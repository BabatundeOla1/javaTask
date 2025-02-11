package bookShopping;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    private ShoppingCart shoppingCart = new ShoppingCart();
    @Test
    public void testThatCutomerCanPlaceOrder(){
        Book book1 = new Book("Secrete Of Old Age", "Babatunde", 2000.0);
        Book book2 = new Book("Solitude", "Babatunde",  2000.0);
        Book book3 = new Book("Java", "Babatunde",  2000.0);
        Book book4 = new Book("Python", "Babatunde",  20_000.0);

        BookShelf bookShelf = new BookShelf();
        bookShelf.storeBooks(book1);
        bookShelf.storeBooks(book2);
        bookShelf.storeBooks(book3);
        bookShelf.storeBooks(book4);

        Customer customer = new Customer("Babatunde", "BSC1234", shoppingCart);
        customer.addBookToShoppingCart(book1, bookShelf);
        customer.addBookToShoppingCart(book2, bookShelf);
        customer.addBookToShoppingCart(book3, bookShelf);
        customer.addBookToShoppingCart(book4, bookShelf);

        Order order = new Order(shoppingCart);
        assertEquals(26000.0, order.placeOrder());
        System.out.println(order.getTotalCost());
    }
}