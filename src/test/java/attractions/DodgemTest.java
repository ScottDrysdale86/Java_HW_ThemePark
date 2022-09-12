package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;

    Visitor visitorOK;

    Visitor visitorYoung;

    @Before
    public void setUp() {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitorOK = new Visitor(13, 120.00, 10);
        visitorYoung = new Visitor(11, 120.00, 10);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasPrice(){
        assertEquals(4.50, dodgems.priceFor(visitorOK),0.0);

    }

    @Test
    public void hasPriceHalf(){
        assertEquals(2.25, dodgems.priceFor(visitorYoung),0.0);
    }
}
