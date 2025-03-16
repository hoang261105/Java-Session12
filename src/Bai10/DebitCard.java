package Bai10;

public class DebitCard extends PaymentMethod{
    public DebitCard(double amount) {
        super(amount);
    }

    @Override
    public double processPayment() {
        double fee = calculateFee();
        return this.getAmount() + fee;
    }

    @Override
    public double calculateFee() {
        return this.getAmount() * 0.01;
    }

    @Override
    public String processPayment(double amount, String currency) {
        return amount + " " + currency;
    }
}
