package xyz.nobaday.designpattern.factory.abstractfactory;

public class Business {

    public void order(Factory factory) {
        Food food = factory.getFood();
        Drink drink = factory.getDrink();
        food.eat();
        drink.drink();
    }
}
