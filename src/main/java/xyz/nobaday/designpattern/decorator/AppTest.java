package xyz.nobaday.designpattern.decorator;

public class AppTest {

    public static void main(String[] args) {

        Espresso espresso = new Espresso();

        Mocha mocha = new Mocha(espresso);


        System.out.println(mocha.getDescription() +"  " + mocha.cost());

    }

}
