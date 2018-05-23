package PACKAGE_NAME;

import borrowers.Borrower;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BorrowerTest {

    public Borrower borrower;

    @Before
    public void before(){
        borrower = new Borrower("Sarah", "Gone With The Wind",);
    }

    @Test
    public void canGetName(){
        assertEquals("Sarah", Borrower.getName());
    }

    @Test
    public void canGetABook(){
        assertEquals("Gone With The WInd", Borrower.getBooks());
    }

}
