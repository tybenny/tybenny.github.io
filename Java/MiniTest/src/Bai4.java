import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        //đếm n số nguyên tố đầu tiên
        Scanner sc = new Scanner(System.in);
        System.out.print("Tìm n số nguyên tố đầu tien. Nhập n = ");

        int n = sc.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int dem = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        while (dem < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
        System.out.println();
        soNguyenToNhoHon();
    }

    public static void soNguyenToNhoHon() {
       Scanner sc = new Scanner(System.in);
        System.out.print("Tìm số nguyên tố nhỏ hơn: ");
        int n = sc.nextInt();
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
        if (n <= 2) {
            System.out.print("Không có số nguyên tố nhỏ hơn 2");
        } else {
            System.out.print(2);
        }

        for (int i = 3; i < n; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
