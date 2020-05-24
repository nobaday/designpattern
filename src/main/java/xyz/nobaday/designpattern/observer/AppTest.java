package xyz.nobaday.designpattern.observer;

public class AppTest {

    public static void main(String[] args) {
        Baby james = new Baby("James");

        Dad dad = new Dad();
        Babysitter babysitter = new Babysitter();
        james.addObserver(dad).addObserver(babysitter);

        james.weakup();
    }

}
