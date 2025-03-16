package Bai8;

public class Electronics extends Product{
    public Electronics(String name, int price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return 10;
    }
}
