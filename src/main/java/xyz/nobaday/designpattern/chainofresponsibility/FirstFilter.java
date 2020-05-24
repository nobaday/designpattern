package xyz.nobaday.designpattern.chainofresponsibility;

public class FirstFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String msg = request.getMsg();
        msg += "-->first request";
        request.setMsg(msg);

        filterChain.doFilter(request, response);

        String result = response.getResult();
        result += "-->first response";
        response.setResult(result);
    }
}
