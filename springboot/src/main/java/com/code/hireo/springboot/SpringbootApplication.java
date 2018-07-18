package com.code.hireo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@RequestMapping("/test")
public class SpringbootApplication {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "hello spirngboot";
	}
	
	@RequestMapping("/hello2")
	@ResponseBody
	public String hello2(){
		return "hello spirngboot";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
