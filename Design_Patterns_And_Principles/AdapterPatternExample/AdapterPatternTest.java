public class AdapterPatternTest {

    public static void main(String[] args) {

        PaymentProcessor payment1 = new PayPalAdapter();
        payment1.processPayment(5000);

        System.out.println();

        PaymentProcessor payment2 = new RazorpayAdapter();
        payment2.processPayment(7500);
    }
}
