package OOPChapterNine.questions.book;

public class BookHierarchy {

    private String title;
    private int yearOfPublication;
    private String author;

    public BookHierarchy(String title, int yearOfPublication, String author) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString(){
        return String.format("title = '%s', year of publication = %d, author = %s",  getTitle(), getYearOfPublication(), getAuthor());
    }
}
