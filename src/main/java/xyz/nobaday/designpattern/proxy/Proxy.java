package xyz.nobaday.designpattern.proxy;

public class Proxy implements Subject {

    private RealSubject realSubject = new RealSubject();

    @Override
    public void request() {
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void preRequest() {
        System.out.println("前置处理");
    }

    private void postRequest() {
        System.out.println("后置处理");
    }
}
