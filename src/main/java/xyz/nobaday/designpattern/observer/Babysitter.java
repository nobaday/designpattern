package xyz.nobaday.designpattern.observer;

import java.util.Date;

public class Babysitter implements Observer {

    @Override
    public void doSomething(Event<Baby> event) {
        String name = event.getSource().getName();
        Date date = event.getDate();

        System.out.println("log: " + name + " cried at " + date);
    }
}
