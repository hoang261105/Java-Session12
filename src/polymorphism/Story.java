package polymorphism;

public class Story extends Book {
    /*
        Overriding - ghi đè
        Điều kiện ghi đè
        1. Điều kiện cần
        - Phải có quan hệ kế thừa
        2. Điều kiện đủ
        - CÙng kiểu dữ liệu trả về, cùng tên phương thức, cùng tên tham số
        - Bổ từ truy cập ghi đè của phương thuc ghi dè phải có phạm vị lớn hơn hoặc bằng phương thức bi ghi đè
     */

    @Override
    public void display() {
        System.out.println("Thong tin truyện");
    }

    public String toString(){
        return "Ghi đè phương thức toString của object";
    }
}
