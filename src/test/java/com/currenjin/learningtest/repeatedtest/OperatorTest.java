package com.currenjin.learningtest.repeatedtest;

import org.junit.jupiter.api.RepeatedTest;

import static org.assertj.core.api.Assertions.assertThat;

class OperatorTest {

    @RepeatedTest(10)
    void repeat_10() {
        assertThat(Operator.add(2, 3)).isEqualTo(5);
    }
}