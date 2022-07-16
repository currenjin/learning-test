package com.currenjin.learningtest.datajdbctest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;

@Getter
@AllArgsConstructor(onConstructor_ = @PersistenceConstructor)
public class User {

    public static User of(Long id, String name) {
        validateValue(id, name);

        return new User(id, name);
    }

    @Id
    private final Long id;
    private final String name;

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

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException();
        }
    }
}
