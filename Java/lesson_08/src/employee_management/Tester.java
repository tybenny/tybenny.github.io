package employee_management;

public class Tester extends Employee{
    private int error;

    public Tester() {
    }

    public Tester(int id, String name, int age, String phone, String email, int salaryBasic, int error) {
        super(id, name, age, phone, email, salaryBasic);
        this.error = error;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public int getSalary(){
        return super.getSalaryBasic() + error * 50_000;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "error=" + error +
                '}';
    }
}
