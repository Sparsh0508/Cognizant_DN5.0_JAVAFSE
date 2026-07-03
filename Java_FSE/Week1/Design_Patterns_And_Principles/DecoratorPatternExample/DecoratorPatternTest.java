public class DecoratorPatternTest {

    public static void main(String[] args) {

        Notifier notifier = new EmailNotifier();
        notifier = new SMSNotifier(notifier);
        notifier = new SlackNotifier(notifier);

        notifier.send("Your order has been delivered.");
    }
}
