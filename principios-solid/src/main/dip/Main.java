package dip;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de diferentes métodos de pago
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod payPal = new PayPalPayment();
        PaymentMethod crypto = new CryptoPayment();

        // Crear procesadores de pago con diferentes métodos
        PaymentProcessor creditCardProcessor = new PaymentProcessor(creditCard);
        PaymentProcessor payPalProcessor = new PaymentProcessor(payPal);
        PaymentProcessor cryptoProcessor = new PaymentProcessor(crypto);

        // Probar los diferentes métodos de pago
        creditCardProcessor.makePayment(175.0);
        payPalProcessor.makePayment(250.0);
        cryptoProcessor.makePayment(325.0);
    }
}