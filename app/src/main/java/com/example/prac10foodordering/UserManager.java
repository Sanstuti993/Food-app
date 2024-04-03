package com.example.prac10foodordering;


import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private static final UserManager instance = new UserManager();
    private List<User> users = new ArrayList<>();

    private UserManager() {
     addUser(new User("admin","admin"));
    }

    public static UserManager getInstance() {
        return instance;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
