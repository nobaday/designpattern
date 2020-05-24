package xyz.nobaday.designpattern.template;

import java.util.ArrayList;

public class Template1 extends ExecutionTimeTemplate {

    protected void code() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10000; i++) {
            list.add(0, i);
        }
    }
}
