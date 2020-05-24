package xyz.nobaday.designpattern.adapter;

public class AppTest {

    public static void main(String[] args) {
        // 测试Business和Processor
        String input = "How are you?";
        Processor processor = new UpperCaseProcessor();

        Business.doBusiness(processor, input);
    }

}
