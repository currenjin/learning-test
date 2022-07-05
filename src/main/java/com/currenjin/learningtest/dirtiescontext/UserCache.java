package com.currenjin.learningtest.dirtiescontext;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class UserCache {

    private Set<User> userList = new HashSet<>();


    public Set<User> getUserList() {
        return userList;
    }

    public void addUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException();
        }

        userList.add(user);
    }
}
