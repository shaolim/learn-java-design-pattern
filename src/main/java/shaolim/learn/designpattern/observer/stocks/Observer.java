package shaolim.learn.designpattern.observer.stocks;

public interface Observer {
    void update(Stock stock);
    void unsubscribe();
}
