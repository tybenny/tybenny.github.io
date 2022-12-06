import java.util.Scanner;

public class MenuDemo {
    public static void main(String[] args) {
        // object Scanner: Lấy thông tin nhập vào từ bàn phím
        Scanner sc = new Scanner(System.in);

        //Option: giá trị nhập từ bàn phim
        int option = 0;

        //cho biết khi nào thì thoát chương trình
        boolean isQuit = false;

        while (!isQuit) {
            showMenu();

            System.out.print("Nhập lựa chọn : ");
            option = sc.nextInt();

            switch (option) {
                case 1: {
                    doFunctionOne();
                    break;
                }
                case 2: {
                    doFunctionTwo();
                    break;
                }
                case 3: {
                    doFunctionThree();
                    break;
                }
                case 4: {
                    isQuit = true;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
                }
            }
        }
    }

    public static void doFunctionOne() {
        System.out.println("Thực hiện chức năng 1");
    }

    public static void doFunctionTwo() {
        System.out.println("Thực hiện chức năng 2");
    }

    public static void doFunctionThree() {
        System.out.println("Thực hiện chức năng 3");
    }


    //menu hướng dẫn sử dụng
    public static void showMenu() {
        System.out.println("\n********* MENU *********");
        System.out.println("1 - Chức năng 1");
        System.out.println("2 - Chức năng 2");
        System.out.println("3 - Chức năng 3");
        System.out.println("4 - Thoát\n");
    }

}
