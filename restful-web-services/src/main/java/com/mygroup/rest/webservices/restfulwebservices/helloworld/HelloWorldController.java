package com.mygroup.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(path = "/hello-world")
	public String HelloWorld()
	{
		return "Hello World";
	}
	
	//hello-world-bean
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean HelloWorldBean()
	{
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean HelloWorldpathVariable(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	
}
