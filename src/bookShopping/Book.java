package bookShopping;

public class Book {
    private String title;
    private String authorName;
    private double price;

    public Book(String title, String authorName, double price) {
        validateBook(title);
        validateBook(authorName);
        validatePrice(price);
        this.title = title;
        this.authorName = authorName;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        validateBook(title);
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        validateBook(authorName);
        this.authorName = authorName;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        validatePrice(price);
        this.price = price;
    }

    @Override
    public String toString() {
        return "title = " + getTitle() + ", author = " + getAuthorName() + ", price =  NGN " + getPrice() + " \n";
    }

    private void validateBook(String title){
        boolean regex = title.matches(".*\\d.*");
        if(regex){
            throw new IllegalArgumentException("Invalid Name");
        }
        if (title.isBlank()){
            throw new IllegalArgumentException("Name can't be blank.");
        }
    }

    private void validatePrice(double price){
        if(price < 1){
            throw new IllegalArgumentException("Price Can Not be less than NGN 1.00");
        }
    }
}
