package xyz.nobaday.designpattern.chainofresponsibility;

public class SecondFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String msg = request.getMsg();
        msg += "-->second request";
        request.setMsg(msg);

        filterChain.doFilter(request, response);

        String result = response.getResult();
        result += "-->second response";
        response.setResult(result);
    }
}
