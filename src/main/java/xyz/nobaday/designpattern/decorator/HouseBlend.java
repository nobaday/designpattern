package xyz.nobaday.designpattern.decorator;

public class HouseBlend extends Bervage {

    public HouseBlend() {
        super("混合咖啡");
    }

    double cost() {
        return 2.8;
    }
}
