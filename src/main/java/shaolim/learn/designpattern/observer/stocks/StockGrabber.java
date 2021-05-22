package shaolim.learn.designpattern.observer.stocks;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {
    private List<Observer> observerList = new ArrayList<>();

    public void register(Observer observer) {
        observerList.add(observer);
    }

    public void unregister(Observer observer) {
        observerList.remove(observer);
        observer.unsubscribe();
    }

    public void notifyObserver(Stock stock) {
        for (Observer observer : observerList) {
            observer.update(stock);
        }
    }
}
