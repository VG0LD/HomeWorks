package Attempt2;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> library = new ArrayList<>();

    public void addBook (Book book) {
        library.add(book);
    }

    public void force (ReadAble readAble) {
        readAble.read();
    }
    public void listBooks () {
        for (Book book: library) {
            System.out.println("Title: " + book.getTitle() + "; Author: " + book.getAuthor() +
                    "; Year of publication: " + book.getYear());
        }
    }
}
