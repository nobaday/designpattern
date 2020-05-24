package xyz.nobaday.designpattern.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Baby {

    private String name;

    private List<Observer> observers;

    public Baby(String name) {
        this.name = name;
        observers = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Baby addObserver(Observer observer) {
        observers.add(observer);
        return this;
    }

    public void weakup() {
        Event<Baby> event = new Event<Baby>();
        event.setDate(new Date());
        event.setSource(this);

        for (Observer observer : observers) {
            observer.doSomething(event);
        }
    }

}
