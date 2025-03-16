package Bai6;

public class FullTimeEmployee extends Employee{
    private double bonus;

    public FullTimeEmployee(String name, int age, double basicSalary, double bonus) {
        super(name, age, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return this.getBasicSalary() + bonus;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("Thưởng: %.2f\n", this.bonus);
        System.out.printf("Tổng tiền: %.2f\n", calculateSalary());
    }
}
