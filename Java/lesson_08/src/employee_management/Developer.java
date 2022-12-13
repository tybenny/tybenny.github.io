package employee_management;

public class Developer extends Employee {
    private int overtimeHours;

    public Developer() {
    }

    public Developer(int id, String name, int age, String phone, String email, int salaryBasic, int overtimeHours) {
        super(id, name, age, phone, email, salaryBasic);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public int getSalary(){
        return super.getSalaryBasic() + overtimeHours * 200_000;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "overtimeHours=" + overtimeHours +
                "} " + super.toString();
    }
}
