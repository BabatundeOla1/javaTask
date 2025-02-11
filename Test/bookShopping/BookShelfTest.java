package bookShopping;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookShelfTest {

    @Test
    public void testThatBooksCanBeStoredInTheBookShelf(){
        Book book1 = new Book("Secrete Of Old Age", "Babatunde",  2000.0);
        Book book2 = new Book("Solitude", "Babatunde", 20_000.0);
        Book book3 = new Book("Java", "Babatunde",  2000.0);
        Book book4 = new Book("Python", "Babatunde",  20_000.0);
        BookShelf bookShelf = new BookShelf();
        bookShelf.storeBooks(book1);
        bookShelf.storeBooks(book2);
        bookShelf.storeBooks(book3);
        bookShelf.storeBooks(book4);
        assertEquals(4, bookShelf.viewShelfBooks().size());
        System.out.println(bookShelf.viewShelfBooks());
    }

    @Test
    public void testThatBookCanBeSearchedFromBookShelf(){
        Book book1 = new Book("Secrete Of Old Age", "Babatunde",  2000.0);
        Book book2 = new Book("Solitude", "Babatunde",  20_000.0);
        Book book3 = new Book("Java", "Babatunde",  2000.0);
        Book book4 = new Book("Python", "Babatunde", 20_000.0);
        BookShelf bookShelf = new BookShelf();
        bookShelf.storeBooks(book1);
        bookShelf.storeBooks(book2);
        bookShelf.storeBooks(book3);
        bookShelf.storeBooks(book4);
        assertEquals(book1, bookShelf.searchBook("Secrete Of Old Age"));
        System.out.println(book1);
    }
    @Test
    public void testThatBookCanDisplayedAfterBookHasBeenAddedToBookShelf(){
        Book book1 = new Book("Secrete Of Old Age", "Babatunde",  2000.0);
        Book book2 = new Book("Solitude", "Babatunde",  20_000.0);
        Book book3 = new Book("Java", "Babatunde",  2000.0);
        Book book4 = new Book("Python", "Babatunde",  20_000.0);
        BookShelf bookShelf = new BookShelf();
        bookShelf.storeBooks(book1);
        bookShelf.storeBooks(book2);
        bookShelf.storeBooks(book3);
        bookShelf.storeBooks(book4);
        List<Book> shelfBooks = bookShelf.viewShelfBooks();
        assertTrue(shelfBooks.contains(book1));
        assertTrue(shelfBooks.contains(book2));
        assertTrue(shelfBooks.contains(book3));
        assertTrue(shelfBooks.contains(book4));
        System.out.println(shelfBooks);
    }

    @Test
    public void testThatYouCanRemoveBooksFromShelf(){
        Book book1 = new Book("Secrete Of Old Age", "Babatunde",  2000.0);
        Book book2 = new Book("Solitude", "Babatunde",  20_000.0);
        Book book3 = new Book("Java", "Babatunde",  2000.0);
        Book book4 = new Book("Python", "Babatunde",  20_000.0);
        BookShelf bookShelf = new BookShelf();
        bookShelf.storeBooks(book1);
        bookShelf.storeBooks(book2);
        bookShelf.storeBooks(book3);
        bookShelf.storeBooks(book4);

        bookShelf.removeBook(book1);
        assertEquals(3, bookShelf.viewShelfBooks().size());
        System.out.println(bookShelf.viewShelfBooks());
    }

    @Test
    public void testThatBookDecreasesWhenItsRemovedFromTheBookShelf(){
        Book book1 = new Book("Secrete Of Old Age", "Babatunde",  2000.0);
        Book book2 = new Book("Solitude", "Babatunde",  20_000.0);
        Book book3 = new Book("Java", "Babatunde",  2000.0);
        Book book4 = new Book("Python", "Babatunde", 20_000.0);
        BookShelf bookShelf = new BookShelf();
        bookShelf.storeBooks(book1);
        bookShelf.storeBooks(book2);
        bookShelf.storeBooks(book3);
        bookShelf.storeBooks(book4);
        bookShelf.removeBook(book2);
        bookShelf.removeBook(book3);
        assertEquals(2, bookShelf.getQuantity());
        System.out.println(bookShelf.viewShelfBooks());
    }
}