package Bai8;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 15000);
        System.out.println("Mua 1 sp:");
        product1.displayInfo(1);

        System.out.println("Mua 150 sp:");
        product1.displayInfo(150);

        Electronics electronics = new Electronics("Electronics", 2000);
        System.out.println("Mua 1 sp:");
        electronics.displayInfo(1);

        System.out.println("Mua 120 sp:");
        electronics.displayInfo(120);

        Clothing clothing = new Clothing("Áo thun", 5000);
        System.out.println("Mua 1 sp:");
        clothing.displayInfo(1);

        System.out.println("Mua 50 sp:");
        clothing.displayInfo(50);

        Food food = new Food("Gà KFC", 12000);
        System.out.println("Mua 1 sp:");
        food.displayInfo(1);

        System.out.println("Mua 80 sp:");
        food.displayInfo(80);
    }
}
