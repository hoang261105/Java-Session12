package Bai9;

public abstract class Vehicle {
    private String name;

    public Vehicle() {
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void move();

    public abstract void sound();

    public void move(int time, int speed) {
        int distance = time * speed;
        System.out.println(name + " đã di chuyển được " + distance + " km.");
    }
}
