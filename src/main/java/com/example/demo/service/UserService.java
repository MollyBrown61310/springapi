package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.api.model.User;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Molly", 45, "mollybrown616@yahoo.com");
        User user2 = new User(2, "Eva", 25, "info@yahoo.com");
        User user3 = new User(3, "Mark", 30, "info@yahoo.com");
        User user4 = new User(4, "Larry", 56, "info@yahoo.com");
        User user5 = new User(5, "Cindy", 33, "info@yahoo.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user: userList) {
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
    
         }
         return optional;
    }
    
}
