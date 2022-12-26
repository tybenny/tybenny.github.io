package user_management.backend.controller;

import user_management.backend.model.User;
import user_management.backend.request.UpdatePassword;
import user_management.backend.request.UpdateUserName;
import user_management.backend.service.UserService;

public class UserController {
    private static final UserService userService = new UserService();

    public boolean checkEmail(String email) {
        return userService.checkEmail(email);
    }

    public void checkLogin(String email, String password) {
        userService.checkLogin(email, password);
    }

    public User findByEmail(String email) {
        return userService.findByEmail(email);
    }


    public void updateUserName(UpdateUserName request) {
        userService.updateUserName(request);
    }

    public void updateEmail(String email, String newEmail) {
        userService.updateEmail(email, newEmail);
    }

    public void updatePassword(UpdatePassword request) {
        userService.updatePassword(request);
    }
}
