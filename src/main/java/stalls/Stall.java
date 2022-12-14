package stalls;

import behaviours.IReviewed;

public abstract class Stall implements IReviewed {

    private final String name;
    private final String ownerName;
    private final ParkingSpot parkingSpot;
    private int rating;

    public Stall(String name, String ownerName, ParkingSpot parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = 0;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    @Override
    public int getRating() {
        return rating;
    }
}
