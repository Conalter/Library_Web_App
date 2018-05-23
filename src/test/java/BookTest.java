import books.Book;
import borrowers.Borrower;
import libraries.Library;
import org.junit.Before;
import org.junit.Test;

public class BookTest {

    Library library;
    Borrower borrower;
    Book book1;
    Book book2;
    Book book3;



    @Before
    public void setUp() throws Exception{
        library = new Library("Glasgow Library");
        borrower = new Borrower("Sarah", library);
     book1 = new Book("Great Expectations", "Charles Dickens", borrower, library);
     book2 = new Book("Pride and Prejudice", "Jane Austen", borrower, library);
     book3 = new Book("War and Peace", "Leo Tolstoy", borrower, library);
    }

    }
