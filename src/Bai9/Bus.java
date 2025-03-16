package Bai9;

public class Bus extends Vehicle {
    private int seats;

    public Bus(String name, int seats) {
        super(name);
        this.seats = seats;
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " di chuyển trên mặt đất với " + this.seats + " chỗ ngồi");
    }

    @Override
    public void sound() {
        System.out.println("Honk");
    }
}
