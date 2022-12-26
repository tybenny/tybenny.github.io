package abstract_class;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public abstract class Employee {
    private int id;
    private String name;
    private int age;
    private int salaryBasic;

    public void register(){
        System.out.println("Register ... ");
    }

    //tính lương
    abstract public int calculateSalary();

    abstract void showInfo();
}

