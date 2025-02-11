package OOPChapterNine.questions.book;

import bookShopping.Book;

public class AudioBook extends Book {

    private int bookSizeInMB;
    private int playLength;
    private String artistName;
    public AudioBook(int bookSizeInMB, int playLength, String artistName, String title, String authorName, double price) {
        super(title, authorName, price);
        this.bookSizeInMB = bookSizeInMB;
        this.playLength = playLength;
        this.artistName = artistName;
    }

    public int getBookSizeInMB() {
        return bookSizeInMB;
    }

    public void setBookSizeInMB(int bookSizeInMB) {
        this.bookSizeInMB = bookSizeInMB;
    }

    public int getPlayLength() {
        return playLength;
    }

    public void setPlayLength(int playLength) {
        this.playLength = playLength;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @Override
    public String toString(){
        return String.format("size in MB = %d, Length in Mins =  %d, Artist Name = %s,  %s", getBookSizeInMB(), getPlayLength(), getArtistName(), super.toString());
    }
}
