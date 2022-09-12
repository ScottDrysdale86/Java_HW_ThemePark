package attractions;

import behaviours.ISecure;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecure, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getHeight() > 145) && (visitor.getAge() > 12);

    }

    @Override
    public double defaultPrices() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight()>200) {
            return defaultPrices()*2;
        }
        return defaultPrices();
    }
}
