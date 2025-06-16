package dip;

public class CryptoPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing crypto payment of $" + amount);
    }
}