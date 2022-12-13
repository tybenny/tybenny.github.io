package constructor_practice;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "iceice";
        employee.age = 20;
        employee.address = "Hanoi";
        employee.totalHours = 80;

        employee.printInfo();
        System.out.println(employee.getSalary());

        Employee employee1 = new Employee("so2", 42, "Hn", 230);
        System.out.println(employee1.getSalary());
    }
}
