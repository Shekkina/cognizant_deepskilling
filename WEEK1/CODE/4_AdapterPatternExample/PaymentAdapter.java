public class PaymentAdapter implements PaymentProcessor {
    private ThirdPartyPayment thirdParty;

    public PaymentAdapter(ThirdPartyPayment thirdParty) {
        this.thirdParty = thirdParty;
    }

    public void processPayment(double amount) {
        thirdParty.makePayment(amount);
    }
}