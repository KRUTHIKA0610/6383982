public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.payAmount(1200.00);

        context.setPaymentStrategy(new PayPalPayment());
        context.payAmount(800.00);
    }
}
