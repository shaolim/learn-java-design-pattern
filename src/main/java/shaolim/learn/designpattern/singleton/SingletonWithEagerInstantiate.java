package shaolim.learn.designpattern.singleton;

public class SingletonWithEagerInstantiate {
    private static SingletonWithEagerInstantiate instance = new SingletonWithEagerInstantiate();

    private SingletonWithEagerInstantiate() {
        System.out.println("SingletonWithEagerInstantiate created");
    }

    public static SingletonWithEagerInstantiate getInstance() {
        return instance;
    }
}
