package xyz.nobaday.designpattern.decorator;

public class Milk extends Condiment {

    public Milk (Bervage bervage) {
        super(bervage);
    }

    double cost() {
        return bervage.cost() + 0.3;
    }
}
