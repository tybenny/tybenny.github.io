package user_management.frontend.UI;

import user_management.backend.controller.UserController;
import user_management.backend.request.*;

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
                    System.out.print("Email đăng nhập: ");
                    String email = sc.nextLine();
                    System.out.print("Nhập password: ");
                    String password = sc.nextLine();
                    LoginRequest loginRequest = new LoginRequest(email, password);
                    userController.checkLoginRequest(loginRequest);

                    System.out.println();
                    System.out.println("Chào mừng " + userController.findByEmail(email).getUserName() + ", bạn có thể làm những công việc sau: ");
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
                                String changeUserName = sc.nextLine();
                                UpdateUsername updateUsernameRequest = new UpdateUsername(email, changeUserName);
                                userController.updateUserName(updateUsernameRequest);
                                System.out.println("Chúc mừng bạn đã đổi username thành công. " +
                                        "Username mới của bạn là " + changeUserName);
                                break;
                            }

                            case 2: {
                                System.out.print("Nhập vào email mới: ");
                                String changeEmail = sc.nextLine();
                                if (userController.checkEmail2(changeEmail)){
                                    userController.updateEmail(email, changeEmail);
                                } else {
                                    System.out.println("Email không hợp lệ !!");
                                    break;
                                }
                                break;
                            }

                            case 3: {
                                System.out.print("Nhập vào password mới: ");
                                String changePassword = sc.nextLine();
                                if (userController.checkPasswordValid(changePassword)){
                                    UpdatePassword updatePasswordRequest = new UpdatePassword(email, changePassword);
                                    userController.updatePassword(updatePasswordRequest);
                                    System.out.println("Chúc mừng bạn đã đổi password thành công !!");
                                } else {
                                    System.out.println("Password chứa 7-15 kí tự !!");
                                }

                                break;
                            }

                            case 4: {
                                isQuitSubMenu = true;
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
                    System.out.print("Nhập vào email mới: ");
                    String newEmail = sc.nextLine();
                    if (userController.checkEmail2(newEmail) == false){
                        System.out.println("Email không hợp lệ!!");
                        break;
                    }
                    System.out.print("Nhập username muốn tạo: ");
                    String newUserName = sc.nextLine();
                    System.out.print("Nhập vào mật khẩu mới: ");
                    String newPassword = sc.nextLine();
                    if (userController.checkPasswordValid(newPassword) == false){
                        System.out.println("Password dài từ 7-15 ký tự !!");
                        break;
                    }
                    CreateRequest request = new CreateRequest(newEmail, newUserName, newPassword);
                    userController.createUser(request);
                    System.out.println("Chúc mừng bạn đã tạo thành công tài khoản mới !!");
                    break;
                }

                case 3: {
                    System.out.print("Nhập vào email của bạn: ");
                    String forgotEmail = sc.nextLine();
                    if (userController.checkEmailExist(forgotEmail)){
                        System.out.print("Nhập password mới: ");
                        String forgotPassword = sc.nextLine();
                        if (userController.checkPasswordValid(forgotPassword) == false){
                            System.out.println("Password dài từ 7-15 ký tự !!");
                            break;
                        }
                        userController.updatePasswordForgot(forgotEmail, forgotPassword);
                        System.out.println("Bạn đã đổi password thành công !!");
                    } else {
                        System.out.println("Email không hợp lệ !!");
                        break;
                    }
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

    public static void showMenu() {
        System.out.println("\n********* MENU *********");
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
        System.out.println("3 - Quên mật khẩu");
        System.out.println("4 - Thoát\n");
    }

    public static void subMenu() {
        System.out.println("1 - Thay đổi username");
        System.out.println("2 - Thay đổi email");
        System.out.println("3 - Thay đổi mật khẩu");
        System.out.println("4 - Đăng xuất");
        System.out.println("5 - Thoát chương trình");
    }
}
