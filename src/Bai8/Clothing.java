package Bai8;

public class Clothing extends Product{
    public Clothing(String name, int price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return 20;
    }
}
