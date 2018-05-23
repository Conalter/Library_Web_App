package borrowers;

import java.util.ArrayList;

public class Borrower {

    private String Name;
    private ArrayList<Books> books;
    private String Library;
    private int id;

    public Borrower(String name books, String library) {
        this.Name = name;
        this.Books = new ArrayList<Books>();
        Library = new library;
    }


}
