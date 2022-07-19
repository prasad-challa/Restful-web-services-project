package com.cps.java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//controller
@RestController
public class HelloWorldController {
	
	//GET
	//URI- /hello-world
	//Method- "Hello-World"
	//@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	@GetMapping(path="/hello-world")
	public String helloworld() {
		return "hello-world";
		
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloworldbean() {
		
		return new HelloWorldBean("hello-world");
		
	}
	
	@GetMapping(path="/hello-world/pathvariable/{name}")
	public HelloWorldBean helloworlpathvariable(@PathVariable String name) {
		
		return new HelloWorldBean(String.format("Hello-word, %s", name));
		
	}

}
