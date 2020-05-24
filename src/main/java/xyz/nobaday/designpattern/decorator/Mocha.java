package xyz.nobaday.designpattern.decorator;

public class Mocha extends Condiment {

    public Mocha(Bervage bervage) {
        super(bervage);
    }

    double cost() {
        return bervage.cost() + 0.2;
    }
}
