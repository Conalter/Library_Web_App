import books.Book;
import org.junit.Before;
import org.junit.Test;

public class BookTest {

    Book book1;
    Book book2;
    Book book3;


    @Before
    public void setUp() throws Exception {
     book1 = new Book("Great Expectations", "Charles Dickens");
     book2 = new Book("Pride and Prejudice", "Jane Austen");
     book3 = new Book("War and Peace", "Leo Tolstoy");
    }

    }
