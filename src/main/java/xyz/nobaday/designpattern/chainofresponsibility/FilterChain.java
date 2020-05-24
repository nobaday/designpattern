package xyz.nobaday.designpattern.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {

    private List<Filter> chain;

    private int index;

    public FilterChain() {
        chain = new ArrayList<>();
        index = 0;
    }

    public void addFilter(Filter filter) {
        chain.add(filter);
    }

    public void doFilter(Request request, Response response) {
        if (index == chain.size()) {
            return;
        }

        Filter filter = chain.get(index++);
        filter.doFilter(request, response, this);
    }
}
