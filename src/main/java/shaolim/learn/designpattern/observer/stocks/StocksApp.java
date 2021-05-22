package shaolim.learn.designpattern.observer.stocks;

import java.util.ArrayList;
import java.util.List;

public class StocksApp {
    private static List<Stock> stockList = new ArrayList<>();

    static {
        stockList.add(new Stock("ADRO", 1185));
        stockList.add(new Stock("ASSA", 2030));
        stockList.add(new Stock("AUTO", 1150));
    }

    public static void main(String[] args) {
        Subject subject = new StockGrabber();
        StockObserver observer1 = new StockObserver(subject);
        StockObserver observer2 = new StockObserver(subject);
        StockObserver observer3 = new StockObserver(subject);

        for (Stock stock : stockList) {
            subject.notifyObserver(stock);
        }

        subject.unregister(observer1);
        subject.unregister(observer2);

        subject.notifyObserver(new Stock("BMRI", 5925));
    }
}
