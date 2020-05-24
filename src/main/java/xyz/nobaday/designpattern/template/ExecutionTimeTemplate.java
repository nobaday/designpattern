package xyz.nobaday.designpattern.template;

public abstract class ExecutionTimeTemplate {

    public void calculate() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("程序耗时" + (end - start) +"ms");
    }

    protected abstract void code();

}
