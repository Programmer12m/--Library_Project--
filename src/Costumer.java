import BookMangment.Book;
import BookMangment.BookFind;

import java.util.Scanner;

public class Costumer extends Book {
    boolean borrow = false;
    boolean returning = false;
    String pass;
    double time;
    float charges;

    private Object data;
    private String passward;

    // creating pass
    Costumer(Object o, String pass) {
        this.data = o;
        this.passward = pass;
    }

    void borrowBook(String bookName, float charges) {
        this.borrow = true;
        this.charges = charges;
        System.out.println(getDateTime());
    }

    void returnBook(String bookName) {
        this.returning = true;
        System.out.println(getDateTime());

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        BookFind bookFind = new BookFind();
        Costumer person1 = new Costumer("Alics", " 1234");
        Costumer p1 = new Costumer("person1", "1234");

    }
}
