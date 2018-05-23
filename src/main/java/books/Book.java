package books;

import borrowers.Borrower;

public class Book {

    private int id;
    private String title;
    private String author;
    private Borrower borrower;
    private Library library;

    public Book() {
    }

    public Book(String title, String author, Borrower borrower, Library library) {
        this.title = title;
        this.author = author;
        this.borrower = borrower;
        this.library = library;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}
