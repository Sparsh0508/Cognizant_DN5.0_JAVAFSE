public class StrategyPatternTest {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCard =
                new CreditCardPayment("1234-5678-9876", "Rahul Sharma");

        PaymentStrategy paypal =
                new PayPalPayment("rahul@gmail.com");

        System.out.println("----- Credit Card Payment -----");
        context.setPaymentStrategy(creditCard);
        context.makePayment(2500);

        System.out.println();

        System.out.println("----- PayPal Payment -----");
        context.setPaymentStrategy(paypal);
        context.makePayment(4500);
    }
}
