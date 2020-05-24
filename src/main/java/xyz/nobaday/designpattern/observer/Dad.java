package xyz.nobaday.designpattern.observer;

public class Dad implements Observer {

    @Override
    public void doSomething(Event<Baby> event) {
        Baby baby = event.getSource();
        String name = baby.getName();

        System.out.println(name + " Don't cry, i'm playing games");
    }
}
