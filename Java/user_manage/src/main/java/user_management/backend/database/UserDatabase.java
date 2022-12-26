package user_management.backend.database;

import user_management.backend.model.User;
import user_management.backend.utils.FileUtils;

import java.util.ArrayList;

public class UserDatabase {
    public static ArrayList<User> users = FileUtils.getDataFromFile("info.json");

    public ArrayList<User> findAll(){
        return users;
    }
}
