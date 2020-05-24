package xyz.nobaday.designpattern.factory.simplefactory;

import xyz.nobaday.designpattern.factory.simplefactory.Hamburger;
import xyz.nobaday.designpattern.factory.simplefactory.Steak;

public class FoodFactory {

    public Food getFood(int key) {
        Food food = null;
        switch (key) {
            case 1: food = new Hamburger(); break;
            case 2: food = new Steak(); break;
        }
        return food;
    }

}
