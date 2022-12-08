import java.util.Scanner;

public class practicee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten ban: ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi cua ban: ");
        int age = sc.nextInt();
        System.out.println("Gioi tinh: ");
        String sex = sc.nextLine();
        System.out.println("Dia chi cua ban: ");
        String address = sc.nextLine();
        System.out.println("Xin chao cac ban, " + "minh ten la " + name + ", nam nay minh "
        + age + " tuoi, gioi tinh " + sex + ". Hien minh dang song va lam viec tai " + address);
    }
}
