package xyz.nobaday.designpattern.factory.abstractfactory;

public class ShaxianFactory implements Factory {

    public Food getFood() {
        return new Race();
    }

    public Drink getDrink() {
        return new Plumjuice();
    }
}
