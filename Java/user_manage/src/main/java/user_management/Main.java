package user_management;

import user_management.backend.service.UserService;
import user_management.frontend.UI.UserUI;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        UserUI userUI = new UserUI();
        userUI.run();
    }
}
