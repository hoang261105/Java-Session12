package polymorphism;

public class Demo {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.add(4, 6);
        emp.add(7.2F, 9.5F);
        emp.add(4, 5, 6);

        Story story = new Story();

        story.display();
    }
}
