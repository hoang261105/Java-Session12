package Bai10;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1000);
        DebitCard debitCard = new DebitCard(1000);
        Cash cash = new Cash(1000);


        System.out.printf("Total payment (Creadit Card): %.2f\n", creditCard.processPayment());
        System.out.printf("Process payment of %s with total: %s\n ",
                creditCard.processPayment(creditCard.getAmount(), "USD"),
                creditCard.processPayment(creditCard.processPayment(), "USD"));

        System.out.println();
        System.out.printf("Total payment (Debit Card): %.2f\n", debitCard.processPayment());
        System.out.printf("Process payment of %s with total: %s\n ",
                debitCard.processPayment(debitCard.getAmount(), "EUR"),
                debitCard.processPayment(debitCard.processPayment(), "EUR"));

        System.out.println();
        System.out.printf("Total payment (Cash): %.2f\n", cash.processPayment());
        System.out.printf("Process payment of %s with total: %s\n ",
                cash.processPayment(cash.getAmount(), "JPY"),
                cash.processPayment(cash.processPayment(), "JPY"));
    }
}
