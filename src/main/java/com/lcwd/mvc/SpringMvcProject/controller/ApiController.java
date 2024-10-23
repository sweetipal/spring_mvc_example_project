package com.lcwd.mvc.SpringMvcProject.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("/api")
public class ApiController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	// @ResponseBody
	public String helloApi() {
		return "Hello, how are you, whats going these days";
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	// @ResponseBody
	public List<String> getUserData() {
		return Arrays.asList("Ram", "Shyam", "Cheeku");
	}
	@RequestMapping(value = "/create-user", method=RequestMethod.POST)
	public String createUser() {
		System.out.println("Creating user");
		return "user created...";
	}
}
