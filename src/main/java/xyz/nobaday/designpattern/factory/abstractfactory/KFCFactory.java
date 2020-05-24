package xyz.nobaday.designpattern.factory.abstractfactory;

public class KFCFactory implements Factory {

    public Food getFood() {
        return new Hamburger();
    }

    public Drink getDrink() {
        return new Pepsi();
    }
}
