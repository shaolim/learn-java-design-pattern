package shaolim.learn.designpattern.singleton;

// Singleton with synchronized solve multi threads issue but have performance concern since synchronization is expensive
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton created");
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
