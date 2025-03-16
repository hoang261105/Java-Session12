package Bai9;

public class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " di chuyển trên mặt đất");
    }

    @Override
    public void sound() {
        System.out.println("Vroom");
    }
}
