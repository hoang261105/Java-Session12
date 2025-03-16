package Bai8;

public class Food extends Product{
    public Food(String name, int price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return 5;
    }
}
