package xyz.nobaday.designpattern.chainofresponsibility;

public class AppTest {

    public static void main(String[] args) {
        FirstFilter firstFilter = new FirstFilter();
        SecondFilter secondFilter = new SecondFilter();
        ThirdFilter thirdFilter = new ThirdFilter();

        FilterChain filterChain = new FilterChain();

        filterChain.addFilter(firstFilter);
        filterChain.addFilter(secondFilter);
        filterChain.addFilter(thirdFilter);

        Request request = new Request();
        request.setMsg("hello");

        Response response = new Response();
        response.setResult("ok");
        filterChain.doFilter(request, response);

        System.out.println(request.getMsg());
        System.out.println(response.getResult());
    }

}
