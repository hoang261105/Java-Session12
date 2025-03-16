package Bai9;

public class Bike extends Vehicle {
    public Bike(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " di chuyển tốc độ chậm");
    }

    @Override
    public void sound() {
        System.out.println("Ring ring");
    }
}
