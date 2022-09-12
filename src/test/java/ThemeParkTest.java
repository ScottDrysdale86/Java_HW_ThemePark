import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ThemeParkTest {

    ThemePark themePark;

    Dodgems dodgems;
    IceCreamStall iceCreamStall;
    Visitor visitor;


    @Before
    public void setUp(){
        dodgems = new Dodgems("Dodgems", 5);
        iceCreamStall = new IceCreamStall("Dream Cones", "Joe Bond", ParkingSpot.A1);
        themePark = new ThemePark();
        visitor = new Visitor(12, 200.0, 30.00);
        themePark.addToAttractionAndStallsList(iceCreamStall);

    }

    @Test
    public void hasAttractionsAndStallsList(){
        themePark.addToAttractionAndStallsList(dodgems);
        assertEquals(2, themePark.getAttractionAndStallList().size());
    }

    @Test
    public void canIncreaseVisitCount(){
        themePark.visit(visitor, dodgems);
        assertEquals(1, dodgems.getVisitCount());
    }

    @Test
    public void canAddToVisitedAttractions(){
        themePark.visit(visitor, dodgems);
        assertEquals(1, visitor.getVisitedAttractions().size());
    }

    @Test
    public void canPopulateAllReviews(){
        themePark.populateAllReviews(dodgems);
        assertTrue(themePark.getAllReviews().containsKey(dodgems.getName()));
    }


}
