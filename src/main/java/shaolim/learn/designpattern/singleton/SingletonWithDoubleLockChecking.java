package shaolim.learn.designpattern.singleton;

// singleton with double lock checking give no performance concern since we only synchronize the first time
// but little bit complicated
public class SingletonWithDoubleLockChecking {
    // volatile keyword ensures that multiple threads handle instance correctly when it being modified
    private volatile static SingletonWithDoubleLockChecking instance;

    private SingletonWithDoubleLockChecking() {
        System.out.println("SingletonWithDoubleLockChecking created");
    }

    public static SingletonWithDoubleLockChecking getInstance() {
        if (instance == null) {
            synchronized (SingletonWithDoubleLockChecking.class) {
                if (instance == null) {
                    instance = new SingletonWithDoubleLockChecking();
                }
            }
        }

        return instance;
    }
}
