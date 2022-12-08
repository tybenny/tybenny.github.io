import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int n = sc.nextInt();
        System.out.println("Nhập số cột: ");
        int m = sc.nextInt();
        int arrayA [][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Nhập phan tử: [" + i + "][" + j + "]");
                arrayA[i][j]= sc.nextInt();
            }
        }

        int max = arrayA[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < arrayA[i][j]){
                    max = arrayA[i][j];
            }

        }
        }
        System.out.println("Số lớn nhất là: " + max);
    }
}
