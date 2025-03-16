package Bai6;

public class Intern extends Employee{
    public Intern(String name, int age, double basicSalary) {
        super(name, age, basicSalary);
    }

    @Override
    public double calculateSalary() {
        return this.getBasicSalary();
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
