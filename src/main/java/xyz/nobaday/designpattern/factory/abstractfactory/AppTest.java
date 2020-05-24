package xyz.nobaday.designpattern.factory.abstractfactory;

public class AppTest {

    public static void main(String[] args) {
        ShaxianFactory shaxianFactory = new ShaxianFactory();
        Business business = new Business();

        business.order(shaxianFactory);
    }

}
