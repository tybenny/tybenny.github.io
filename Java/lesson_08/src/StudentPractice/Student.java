package StudentPractice;

public class Student {
    private String id;
    private double avgPoint;
    private int age;
    private String lop;

    public Student() {
    }

    public Student(String id, double avgPoint, int age, String lop) {
        setId(id);
        setAvgPoint(avgPoint);
        setAge(age);
        setLop(lop);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id.length() != 8){
            System.out.println("Độ dài id phải = 8");
            return;
        }
        this.id = id;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        if(avgPoint < 0 || avgPoint > 10){
            System.out.println("Điểm không hợp lệ !!");
            return;
        }
        this.avgPoint = avgPoint;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 ){
            System.out.println("Tuoi phải lớn hơn hoặc bằng 18!!");
            return;
        }
        this.age = age;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        if(!lop.startsWith("A") && !lop.startsWith("C")){
            System.out.println("Tên lớp phải bắt đầu bằng A hoặc C");
            return;
        }
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", avgPoint=" + avgPoint +
                ", age=" + age +
                ", lop='" + lop + '\'' +
                '}';
    }

    public void showInfo(){
        System.out.println(this);
    }

    public void calculateScholarship(){
        if(avgPoint >= 8){
            System.out.println("Nhan được học bổng");
        } else {
            System.out.println("Không nhận được học bổng");
        }
    }
}
