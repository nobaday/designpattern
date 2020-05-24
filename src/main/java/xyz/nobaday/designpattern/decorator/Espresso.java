package xyz.nobaday.designpattern.decorator;

public class Espresso extends Bervage {

    public Espresso() {
        super("浓咖啡");
    }

    double cost() {
        return 2.0;
    }
}
