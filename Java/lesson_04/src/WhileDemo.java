import java.util.Random;
import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {

//     Sử dụng vòng lặp while cho người dùng nhập vào 1 số bất kỳ (number) từ bàn phím
//     (quá trình nhập diễn ra liên tục, chỉ kết thúc vòng lặp khi nào thỏa mãn điều kiện)

        Scanner sc = new Scanner(System.in);
//        int option = 0;
//        boolean isQuit = false;
//        while (!isQuit){
//            System.out.print("Nhập vào số bất kỳ : ");
//            option = sc.nextInt();
//
//            if(option == 0){
//                System.out.println("Số phải khác 0. Nhập lại !!!");
//            }
//            else {
//                System.out.println("Số vừa nhập là: " + option);
//                isQuit = true;
//            }
//        }

        Random rand = new Random();
        int upperbound = 101;
        int int_random = rand.nextInt(upperbound);
        System.out.println(int_random);
        boolean isQuit = false;
        int userNumber = 0;

        while (!isQuit){
            System.out.print("Nhập vào số bất kỳ : ");
            userNumber = sc.nextInt();

            if (userNumber > int_random){
                System.out.println("Bạn nhập số lớn hơn rồi, cho nhập lại");
            } else if (userNumber < int_random){
                System.out.println("Bạn nhập số nhỏ hơn rồi, cho nhập lại");
            }
            else {
                System.out.println("Chúc mừng bạn nhập đúng rồi");
                isQuit = true;
            }
        }
    }
}
