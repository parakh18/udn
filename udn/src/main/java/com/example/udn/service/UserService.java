package com.example.udn.service;

import com.example.udn.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private List<User> userList = new ArrayList<>(Arrays.asList(
            new User("abc", "1234567890", "123456")
    ));

    public String createUser(User user) {
        User newUser  = new User(user.getName(), user.getMobile(), user.getPin());
        userList.add(newUser);
        return newUser.getId();
    }

    public List<User> getAllUsers() {
        return userList;
    }


}
