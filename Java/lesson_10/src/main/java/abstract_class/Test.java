package abstract_class;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Developer(1, "so", 27, 20_000_000, 30);
        System.out.println(employee.calculateSalary());

        Employee employee1 = new Tester(2, "boo", 16, 10_000_000, 15);
        System.out.println(employee1.calculateSalary());

        System.out.println();
        //Tạo 1 ds nhân viên
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(employee);
        employees.add(employee1);
        employees.add(new Developer(29, "ab2", 23, 50_000_000, 15));
        for (Employee e:employees
             ) {
            System.out.println(e.calculateSalary());
        }

        //sắp xếp theo lương giam dần
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.calculateSalary() - o1.calculateSalary();
            }
        });

        System.out.println("luong giam dan");
        for (Employee e: employees
             ) {
            e.showInfo();
        }

        //sắp xếp tuổi tăng dần
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("tuổi tăng dần");
        for (Employee e: employees
             ) {
            e.showInfo();
        }

        employees.forEach(Employee::showInfo);

        //sử dụng stream (demo)
        //stream, method reference, lambda expression

        System.out.println("lương cơ bản tăng dần");
        employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalaryBasic))
                .forEach(Employee::showInfo);
    }
}
