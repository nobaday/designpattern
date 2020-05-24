package xyz.nobaday.designpattern.decorator;

public abstract class Bervage {

    private String description;

    public Bervage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    abstract double cost();

}
