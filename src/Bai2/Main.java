package Bai2;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("Tổng các số a+b là: " + cal.add(1, 2));
        System.out.println("Tổng các số a+b+c là: " + cal.add(1, 2, 3));
    }
}
