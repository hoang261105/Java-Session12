package Bai8;

public class Product {
    private String name;
    private int price;

    public Product() {
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getDiscount() {
        return 0;
    }

    public double getFinalPrice() {
        return price - (price * getDiscount() / 100);
    }

    public double getFinalPrice(int quantity) {
        double discount = getDiscount(quantity);
        return price - (price * discount / 100);
    }

    public double getDiscount(int quantity) {
        if(quantity > 100){
            return 5;
        }
        return getDiscount();
    }

    public void displayInfo(int quantity) {
        System.out.println("Sản phẩm: " + name);
        System.out.println("Giá gốc: $" + price);
        System.out.println("Chiết khấu: " + getDiscount(quantity) + "%");
        System.out.println("Giá sau chiết khấu: $" + getFinalPrice(quantity));
    }
}
