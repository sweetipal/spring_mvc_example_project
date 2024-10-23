package com.lcwd.mvc.SpringMvcProject.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
	Logger logger = LoggerFactory.getLogger(ProductController.class);
	@GetMapping("/getProduct")
	public String getProduct(@RequestParam("productName") String name, @RequestParam(value="productRating", defaultValue = "0",required = false) int rating,
			@RequestParam("productId") int id) {
		System.out.println("product name: "+name);
		System.out.println("product rating: "+rating);
		System.out.println("product id: "+id);
		
		return "This is for testing product url";
	}
	
	@RequestMapping("/checkProduct/{productId}/{productName}/{productRating}")
	public String checkProduct(@PathVariable("productId")int id,@PathVariable String productName,@PathVariable int productRating) {
	//	System.out.println("product name: "+productName);
	//	System.out.println("product rating: "+productRating);
	//	System.out.println("product id: "+id);
		logger.error("productName {} {}",productName,"Testing argument");
		logger.warn("product id {}",id);
		logger.info("productName {}",productRating);
		logger.debug("this is for testing");
		return "This is the checking the concept of path variable.";
	}

}
