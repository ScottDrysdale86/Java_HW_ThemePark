import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    private ArrayList<IReviewed> attractionAndStallList;
    private HashMap<String, Integer> allReviews;

    public ThemePark() {
        this.attractionAndStallList = new ArrayList<>();
        this.allReviews = new HashMap<>();
    }

    public void addToAttractionAndStallsList(IReviewed attractionOrStall){
        attractionAndStallList.add(attractionOrStall);
    }

    public ArrayList<IReviewed> getAttractionAndStallList() {
        return this.attractionAndStallList;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.setVisitCount(attraction.getVisitCount()+1);
        visitor.addToVisitedAttractions(attraction);
    }

    public void populateAllReviews(IReviewed attractionOrStall){
        allReviews.put(attractionOrStall.getName(), attractionOrStall.getRating());
    }

    public HashMap<String, Integer> getAllReviews() {
        return this.allReviews;
    }

}
