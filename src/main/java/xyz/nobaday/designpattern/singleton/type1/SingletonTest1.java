package xyz.nobaday.designpattern.singleton.type1;

public class SingletonTest1 {

    public static void main(String[] args) {
        Test test = new Test();
    }

}

class Test {

    private final int a;

//    private static Test b = new Test();
    private Test b = new Test();

    {
        a = 10;
        System.out.println("构造块执行");
    }

    static {
        System.out.println("静态块1执行");
    }

    static {
        System.out.println("静态块2执行");
    }

    public Test() {
        System.out.println("构造方法执行");
    }

}


// 饿汉式
class Singleton {

    // 1.内部创建对象实例
    private static final Singleton INSTANCE = new Singleton();

    // 2.无参构造方法私有化
    private Singleton() {
    }

    // 3.public的静态方法
    public static Singleton getInstance() {
        return INSTANCE;
    }
}
