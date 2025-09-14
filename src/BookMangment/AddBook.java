package BookMangment;

import java.time.LocalDateTime;
import java.util.Scanner;

class AddBook extends Book {
    Scanner sc = new Scanner(System.in);
    protected int numOfBooks = 0;
    int area;
    String[] bookStore;

    protected void setArea(int area) {
        this.area = area;
        this.bookStore = new String[area];// multiple area variables are used so that why we use this and put it in brackets
    }

    protected void setBook(String serialNUmb, String bookTitle, String author) {
        this.serialNUmb = serialNUmb;
        this.bookTitle = bookTitle;
        this.author = author;
        this.dateTime = LocalDateTime.now();

        if (numOfBooks != bookStore.length) {
            numOfBooks += 1;
            bookStore[numOfBooks] = bookTitle;/* booksstore is string and numbooks is int which is zero when code
                                                runs  array index will be passed the value of int numOfBooks which
                                                is zero and it will increase will each iteration*/
        } else
            System.out.println(" area is full can't add!");
    }
              // this code is underdevelpment


//    void deleteBook(String bookTitle, String serialNumber) {
//        if (numOfBooks == 0) {
//            System.out.println("nothing is left");
//            return;
//        } else {
//            System.out.println("deleting book record");
//            super.bookTitle = null;
//            super.serialNUmb = null;
//            super.numOfBooks = -1;
//            for (int i = 0; i <= bookStore.length; i++) {
//                if (bookStore[i] == bookTitle) {
//                    bookTitle = null;
//                    System.out.println("done");
//                    return;
//                }
//            }
//
//        }
//    }

    public String showStoreBooks() {// we made method for calling for
        for (String x : bookStore) {
            System.out.println(x);
        }
        return "";
    }

}

class DeleteBook extends AddBook {
//    protected void deleteBook(String bookTitle, String serialNumber) {
//
//    }
}