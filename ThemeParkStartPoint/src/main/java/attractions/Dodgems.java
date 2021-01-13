package attractions;


import behaviours.ITicketed;

public class Dodgems extends Attraction implements ITicketed{

    public Dodgems(String name, int rating) {
        super(name, rating);
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
