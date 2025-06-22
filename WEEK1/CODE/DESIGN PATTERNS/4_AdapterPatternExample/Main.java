public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentAdapter(new ThirdPartyPayment());
        processor.processPayment(250.0);
    }
}