package com.bridelabz.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloMsgResController {

	@RequestMapping(value = {"", "/", "/home"})
	public String sayHello() {
		return "hello from bridgelabz";
	}
}
