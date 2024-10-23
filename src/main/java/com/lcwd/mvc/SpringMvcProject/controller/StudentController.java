package com.lcwd.mvc.SpringMvcProject.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.mvc.SpringMvcProject.Models.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	// create student
	// data required - we are receiving data in json format(key value pair ki form mai)
	//json-->object==> deserialization
	
	//java object convert to the json object - serialization
	
	@PostMapping("/createStudent")
	public ResponseEntity<Student> createStudent(@RequestBody List<Student> students) {
		// we have to create student..
//		System.out.println("student list size: "+students.size());
//		System.out.println("data: "+students);
		
	//	List<String> foods = Arrays.asList("pizza","burger");
//		Map<String,Object>data = new HashMap<>();
//		 data.put("content", students);
//		 data.put("error", "no error found");
//		 data.put("currentDate", new Date().toString());
	//	 data.put("SystemInformation", System.getProperties());
		System.out.println("data: "+students);
		Student student = students.get(0);
	//	ResponseEntity<Student> response = new ResponseEntity<>(student,HttpStatus.CREATED);
		ResponseEntity<Student> response = ResponseEntity.status(HttpStatus.OK).body(student);
		return response;
		
	}
	

}
