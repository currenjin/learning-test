package com.currenjin.learningtest.dirtiescontext;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@ExtendWith(MockitoExtension.class)
class UserCacheTest {

    UserCache sut = new UserCache();

    @Mock
    private User user;

    @Test
    void 유저_리스트() {
        Set<User> actual = sut.getUserList();

        assertThat(actual.size()).isEqualTo(0);
    }

    @Test
    void 유저를_추가한다() {
        Set<User> userList = sut.getUserList();
        assertThat(userList.size()).isEqualTo(0);

        sut.addUser(user);
        Set<User> actual = sut.getUserList();

        assertThat(actual.size()).isEqualTo(1);
    }

    @ParameterizedTest
    @NullSource
    void 유효하지_않은_유저를_추가하면_안된다(User INVALID_USER) {
        assertThatThrownBy(() -> sut.addUser(INVALID_USER));
    }
}