package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    Visitor visitorOK;
    Visitor visitorYoung;
    Visitor visitorShort;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitorOK = new Visitor(15, 150.00, 30.00);
        visitorYoung = new Visitor(11, 201.00, 30.00);
        visitorShort = new Visitor(15, 110.00, 30.00);

    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasAgeHeightLimit(){
        assertTrue(rollerCoaster.isAllowedTo(visitorOK));
        assertFalse(rollerCoaster.isAllowedTo(visitorYoung));
        assertFalse(rollerCoaster.isAllowedTo(visitorShort));
    }

    @Test
    public void hasPrice(){
        assertEquals(8.40, rollerCoaster.priceFor(visitorOK),0.0);

    }

    @Test
    public void hasPriceDouble(){
        assertEquals(16.80, rollerCoaster.priceFor(visitorYoung),0.0);
    }
}
