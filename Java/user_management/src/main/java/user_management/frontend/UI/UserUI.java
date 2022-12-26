package user_management.frontend.UI;

import user_management.backend.controller.UserController;
import user_management.backend.request.UpdatePassword;
import user_management.backend.request.UpdateUserName;

import java.util.Scanner;

public class UserUI {
   private final UserController userController = new UserController();
    public void run() {

        Scanner sc = new Scanner(System.in);

        int option = 0;
        boolean isQuit = false;

        while(!isQuit)

        {
            showMenu();

            try {
                System.out.print("Nhập lựa chọn : ");
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Lựa chọn không hợp lệ");
                continue;
            }

            switch (option) {
                case 1: {
                    System.out.println("Nhập vào email của bạn: ");
                    String email = sc.nextLine();
                    System.out.println("Nhập vào password: ");
                    String password = sc.nextLine();
                    userController.checkLogin(email, password);
                    System.out.printf("\nChào mừng %s, bạn có thể thực hiện các công việc sau: ",
                            userController.findByEmail(email).getUserName());
                    int optionSubMenu = 0;
                    boolean isQuitSubMenu = false;

                    while (!isQuitSubMenu){
                        subMenu();
                        try {
                            System.out.print("Nhập lựa chọn : ");
                            optionSubMenu = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e){
                            System.out.println("Lựa chọn không hợp lệ");
                            continue;
                        }

                        switch (optionSubMenu){
                            case 1: {
                                System.out.print("Nhập vào username mới: ");
                                String username = sc.nextLine();
                                UpdateUserName request = new UpdateUserName(email, username);
                                userController.updateUserName(request);
                                System.out.println("Chúc mừng bạn đã đổi username thành công. " +
                                        "Username mới là " + request.getUserName());
                                break;
                            }

                            case 2: {
                                System.out.println("Nhập vào email mới: ");
                                String newEmail = sc.nextLine();
                                if (userController.checkEmail(newEmail)){
                                    userController.updateEmail(email, newEmail);
                                }
                                System.out.println("Chúc mừng bạn đổi email thành công. " +
                                        "Email mới là " + newEmail);
                                break;
                            }

                            case 3: {
                                System.out.println("Nhập vào mật khẩu mới: ");
                                String newPassword = sc.nextLine();
                                UpdatePassword request = new UpdatePassword(email, newPassword);
                                userController.updatePassword(request);
                                System.out.println("Chúc mừng bạn đã đổi password thành công !!");
                                break;
                            }

                            case 5: {
                                isQuitSubMenu = true;
                                isQuit = true;
                                break;
                            }
                            default: {
                                System.out.println("Lựa chọn không hợp lệ");
                            }
                        }
                    }
                    break;
                }

                case 2: {
                    System.out.print("Nhập username muốn tạo: ");
                    String userName = sc.nextLine();
                    System.out.print("Nhập vào email mới: ");
                    String email = sc.nextLine();
                    System.out.print("Nhập vào mật khẩu mới: ");
                    String password = sc.nextLine();

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

    public static void showMenu() {
        System.out.println("\n********* MENU *********");
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
        System.out.println("3 - Quên mật khẩu");
        System.out.println("4 - Thoát\n");
    }

    public static void subMenu() {
        System.out.println("\n\n1 - Thay đổi username");
        System.out.println("2 - Thay đổi email");
        System.out.println("3 - Thay đổi mật khẩu");
        System.out.println("4 - Đăng xuất");
        System.out.println("5 - Thoát chương trình");
    }
}
