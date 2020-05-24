package xyz.nobaday.designpattern.adapter;

public class LowerCaseProcessor implements Processor {

    public String getName() {
        return getClass().getSimpleName();
    }

    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}
