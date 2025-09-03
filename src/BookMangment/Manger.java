package BookMangment;

class Manger extends Book {
//        public void DetailBooks(){
//            System.out.println(" Serial Numb = "+ getSerialNUmb());
//            System.out.println(" Author name = "+ getAuthor());
//            System.out.println("bookTitle = " + getBookTitle());
//            System.out.println("book information");
//        }

    public static void main(String[] args) {

        //  long time1 = System.currentTimeMillis();
        System.out.println("testing");
        Manger manger = new Manger();
        BookFind finder = new BookFind();
        Book book = new Book();
        Book book1 = new Book();
        AddBook addBook = new AddBook();
        addBook.setArea(10);
        addBook.setBook("234", "sevem habits", "java person2");
        addBook.setBook("112", "test", "apple");
        System.out.println(book.toString());
        System.out.println(book1.toString());
        finder.find(book1, "112");
        finder.find(book, "234");
        addBook.setBook("13234","java java","person1");
        addBook.setBook("13234","java java","person1");
        addBook.setBook("13234","java java","person1");
        addBook.setBook("13234","java java","person1");
        addBook.setBook("13234","java java","person1");


        System.out.println(addBook.showStoreBooks());
        //    long time2 = System.currentTimeMillis();
        //  System.out.println("time = " + (time2 - time1));

    }
}



