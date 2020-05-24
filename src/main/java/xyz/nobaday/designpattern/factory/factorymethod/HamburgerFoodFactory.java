package xyz.nobaday.designpattern.factory.factorymethod;

public class HamburgerFoodFactory implements FoodFactory {

    public Food getFood() {
        return new Hamburger();
    }
}
