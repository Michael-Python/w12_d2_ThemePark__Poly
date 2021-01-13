package attractions;

import people.Visitor;
import behaviours.ISecurity;
import behaviours.ITicketed;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo() {
        if(Visitor.getAge() <=12){
            return false;
        }
        if(Visitor.getHeight() <=145){
            return false;
        }
        return true;
    }

    @Override
    public double defaultPrice() {
        return 0;
    }

    @Override
    public double priceFor() {
        return 0;
    }

}
