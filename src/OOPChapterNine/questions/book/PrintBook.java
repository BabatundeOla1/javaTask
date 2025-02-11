package OOPChapterNine.questions.book;

import bookShopping.Book;

public class PrintBook extends Book {

    private String publisher;
    private String ISBN;

    public PrintBook(String publisher, String ISBN, String title, String authorName, double price) {
        super(title, authorName, price);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString(){
        return String.format("publisher = '%s, ISBN = '%s', %s", getPublisher(), getISBN(), super.toString());
    }
}
