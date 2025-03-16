package Bai10;

public class Cash extends PaymentMethod {
    public Cash(double amount) {
        super(amount);
    }

    @Override
    public double processPayment() {
        double fee = calculateFee();
        return this.getAmount() + fee;
    }

    @Override
    public double calculateFee() {
        return 0;
    }

    @Override
    public String processPayment(double amount, String currency) {
        return amount + " " + currency;
    }
}
