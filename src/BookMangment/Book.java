package BookMangment;

import java.time.LocalDateTime;

public class Book {
    LocalDateTime dateTime = LocalDateTime.now();

    String serialNUmb;
    String bookTitle;
    String author;

    public Book(String serialNUmb, String bookTitle, String author) {
        this.serialNUmb = serialNUmb;
        this.bookTitle = bookTitle;
        this.author = author;
        this.dateTime = LocalDateTime.now();
    }

    Book() {
        this.serialNUmb = null;
        this.bookTitle = null;
        this.author = null;
        this.dateTime = LocalDateTime.now();
    }

    public void DetailsBook() {
        System.out.println(" Serial Numb = " + serialNUmb);
        System.out.println(" Author name = " + author);
        System.out.println("bookTitle = " + bookTitle);
        System.out.println("book information");

    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    private final void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getSerialNUmb() {
        return serialNUmb;
    }

    void setSerialNUmb(String serialNUmb) {
        this.serialNUmb = serialNUmb;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    public void getBook(String serialNUmb, String bookTitle, String author) {
        this.serialNUmb = serialNUmb;
        this.bookTitle = bookTitle;
        this.author = author;
        this.dateTime = LocalDateTime.now();
    }

//     protected void setBook(String serialNUmb, String bookTitle, String author) {
//        this.serialNUmb = serialNUmb;
//        this.bookTitle = bookTitle;
//        this.author = author;
//        this.dateTime = LocalDateTime.now();
//
//    }

    @Override
    public String toString() {
        return "BookMangment.Book{ " +
                " dateTime= " + dateTime +
                ", serialNUmb= '" + serialNUmb + '\'' +
                ", bookTitle= '" + bookTitle + '\'' +
                ", author= '" + author + '\'' +
                " }";
    }
}