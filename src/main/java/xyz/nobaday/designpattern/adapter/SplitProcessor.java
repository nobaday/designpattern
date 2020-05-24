package xyz.nobaday.designpattern.adapter;

import java.util.Arrays;

public class SplitProcessor implements Processor {

    public String getName() {
        return getClass().getSimpleName();
    }

    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
