package Bai5;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(10, 15);
        shapes[2] = new Square(10);

        for(Shape shape : shapes) {
            if(shape instanceof Circle) {
                System.out.println("Diện tích hình tròn là: " + shape.area());
            }else if(shape instanceof Rectangle) {
                System.out.println("Diện tích hình chữ nhật là: " + shape.area());
            }else{
                System.out.println("Diện tích hình vuông là: " + shape.area());
            }
        }
    }
}
