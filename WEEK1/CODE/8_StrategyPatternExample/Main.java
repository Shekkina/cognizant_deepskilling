public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        
        context.setPaymentStrategy(new CreditCardPayment());
        context.pay(100.0);

        context.setPaymentStrategy(new PayPalPayment());
        context.pay(200.0);
    }
}