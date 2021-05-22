package shaolim.learn.designpattern.observer.stocks;

import java.util.UUID;

public class StockObserver implements Observer {
    private String id;

    public StockObserver(Subject subject) {
        id = UUID.randomUUID().toString();
        subject.register(this);
    }

    @Override
    public void update(Stock stock) {
        printStock(stock);
    }

    private void printStock(Stock stock) {
        System.out.println("ObserverId: " + id + "Stock symbol: " + stock.getSymbol() + " price: " + stock.getPrice());
    }

    @Override
    public void unsubscribe() {
        System.out.println("ObserverId: " + id + " Unsubscribe");
    }
}
