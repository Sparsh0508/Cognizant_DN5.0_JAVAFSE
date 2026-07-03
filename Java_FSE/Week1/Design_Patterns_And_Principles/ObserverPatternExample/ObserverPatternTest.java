public class ObserverPatternTest {

    public static void main(String[] args) {

        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp("Rahul");
        Observer web = new WebApp("Stock Tracker");

        market.registerObserver(mobile);
        market.registerObserver(web);

        market.setStock("TCS", 3560.75);
        market.setStock("Infosys", 1498.50);

        market.removeObserver(mobile);

        market.setStock("Reliance", 2895.20);
    }
}
