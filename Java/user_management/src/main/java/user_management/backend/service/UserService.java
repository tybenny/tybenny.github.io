package user_management.backend.service;

import user_management.backend.exception.NotFoundException;
import user_management.backend.model.User;
import user_management.backend.repository.UserRepository;
import user_management.backend.request.UpdatePassword;
import user_management.backend.request.UpdateUserName;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class UserService {
    private final UserRepository userRepository = new UserRepository();
    ArrayList<User> allUser = userRepository.findAll();

    public boolean checkEmailValid(String email) {
        String emailPattern =
                "^[a-zA-Z][\\w-]+@([\\w]{5}+\\.[\\w]+|[\\w]{5}+\\.[\\w]{2,}\\.[\\w]{2,})$";
        return Pattern.matches(emailPattern, email);
    }

    public boolean checkEmailExist (String email){
        for (User u: allUser
             ) {
            if(u.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }

    public boolean checkEmail (String email){
        return checkEmailValid(email) && checkEmailExist(email);
    }

    public boolean checkPasswordValid(String password) {
        String passwordPattern = "[a-z A-Z0-9]{7,15}$";
        return Pattern.matches(passwordPattern, password);
    }




    public User findByEmail(String email){
        for (User u: allUser
        ) {
            if (u.getEmail().equals(email)) {
                return u;
            }
        }
        throw new NotFoundException("Không tìm thấy người dùng nào !! ");
    }

    public void checkLogin(String email, String password){
        if (checkEmail(email)){
            for (User u : allUser
                 ) {
                if (u.getEmail().equals(email) && u.getPassword().equals(password)){
                    return;
                }
            }
        }
        throw new NotFoundException("Đăng nhập thất bại, hãy đăng nhập lại !!");
    }


    public void updateUserName(UpdateUserName request) {
        userRepository.updateUserName(request);
    }

    public void updateEmail(String email, String newEmail) {
        userRepository.updateEmail(email, newEmail);
    }

    public void updatePassword(UpdatePassword request) {
        userRepository.updatePassword(request);
    }
}
