package xyz.nobaday.designpattern.chainofresponsibility;

public interface Filter {

    public void doFilter(Request request, Response response, FilterChain filterChain);

}
