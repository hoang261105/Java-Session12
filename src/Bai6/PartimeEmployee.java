package Bai6;

public class PartimeEmployee extends Employee{
    private double workingHours;

    public PartimeEmployee(String name, int age, double basicSalary, double workingHours) {
        super(name, age, basicSalary);
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return workingHours * this.getBasicSalary();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("Giờ làm việc: %.2f\n", this.workingHours);
        System.out.printf("Tổng tiền: %.2f\n", calculateSalary());
    }
}
