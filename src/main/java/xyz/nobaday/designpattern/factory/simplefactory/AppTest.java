package xyz.nobaday.designpattern.factory.simplefactory;

public class AppTest {

    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();
        Food food = foodFactory.getFood(1);
        food.eat();

        Food food1 = foodFactory.getFood(2);
        food1.eat();
    }
}
