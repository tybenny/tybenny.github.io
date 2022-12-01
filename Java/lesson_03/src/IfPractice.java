import java.util.Scanner;

public class IfPractice {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chiều cao: ");
        double height = sc.nextDouble();

        System.out.println("nhập cân nặng: ");
        double weight = sc.nextDouble();
        double bmi = weight/(height*height);
        System.out.println("Chỉ số BMI của bạn là: "+bmi);

    }


    //Bai 2
    public static void getMark(int number) {

    }
}
