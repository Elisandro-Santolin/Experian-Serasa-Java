package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello") // ## ONDE A FUNCAO É EXECUTADA ## //
	public String hello() {
	return "<h1>Test One </h1>";
	}

	@GetMapping("/test")
	public String test(@RequestParam(value="num1")String num1, @RequestParam(value="num2")String num2){
		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);
		return num1+"+"+num2+" = " + (number1+number2); 
	}

}
