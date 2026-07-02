public class PayPalPayment implements PaymentStrategy {

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment Successful using PayPal");
        System.out.println("PayPal Account : " + email);
        System.out.println("Amount Paid : ₹" + amount);
    }
}
