package xyz.nobaday.designpattern.factory.factorymethod;

class Salad implements Food {

    public void eat() {
        System.out.println("沙拉");
    }
}

class SaladFoodFactory implements FoodFactory {

    public Food getFood() {
        return new Salad();
    }
}

public class AppTest {

    public static void main(String[] args) {
        SaladFoodFactory saladFactory = new SaladFoodFactory();

        Food salad = saladFactory.getFood();
        salad.eat();

        // 业务
        Business business = new Business();
        business.taste(saladFactory);
    }

}
