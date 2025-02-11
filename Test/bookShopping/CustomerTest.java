package bookShopping;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
    private ShoppingCart shoppingCart = new ShoppingCart();
    @Test
    public void testThatErrorIsThrownWhen_CustomerNameIsBlank() {
        assertThrows(IllegalArgumentException.class, () -> new Customer("    ", "BSC1234", shoppingCart));

        Customer customer = new Customer("Babatunde", "BS1233", shoppingCart);
        assertThrows(IllegalArgumentException.class, () -> customer.setName("  "));
    }

    @Test
    public void testThatErrorIsThrownWhen_CustomerNameContainDigitOr_OtherCharacters() {
        assertThrows(IllegalArgumentException.class, () -> new Customer("123hsjsdh", "BSC1234", shoppingCart));

        Customer customer = new Customer("Babatunde", "BS1233", shoppingCart);
        assertThrows(IllegalArgumentException.class, () -> customer.setName("1232hjfhj"));
    }

    @Test
    public void testThatCustomerCanViewBooksInBookShelf(){
        Book book1 = new Book("Secrete Of Old Age", "Babatunde",  2000.0);
        Book book2 = new Book("Solitude", "Babatunde",  20_000.0);
        Book book3 = new Book("Java", "Babatunde",  2000.0);
        Book book4 = new Book("Python", "Babatunde",  20_000.0);

        BookShelf bookShelf = new BookShelf();
        bookShelf.storeBooks(book1);
        bookShelf.storeBooks(book2);
        bookShelf.storeBooks(book3);
        bookShelf.storeBooks(book4);

        Customer customer = new Customer("Babatunde", "BSC1234", shoppingCart);

        List<Book> bookInBookShelf = customer.viewBooksInBookshelf(bookShelf);
        assertTrue(bookInBookShelf.contains(book1));
        assertTrue(bookInBookShelf.contains(book2));
        assertTrue(bookInBookShelf.contains(book3));
        assertTrue(bookInBookShelf.contains(book4));
        System.out.println(bookInBookShelf);
    }

    @Test
    public void testThatCustomerCanAddBooksInShoppingCart(){
        Book book1 = new Book("Secrete Of Old Age", "Babatunde", 2000.0);
        Book book2 = new Book("Solitude", "Babatunde",  20_000.0);
        BookShelf bookShelf = new BookShelf();
        bookShelf.storeBooks(book1);
        bookShelf.storeBooks(book2);

        ShoppingCart shoppingCart = new ShoppingCart();

        Customer customer = new Customer("Babatunde", "BSC1234", shoppingCart);
        customer.addBookToShoppingCart(book1, bookShelf);
        customer.addBookToShoppingCart(book2, bookShelf);

        assertEquals(2, shoppingCart.getQuantity());
        System.out.println(shoppingCart.viewBook());
    }

    @Test
    public void testThatCustomerCanRemoveBookFromCartAndAddBackToShelf(){
        Book book1 = new Book("Secrete Of Old Age", "Babatunde", 2000.0);
        Book book2 = new Book("Solitude", "Babatunde",  20_000.0);
        BookShelf bookShelf = new BookShelf();
        bookShelf.storeBooks(book1);
        bookShelf.storeBooks(book2);
        System.out.println("Books available in bookshelf  before adding to cart\n" +  bookShelf.viewShelfBooks());


        ShoppingCart shoppingCart = new ShoppingCart();

        Customer customer = new Customer("Babatunde", "BSC1234", shoppingCart);

        customer.addBookToShoppingCart(book1, bookShelf);
        customer.addBookToShoppingCart(book2, bookShelf);

        customer.removeBookToShoppingCart(book1, bookShelf);
        customer.removeBookToShoppingCart(book2, bookShelf);

        System.out.println("Books available in cart \n" +shoppingCart.viewBook());

        assertEquals(2, bookShelf.getQuantity());
        System.out.println("Books available in bookshelf after removing from cart \n" + bookShelf.viewShelfBooks());
    }

    @Test
    public void testThatCustomerCanFindBookFromShoppingCart(){
        Book book1 = new Book("Secrete Of Old Age", "Babatunde", 2000.0);
        Book book2 = new Book("Solitude", "Babatunde",  20_000.0);

        BookShelf bookShelf = new BookShelf();
        bookShelf.storeBooks(book1);
        bookShelf.storeBooks(book2);

        Customer customer = new Customer("Babatunde", "BSC1234", shoppingCart);
        customer.addBookToShoppingCart(book1, bookShelf);

        assertEquals(book1, shoppingCart.searchBook("Secrete Of Old Age"));
        System.out.println(shoppingCart.viewBook());

    }

}