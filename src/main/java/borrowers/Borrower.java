package borrowers;

import books.Book;
import java.util.ArrayList;

public class Borrower {

    private String Name;
    private ArrayList<Book> books;
    private Library Library;
    private int id;

    public Borrower(String name, Library library) {
        this.Name = name;
        this.books = new ArrayList<Book>();
        Library = new library;
    }


}
