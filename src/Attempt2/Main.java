package Attempt2;

import Attempt2.Fiction;
import Attempt2.Library;
import Attempt2.NonFiction;
import Attempt2.ReadAble;

public class Main {
    public static void main(String[] args) {
        Fiction fictionBook = new Fiction("Fiction Book", "J.K.R", 2000);
        NonFiction nonFictionBook = new NonFiction("Non Fiction Book", "R.K.J.", 1990);

        Library library = new Library();

        library.addBook(fictionBook);
        library.addBook(nonFictionBook);


        library.listBooks();

        library.force(new ReadAble() {
            @Override
            public void read() {
                System.out.println("Reading by force");
            }
        });
    }
}
