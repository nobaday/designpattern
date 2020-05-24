package xyz.nobaday.designpattern.singleton.type2;

public class SingletonTest2 {



}


// 懒汉式
class Singleton {

    private static Singleton INSTANCE;

    private Singleton () {

    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }

}
