package xyz.nobaday.designpattern.factory.factorymethod;

public class Business {

    public void taste(FoodFactory factory) {
        Food food = factory.getFood();
        System.out.print("品尝：");
        food.eat();
    }

}
