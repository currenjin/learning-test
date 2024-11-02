package com.currenjin.learningtest.circulardependency;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class CircularDependencyTest {
	@Test
	void beanCurrentlyInCreationExceptionTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(UserService.class);
		context.register(OrderService.class);

		assertThatThrownBy(context::refresh)
			.isInstanceOf(UnsatisfiedDependencyException.class)
			.hasRootCauseInstanceOf(BeanCurrentlyInCreationException.class);
	}
}