package shaolim.learn.designpattern.observer.stocks;

public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObserver(Stock stock);
}
