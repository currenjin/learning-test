package com.currenjin.learningtest.circulardependency;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
	private final UserService userService;

	public OrderService(UserService userService) {
		this.userService = userService;
	}
}
