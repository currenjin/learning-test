package com.currenjin.learningtest.datajdbctest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class UserTest {

    private static final String ANY_NAME = "currenjin";
    private static final Long ANY_ID = 1L;

    @Test
    void 유저를_생성합니다() {
        User actual = User.of(ANY_ID, ANY_NAME);

        assertThat(actual.getId()).isEqualTo(ANY_ID);
        assertThat(actual.getName()).isEqualTo(ANY_NAME);
    }

    @ParameterizedTest
    @ValueSource(longs = { -1L, 0L })
    @NullSource
    void 유효하지_않은_ID_로_유저를_생성하면_안됩니다(Long INVALID_ID) {
        assertThatThrownBy(() -> User.of(INVALID_ID, ANY_NAME))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = { "", " " })
    @NullSource
    void 유효하지_않은_NAME_으로_유저를_생성하면_안됩니다(String INVALID_NAME) {
        assertThatThrownBy(() -> User.of(ANY_ID, INVALID_NAME))
                .isInstanceOf(IllegalArgumentException.class);
    }
}