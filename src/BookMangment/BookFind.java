package BookMangment;

public class BookFind extends Book {

    public void find(Book o,String  serialNumb) {
        if (o == null) {
            System.out.println("Book object is null");
            return;
        }

        if (!serialNumb.equals(o.serialNUmb)) {
            System.out.println(" Can't find");
        } else {
            System.out.println(o.getAuthor());
            System.out.println(o.getBookTitle());
            System.out.println(o.getSerialNUmb());
        }
    }
}