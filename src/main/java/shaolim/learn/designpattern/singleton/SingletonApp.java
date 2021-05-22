package shaolim.learn.designpattern.singleton;

public class SingletonApp {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        SingletonWithEagerInstantiate singleton2 = SingletonWithEagerInstantiate.getInstance();
        SingletonWithDoubleLockChecking singleton3 = SingletonWithDoubleLockChecking.getInstance();

        Singleton.getInstance();
        SingletonWithEagerInstantiate.getInstance();
        SingletonWithDoubleLockChecking.getInstance();
    }
}
