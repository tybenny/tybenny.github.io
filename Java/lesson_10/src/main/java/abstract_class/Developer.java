package abstract_class;

public class Developer extends Employee {
    private int overtimeHours;

    public Developer(int id, String name, int age, int salaryBasic, int overtimeHours){
        super(id, name, age, salaryBasic);
        this.overtimeHours = overtimeHours;
    }


    @Override
    public int calculateSalary(){
        return this.getSalaryBasic() + this.overtimeHours*200_000;
    }

    @Override
    void showInfo(){
        String message = String.format("id : %d, name : %s, age : %d, salaryBasic : %d, overtimeHours : %d, salary : %d",
                this.getId(), this.getName(), this.getAge(), this.getSalaryBasic(), this.overtimeHours, this.calculateSalary());
        System.out.println(message);
    }
}
