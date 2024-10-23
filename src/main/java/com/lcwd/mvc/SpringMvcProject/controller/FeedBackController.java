package com.lcwd.mvc.SpringMvcProject.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedBackController {
	
	//@RequestMapping(value = "/feedbacks", method = RequestMethod.GET)
	@GetMapping("/feedbacks")
	public List<String> getFeedback(){
		List<String> feedbacks = Arrays.asList("Nice One","valuable","good course");
		return feedbacks;
	}
	@PostMapping("/createFeedback")
	public String createFeedback(){
		System.out.println("Creating feedback...");
		return "created feedback !!";
	}
	
	/*
	 * @putMapping, @DeleteMapping, @PatchMapping
	 */
	
	// json(java script object notaiton) - text format used for storing and transporting the data  (its a standard format) 
	
	// parse - json-> js object m convert karta hai
	//stringify- object-> json string m convert karta hai
	
	/*
	 * java python js php node js
	 */

	
	
}
