package behaviours;

import people.Visitor;

public interface ITicketed {
    double defaultPrice();

    default double priceFor(Visitor) {
        return 0;
    }

}
