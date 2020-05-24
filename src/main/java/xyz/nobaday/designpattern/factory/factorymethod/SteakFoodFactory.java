package xyz.nobaday.designpattern.factory.factorymethod;

public class SteakFoodFactory implements FoodFactory {

    public Food getFood() {
        return new Steak();
    }
}
