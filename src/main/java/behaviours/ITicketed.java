package behaviours;

import people.Visitor;

public interface ITicketed {

    double defaultPrices();
    double priceFor(Visitor visitor);
}
