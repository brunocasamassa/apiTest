package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		 * HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		 * obj.getMessage();
		 */
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
}