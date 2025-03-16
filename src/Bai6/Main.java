package Bai6;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new PartimeEmployee("Trang", 19, 4000000, 4);
        employees[1] = new FullTimeEmployee("Huyền", 20, 5000000, 2000000);
        employees[2] = new Intern("Phanh", 21, 3000000);

        for (Employee employee : employees) {
            employee.showInfo();
        }
    }
}
