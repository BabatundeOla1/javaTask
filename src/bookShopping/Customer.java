package bookShopping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;

public class Customer {
    private String name;
    private String Id;
    private ArrayList<Book> books = new ArrayList<>();
    private ShoppingCart shoppingCart;

    public Customer(String name, String id, ShoppingCart shoppingCart) {
        validateUserName(name);
        this.name = name;
        this.Id = id;
        this.shoppingCart = shoppingCart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        validateUserName(name);
        this.name = name;
    }

    public void searchBookInShoppingCart(String title) {
        shoppingCart.searchBook(title);
    }
    public List<Book> viewBooksInBookshelf(BookShelf bookShelf) {
        return bookShelf.viewShelfBooks();
    }

    private void validateUserName(String userName){
        boolean regex = userName.matches(".*\\d.*");
        if(regex){
            throw new InputMismatchException("Invalid Name");
        }
        if (userName.isBlank()){
            throw new IllegalArgumentException("Name can't be blank.");
        }
    }

    public void addBookToShoppingCart(Book book, BookShelf bookShelf) {
        bookShelf.removeBook(book);
        shoppingCart.addBooks(book);
    }

    public void removeBookToShoppingCart(Book book, BookShelf bookShelf) {
        shoppingCart.remove(book);
        bookShelf.storeBooks(book);
    }
}
