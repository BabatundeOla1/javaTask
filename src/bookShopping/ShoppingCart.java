package bookShopping;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Book> books = new ArrayList<>();
    public void addBooks(Book book1) {
        books.add(book1);
        display(book1.getTitle() + "  Has been added to shopping cart.");
    }

    public ArrayList<Book> viewBook() {
        display("Books in the cart.");
        return books;
    }

    public void remove(Book book1) {
        books.remove(book1);
        display(book1.getTitle() + "  Has been removed from shopping cart.");
    }

    public Book searchBook(String title){
        for(Book myBook : books){
            if (myBook.getTitle().equals(title))
                return myBook;
        }
        throw new IllegalArgumentException("Book not found.");
    }

    public int getQuantity() {
        int size = books.size();
        return size;
    }

    private void display(String message){
        System.out.println(message);
    }
}
