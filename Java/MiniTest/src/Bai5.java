import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        arrayTest();
    }

    public static void arrayTest(){
        Scanner sc = new Scanner(System.in);

        int m;
        int n;
        do {
            System.out.print("Nhập vào số hàng của mảng: ");
            m = sc.nextInt();
            System.out.print("Nhập vào số cột của mảng: ");
            n = sc.nextInt();
        } while (m < 1 || n < 1);

        int arrayA [][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phan tử A[" + i + "][" + j + "] : ");
                arrayA[i][j]= sc.nextInt();
            }
        }

        System.out.println("Các phần tử của mảng A là : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrayA[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Các phần tử nằm trên đường chéo chính là: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j){
                    System.out.print(arrayA[i][j] + " ");
                }
            }
        }

        System.out.println();
        int arrayB [][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập phan tử B[" + i + "][" + j + "] : ");
                arrayB[i][j]= sc.nextInt();
            }
        }

        System.out.println("Các phần tử của mảng B là : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrayB[i][j] + " ");
            }
            System.out.println();
        }


        int arrayC[][] = new int [m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arrayC[i][j] = arrayA[i][j] + arrayB[i][j];
            }
        }

        System.out.println("Ma trận tổng C là: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrayC[i][j] + " ");
            }
            System.out.println();
        }
    }
}
