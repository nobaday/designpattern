package xyz.nobaday.designpattern.singleton.type3;

public class SingletonTest3 {

}

// 双重校验锁
class Singleton {

    private static Singleton INSTANCE;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                // 不判断是不安全的，如果同时多个线程通过外层if，就会创建多个实例
                if (INSTANCE != null) {
                    return new Singleton();
                }
            }
        }

        return INSTANCE;
    }

}
