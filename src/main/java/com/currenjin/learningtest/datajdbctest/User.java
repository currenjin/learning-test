package com.currenjin.learningtest.datajdbctest;

import org.apache.logging.log4j.util.Strings;

public class User {

    public static User of(Long id, String name) {
        validateValue(id, name);

        return new User(id, name);
    }

    private Long id;
    private String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Long getId() {
        return this.id;
    }

    private static void validateValue(Long id, String name) {

        if (id == null || id <= 0L) {
            throw new IllegalArgumentException();
        }

        if (Strings.isBlank(name)) {
            throw new IllegalArgumentException();
        }
    }
}
