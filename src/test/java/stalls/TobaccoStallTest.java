package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor17;
    Visitor visitor18;
    Visitor visitor19;


    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitor17 = new Visitor(17,150, 10.00);
        visitor18 = new Visitor(18,150, 10.00);
        visitor19 = new Visitor(19,150, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }


    @Test
    public void hasAgeLimit(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor17));
        assertEquals(true, tobaccoStall.isAllowedTo(visitor18));
        assertEquals(true, tobaccoStall.isAllowedTo(visitor19));
    }
}
