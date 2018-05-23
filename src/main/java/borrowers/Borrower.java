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
