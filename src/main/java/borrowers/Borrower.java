package borrowers;

import books.Book;

import java.util.ArrayList;

public class Borrower {

    private String Name;
    private ArrayList<Book> books;
    private String Library;
    private int id;

    public Borrower(String name, String library) {
        this.Name = name;
        this.book = new ArrayList<Book>();
        Library = new library;
    }


}
