package user_management.backend.repository;

import user_management.backend.database.UserDatabase;
import user_management.backend.model.User;
import user_management.backend.request.CreateRequest;
import user_management.backend.request.UpdateEmail;
import user_management.backend.request.UpdatePassword;
import user_management.backend.request.UpdateUsername;
import user_management.backend.utils.FileUtils;

import java.util.ArrayList;

public class UserRepository {
    UserDatabase userDatabase = new UserDatabase();
    ArrayList<User> allUser = userDatabase.findAll();

    public User findByEmail(String email){
        for (User u: allUser
             ) {
            if (u.getEmail().equals(email)){
                return u;
            }
        }
        return null;
    }
    public void createUser(CreateRequest request) {
        User user = new User();
        user.setEmail(request.getEmail());
        user.setUserName(request.getUserName());
        user.setPassword(request.getPassword());
        allUser.add(user);
        FileUtils.setDataToFile("info.json", allUser);
    }

    public void updateUserName(UpdateUsername updateUsernameRequest) {
        for (User u: allUser
             ) {
            if (updateUsernameRequest.getEmail().equals(u.getEmail())){
                u.setUserName(updateUsernameRequest.getUserName());
            }
        }
        FileUtils.setDataToFile("info.json", allUser);
    }

    public void updateEmail(String email, String changeEmail){
        User user = findByEmail(email);
        user.setEmail(changeEmail);
        FileUtils.setDataToFile("info.json", allUser);
    }

    public void updatePassword(UpdatePassword updatePasswordRequest) {
        for (User u: allUser
             ) {
            if (updatePasswordRequest.getEmail().equals(u.getEmail())){
                u.setPassword(updatePasswordRequest.getPassword());
            }
        }
        FileUtils.setDataToFile("info.json", allUser);
    }

    public void updatePasswordForgot(String forgotEmail, String forgotPassword) {
        for (User u: allUser
             ) {
            if (u.getEmail().equals(forgotEmail)){
                u.setPassword(forgotPassword);
            }
        }
        FileUtils.setDataToFile("info.json", allUser);
    }
}
