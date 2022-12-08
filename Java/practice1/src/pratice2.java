import java.util.Scanner;

public class pratice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        double chieudai = sc.nextDouble();
        System.out.println("Nhap chieu rong: ");
        double chieurong = sc.nextDouble();
        double chuvi = chieudai*2 + chieurong*2;
        System.out.println("Chu vi hinh chu nhat la: " + chuvi);
        double dientich = chieudai * chieurong;
        System.out.println("Dien tich hinh chu nhat la: " + dientich);
    }

}
