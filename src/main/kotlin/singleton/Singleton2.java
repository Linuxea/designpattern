package singleton;

public class Singleton2 {

    private Singleton2() {
    }

    private final static class Singleton2Helper {
        private static final Singleton2 SINGLETON2 = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return Singleton2Helper.SINGLETON2;
    }


}
