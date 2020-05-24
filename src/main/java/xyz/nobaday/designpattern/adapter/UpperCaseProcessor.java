package xyz.nobaday.designpattern.adapter;

public class UpperCaseProcessor implements Processor {

    public String getName() {
        return getClass().getSimpleName();
    }

    // 返回类型的协变
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}
