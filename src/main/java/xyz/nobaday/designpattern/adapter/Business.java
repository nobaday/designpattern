package xyz.nobaday.designpattern.adapter;

public class Business {

    public static void doBusiness(Processor processor, Object input) {
        System.out.println("处理器为：" + processor.getName());
        System.out.println("处理结果为：" + processor.process(input));
    }

}
