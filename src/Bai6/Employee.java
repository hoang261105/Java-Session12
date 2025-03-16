package Bai6;

public class Employee {
    private String name;
    private int age;
    private double basicSalary;

    public Employee() {
    }

    public Employee(String name, int age, double basicSalary) {
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void showInfo(){
        System.out.printf("Tên: %s, Tuổi: %d, Lương cơ bản: %.2f\n", name, age, basicSalary);
    }
}
