package com.example.demo.service;
import com.example.demo.inf.User;
import com.example.demo.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class UserService {
    @Autowired
    UserDAO userDAO;

    public boolean isExist(String username) {
        User user = getByName(username);
        return null!=user;
    }

    public User getByName(String username) {
        return userDAO.findByUsername(username);
    }

    public User get(String username, String password){
        return userDAO.getByUsernameAndPassword(username, password);
    }

    public void add(User user) {
        userDAO.save(user);
    }

    public int register(User user) {
        String username = user.getUsername();
        String email = user.getEmail();
        String password = user.getPassword();

        user.setUsername(username);
        user.setEmail(email);

        if (username.equals("") || password.equals("")) {
            return 0;
        }

        boolean exist = isExist(username);

        if (exist) {
            return 2;
        }

        user.setPassword(password);

        userDAO.save(user);

        return 1;
    }
}
