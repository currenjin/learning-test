package com.currenjin.learningtest.datajdbctest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataJdbcUserRepository extends CrudRepository<User, Long> {
}
