package employee_management;

public class Test {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setName("so");
        developer.setAge(20);
        developer.setOvertimeHours(30);
        developer.setSalaryBasic(10_000_000);
        developer.setId(433);
        developer.setPhone("0978867432");
        developer.setEmail("so@mail.co");

        System.out.println(developer);
        System.out.println(developer.getSalary());

        Tester [] testers = new Tester[3];

    }
}
