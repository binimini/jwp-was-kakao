package service;

import db.DataBase;
import model.User;

public class UserService {

    public void addUser(String userId, String password, String name, String email) {
        User user = new User(userId, password, name, email);
        DataBase.addUser(user);
    }

}