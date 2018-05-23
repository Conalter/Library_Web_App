package libraries;

import books.Book;
import borrowers.Borrower;

import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> books;
    private ArrayList<Borrower> borrowers;

    public Library() {
    }

    public Library(String name) {
        this.books = new ArrayList<>();
        this.borrowers = new ArrayList<>();
    }
}
