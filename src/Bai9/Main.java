package Bai9;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle bike = new Bike("Honda Bike");
        Vehicle bus = new Bus("School Bus", 50);
        Vehicle airplane = new Airplane("Boeing 747", 10000);

        System.out.println("=== Di chuyển và âm thanh của các phương tiện ===");
        car.move();
        car.sound();
        car.move(2, 80);

        System.out.println();

        bike.move();
        bike.sound();
        bike.move(1, 20);

        System.out.println();

        bus.move();
        bus.sound();
        bus.move(3, 60);

        System.out.println();

        airplane.move();
        airplane.sound();
        airplane.move(5, 900);
    }
}
