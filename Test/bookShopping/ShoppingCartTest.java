package bookShopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingCartTest {

    @Test
    public void testThatYouCanAddBooksToShoppingCart(){
        Book book1 = new Book("Secrete Of Old Age", "Babatunde", 2000.0);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addBooks(book1);
        assertEquals(1, shoppingCart.viewBook().size());
        assertEquals(book1, shoppingCart.viewBook().get(0));
        System.out.println(shoppingCart.viewBook());
    }

    @Test
    public void testThatYouCanAddMoreThanOneBookToTheShoppingCart(){
        Book book1 = new Book("Secrete Of Old Age", "Babatunde",  2000.0);
        Book book2 = new Book("Solitude", "Babatunde",  20_000.0);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addBooks(book1);
        shoppingCart.addBooks(book2);
        assertEquals(2, shoppingCart.viewBook().size());
        System.out.println(shoppingCart.viewBook());
    }
    @Test
    public void testThatYouCanAddMoreAndRemoveBooksFromTheShoppingCart(){
        Book book1 = new Book("Secrete Of Old Age", "Babatunde", 2000.0);
        Book book2 = new Book("Solitude", "Babatunde",  20_000.0);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addBooks(book1);
        shoppingCart.addBooks(book2);
        assertEquals(2, shoppingCart.viewBook().size());
        shoppingCart.remove(book1);
        assertEquals(1, shoppingCart.viewBook().size());
        System.out.println(shoppingCart.viewBook());
    }
    @Test
    public void testThatYouCanAddAndViewBooksFromTheShoppingCart(){
        Book book1 = new Book("Secrete Of Old Age", "Babatunde",  2000.0);
        Book book2 = new Book("Solitude", "Babatunde",  20_000.0);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addBooks(book1);
        shoppingCart.addBooks(book2);
        String viewBooks = shoppingCart.viewBook().get(0).getTitle();
        System.out.println(shoppingCart.viewBook());
        assertEquals("Secrete Of Old Age" , viewBooks);
    }

}