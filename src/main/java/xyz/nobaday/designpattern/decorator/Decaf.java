package xyz.nobaday.designpattern.decorator;

public class Decaf extends Bervage {

    public Decaf() {
        super("脱咖啡因咖啡");
    }

    double cost() {
        return 1.0;
    }
}
