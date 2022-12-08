import java.util.Arrays;
import java.util.Scanner;

public class Array2dDemo {
    public static void main(String[] args) {
        int [] numbers = {1,2,3};

        int [][] numbersOther = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

//        for (int i = 0; i < numbersOther.length; i++ ){
//            System.out.println(Arrays.toString(numbersOther[i]));
//
//            for (int j = 0; j < numbersOther[j].length; j++) {
//                System.out.println(numbersOther[i][j]);
//            }
//        }

        for (int[] row : numbersOther){
            for (int number : row
                 ) {
                System.out.println(number);
            }
        }

        //giá sách
        //1 chiều: lặp qua từng quyển sách
        //2 chiều: lặp qua từng quyển sách, mỗi quyển lặp từng trang sách
        //3 chiều: lặp qua từng quyển sách, mỗi quyển lặp từng trang sách,
        //môi trang sách lặp từng dòng.

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số hàng: ");
        int row = sc.nextInt();

        System.out.println("Nhập vào số cột: ");
        int col = sc.nextInt();

        int[][] array = new int [row][col];


        //nhap thong tin mảng
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập vào phần tử [%d][%d] : ", i, j);
                array[i][j] = sc.nextInt();
            }
        }

        // in ra mảng ở dạng ma trận
        for (int[] subArray : array){
            for (int number : subArray){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
