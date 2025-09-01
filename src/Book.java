import java.time.LocalDateTime;

public abstract class Book {
    LocalDateTime dateTime = LocalDateTime.now();

    final String serialNUmb;
    String bookTitle;
    String author;

    public Book(String serialNUmb, String bookTitle, String author) {
        this.serialNUmb = serialNUmb;
        this.bookTitle = bookTitle;
        this.author = author;
        this.dateTime = LocalDateTime.now();

    }
}
