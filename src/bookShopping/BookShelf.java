package bookShopping;

import java.util.ArrayList;

public class BookShelf {

    private ArrayList<Book> books = new ArrayList<>();

    private ArrayList<Customer> customers = new ArrayList<>();

    public void storeBooks(Book book1) {
        books.add(book1);
    }
    public void removeBook(Book book1) {
        searchBook(book1.getTitle());
        books.remove(book1);
    }
    public ArrayList<Book> viewShelfBooks() {
        if (books.isEmpty()){
            System.out.println("Empty Shelf Try again Another time");
        }
        return books;
    }

    public Book searchBook(String bookTitle) {
        for(Book myBook : books){
            if (myBook.getTitle().equals(bookTitle)){
                return myBook;
            }
        }
        throw new IllegalArgumentException("Book not found in Bookshelf");
    }
    public int getQuantity() {
        return books.size();
    }
//    private void createRegisterCustomer(String name){
//       String ID = customers.getId();
//        Customer customer1 = new Customer(name, )
//    }
}
