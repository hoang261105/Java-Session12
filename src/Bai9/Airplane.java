package Bai9;

public class Airplane extends Vehicle {
    private int altitude;

    public Airplane(String name, int altitude) {
        super(name);
        this.altitude = altitude;
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " di chuyển trên không với độ cao " + this.altitude + "m");
    }

    @Override
    public void sound() {
        System.out.println("Whoosh");
    }
}
