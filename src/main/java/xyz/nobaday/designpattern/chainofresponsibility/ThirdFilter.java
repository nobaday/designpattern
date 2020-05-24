package xyz.nobaday.designpattern.chainofresponsibility;

public class ThirdFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        String msg = request.getMsg();
        msg += "-->third request";
        request.setMsg(msg);

        filterChain.doFilter(request, response);

        String result = response.getResult();
        result += "-->third response";
        response.setResult(result);
    }
}
