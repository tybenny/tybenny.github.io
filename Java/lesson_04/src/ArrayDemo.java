import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arrayA[] = new int[n];
        System.out.print("Nhập chiều dài mảng : ");
        for (int i = 0; i < n; i++) {
            int j = i+1;
            System.out.println("Nhập vào phần tử thứ " + j + " của mảng:");
            arrayA[i] = sc.nextInt();

        }
        System.out.println("Mảng A: " + Arrays.toString(arrayA));

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arrayA[i];
        }
        System.out.println("Tổng của mảng là: " + sum);

        Arrays.sort(arrayA);
        System.out.println("Thứ tự sắp xep: " + Arrays.toString(arrayA));

    }
}
