package user_management.backend.service;

import user_management.backend.database.UserDatabase;
import user_management.backend.exception.NotFoundException;
import user_management.backend.model.User;
import user_management.backend.repository.UserRepository;
import user_management.backend.request.CreateRequest;
import user_management.backend.request.LoginRequest;
import user_management.backend.request.UpdatePassword;
import user_management.backend.request.UpdateUsername;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class UserService {
    UserRepository userRepository = new UserRepository();
    UserDatabase userDatabase = new UserDatabase();

    ArrayList<User> allUser = userDatabase.findAll();
    public void createUser(CreateRequest request) {
        userRepository.createUser(request);
    }

    public boolean checkEmailValid(String email) {
        String emailPattern =
                "^[a-zA-Z][\\w-]+@([\\w]{5}+\\.[\\w]{3,}+|[\\w]{5}+\\.[\\w]{3,}\\.[\\w]{2,})$";
        return Pattern.matches(emailPattern, email);
    }

    public boolean checkEmailExist(String email){
        for (User u: allUser
             ) {
            if (u.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }

    public boolean checkPasswordValid(String password) {
        String passwordPattern = "[a-z A-Z0-9]{7,15}$";
        return Pattern.matches(passwordPattern, password);
    }

    public boolean checkPasswordExist(String password){
        for (User u: allUser
             ) {
            if (u.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    public boolean checkEmail2(String email){
        if (checkEmailValid(email)){
            if (checkEmailExist(email)){
                System.out.println("Email đã tồn tại !!");
                return false;
            }
            return true;
        }
            return false;
    }
    public boolean checkEmail(String email){
        return checkEmailValid(email) && checkEmailExist(email);
    }

    public boolean checkPassword(String password){
        return checkPasswordExist(password) && checkPasswordValid(password);
    }

    public void checkLoginRequest(LoginRequest loginRequest) {
        if (checkEmail(loginRequest.getEmail())){
            for (User u: allUser
                 ) {
                if (u.getPassword().equals(loginRequest.getPassword())){
                    return;
                }
            }
        }
        throw new NotFoundException("Đăng nhập thất bại !!");
    }

    public void updateUserName(UpdateUsername updateUsernameRequest) {
        userRepository.updateUserName(updateUsernameRequest);
    }

    public void updateEmail(String email, String changeEmail) {
        userRepository.updateEmail(email, changeEmail);
    }

    public void updatePassword(UpdatePassword updatePasswordRequest) {
        userRepository.updatePassword(updatePasswordRequest);
    }

    public void updatePasswordForgot(String forgotEmail, String forgotPassword) {
        userRepository.updatePasswordForgot(forgotEmail, forgotPassword);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
