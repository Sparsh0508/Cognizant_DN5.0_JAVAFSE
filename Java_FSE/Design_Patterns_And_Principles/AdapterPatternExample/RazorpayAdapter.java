public class RazorpayAdapter implements PaymentProcessor {

    private RazorpayGateway gateway;

    public RazorpayAdapter() {
        gateway = new RazorpayGateway();
    }

    @Override
    public void processPayment(double amount) {
        gateway.makeTransaction(amount);
    }
}
