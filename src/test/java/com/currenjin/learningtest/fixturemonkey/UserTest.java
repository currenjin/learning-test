package com.currenjin.learningtest.fixturemonkey;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private static final String NAME = "test";
    private static final Integer AGE = 22;

    @Test
    void 유저를_생성한다() {
        User actual = User.of(NAME, AGE);

        assertThat(actual.getAge()).isEqualTo(AGE);
        assertThat(actual.getName()).isEqualTo(NAME);
    }
}