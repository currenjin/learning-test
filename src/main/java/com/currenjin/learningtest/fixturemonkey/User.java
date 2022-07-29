package com.currenjin.learningtest.fixturemonkey;

public class User {

    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static User of(String name, Integer age) {
        return new User(name, age);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
