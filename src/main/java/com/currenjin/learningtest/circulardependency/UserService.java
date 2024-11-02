package com.currenjin.learningtest.circulardependency;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	private final OrderService orderService;

	public UserService(OrderService orderService) {
		this.orderService = orderService;
	}
}
