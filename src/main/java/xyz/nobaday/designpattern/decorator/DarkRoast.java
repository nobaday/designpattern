package xyz.nobaday.designpattern.decorator;

public class DarkRoast extends Bervage {

    public DarkRoast() {
        super("深烘焙咖啡");
    }

    double cost() {
        return 2.5;
    }
}
