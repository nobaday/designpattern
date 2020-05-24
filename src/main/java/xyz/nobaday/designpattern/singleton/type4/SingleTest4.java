package xyz.nobaday.designpattern.singleton.type4;

public class SingleTest4 {

}

class Singleton {

    private static class SingleInstance {
        private static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingleInstance.INSTANCE;
    }

}
