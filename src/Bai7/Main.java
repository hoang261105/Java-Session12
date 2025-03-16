package Bai7;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car();
        vehicles[1] = new Bike();
        vehicles[2] = new Bus();

        for (Vehicle v : vehicles){
            if(v instanceof Car){
                System.out.println(v.move());
                System.out.println(v.sound());
            }else if(v instanceof Bike){
                System.out.println(v.move());
                System.out.println(v.sound());
            }else{
                System.out.println(v.move());
                System.out.println(v.sound());
            }
        }
    }
}
