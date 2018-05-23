package borrowers;

import books.Book;
import libraries.Library;

import java.util.ArrayList;

public class Borrower {

    private String Name;
    private ArrayList<Book> books;
    private Library library;
    private int id;

    public Borrower(String name, Library library) {
        this.Name = name;
        this.books = new ArrayList<Book>();
        library = new Library;
    }

    public Borrower() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public String getLibrary() {
        return Library;
    }

    public void setLibrary(String library) {
        Library = library;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
