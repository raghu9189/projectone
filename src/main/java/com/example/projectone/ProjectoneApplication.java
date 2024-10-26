package com.example.projectone;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProjectoneApplication {

	public static void main(String[] args) {
		ApplicationContext apc =  SpringApplication.run(ProjectoneApplication.class, args);
		for(String a: apc.getBeanDefinitionNames()){
			System.out.println(a);
		}
	}

}
