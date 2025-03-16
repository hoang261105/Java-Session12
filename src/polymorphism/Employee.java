package polymorphism;

public class Employee {
    /*
        Overloadding: Nạp chồng:
        Điều kiện nạp chồng:
        1. Cần:
        - Các phương thức nạp chồng phải trong cùng 1 lớp
        - Các phương thức phải cùng tên
        2. Đủ:
        - Số lượng tham số khác nhau
        - Thứ tự tham số khác nhau
        - Kiểu dữ liệu tham số khác nhau
     */

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public void test(int num, String name) {

    }

    public void test(String name, int num) {

    }
}
