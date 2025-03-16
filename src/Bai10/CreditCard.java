package Bai10;

public class CreditCard extends PaymentMethod{
    public CreditCard(double amount) {
        super(amount);
    }

    @Override
    public double processPayment() {
        double fee = calculateFee();
        return this.getAmount() + fee;
    }

    @Override
    public double calculateFee() {
        return this.getAmount() * 0.02;
    }

    @Override
    public String processPayment(double amount, String currency) {
        return amount + " " + currency;
    }
}
