import libraries.Library;
import org.junit.Before;

public class LibraryTest {

    Library library;

    @Before

    public void before() {
        library = new Library("Glasgow Library");
    }
}
