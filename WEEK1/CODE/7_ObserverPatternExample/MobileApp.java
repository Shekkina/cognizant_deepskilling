public class MobileApp implements Observer {
    public void update(String stockName, double price) {
        System.out.println("MobileApp: " + stockName + " is now $" + price);
    }
}