package com.currenjin.learningtest.datajdbctest;

import io.zonky.test.db.AutoConfigureEmbeddedDatabase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Optional;

import static io.zonky.test.db.AutoConfigureEmbeddedDatabase.DatabaseType.POSTGRES;
import static org.assertj.core.api.Assertions.assertThat;

@SpringJUnitConfig(value =  {DataJdbcConfig.class, SpringDataJdbcConfig.class })
@AutoConfigureEmbeddedDatabase(type = POSTGRES)
@Sql(scripts = "classpath:user-test.sql")
class UserRepositoryTest {

    private static final Long ANY_ID = 1L;

    @Autowired
    private SpringDataJdbcUserRepository repository;

    @Test
    void name() {
    }
}