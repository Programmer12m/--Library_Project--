package BookMangment;

public class BookFind extends Book {
    String serialNumb;

    public void find(Book book,String  serialNumb) {
        if (book == null) {
            System.out.println("Book object is null");
            return;
        }

        if (!serialNumb.equals(book.serialNUmb)) {
            System.out.println(" Can't find");
        } else {
            System.out.println(book.getAuthor());
            System.out.println(book.getBookTitle());
            System.out.println(book.getSerialNUmb());
        }
    }
}