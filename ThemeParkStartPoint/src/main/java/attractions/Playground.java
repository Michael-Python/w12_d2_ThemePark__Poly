package attractions;


import behaviours.IReviewed;
import behaviours.ISecurity;

public class Playground extends Attraction implements IReviewed, ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo() {
        return false;
    }

    @Override
    public int getRating() {
        return 0;
    }
}