public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.register(mobile);
        market.register(web);

        market.setStockData("TCS", 3520.50);
        market.setStockData("INFY", 1475.75);

        market.deregister(mobile);

        market.setStockData("WIPRO", 505.30);
    }
}
