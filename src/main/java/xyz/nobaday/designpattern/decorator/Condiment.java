package xyz.nobaday.designpattern.decorator;

public abstract class Condiment extends Bervage {

    protected Bervage bervage;

    public Condiment(Bervage bervage) {
        super(bervage.getDescription());
        this.bervage = bervage;
    }

}
