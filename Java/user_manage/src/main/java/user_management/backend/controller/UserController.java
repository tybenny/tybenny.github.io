package user_management.backend.controller;

import user_management.backend.model.User;
import user_management.backend.request.CreateRequest;
import user_management.backend.request.LoginRequest;
import user_management.backend.request.UpdatePassword;
import user_management.backend.request.UpdateUsername;
import user_management.backend.service.UserService;

public class UserController {
    UserService userService = new UserService();

    public void updatePassword(UpdatePassword updatePasswordRequest) {
        userService.updatePassword(updatePasswordRequest);
    }

    public void createUser(CreateRequest request) {
        userService.createUser(request);
    }

    public void checkLoginRequest(LoginRequest loginRequest) {
        userService.checkLoginRequest(loginRequest);
    }

    public boolean checkEmail2(String newEmail) {
        if (userService.checkEmail2(newEmail)){
            return true;
        }
        return false;
    }

    public boolean checkPasswordValid(String newPassword) {
        return userService.checkPasswordValid(newPassword);
    }

    public void updateUserName(UpdateUsername updateUsernameRequest) {
        userService.updateUserName(updateUsernameRequest);
    }

    public void updateEmail(String email, String changeEmail) {
        userService.updateEmail(email, changeEmail);
    }

    public boolean checkEmailExist(String forgotEmail) {
        return userService.checkEmailExist(forgotEmail);
    }

    public void updatePasswordForgot(String forgotEmail, String forgotPassword) {
        userService.updatePasswordForgot(forgotEmail, forgotPassword);
    }

    public User findByEmail(String email) {
       return userService.findByEmail(email);
    }
}
