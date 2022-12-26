package user_management.backend.repository;

import user_management.backend.database.UserDatabase;
import user_management.backend.exception.NotFoundException;
import user_management.backend.model.User;
import user_management.backend.request.UpdatePassword;
import user_management.backend.request.UpdateUserName;
import user_management.backend.utils.FileUtils;

import java.util.ArrayList;

public class UserRepository {

    public ArrayList<User> findAll(){
        return UserDatabase.users;
    }

    ArrayList<User> allUser = findAll();

    public static void save(User user) {
        UserDatabase.users.add(user);
        FileUtils.setDataToFile("info.json", UserDatabase.users);
    }

    public void save2(ArrayList<User> users){
        FileUtils.setDataToFile("info.json", users);
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

    public User updateUserName(UpdateUserName request) {
        User user = findByEmail(request.getEmail());
        user.setUserName(request.getUserName());
        FileUtils.setDataToFile("info.json", UserDatabase.users);
        return user;
    }

    public User updateEmail(String email, String newEmail) {
        User user = findByEmail(email);
        user.setEmail(newEmail);
        FileUtils.setDataToFile("info.json", allUser);
        return user;
    }


    public User updatePassword(UpdatePassword request) {
        User user = findByEmail(request.getEmail());
        user.setPassword(request.getPassword());
        FileUtils.setDataToFile("info.json", UserDatabase.users);
        return user;
    }


}
