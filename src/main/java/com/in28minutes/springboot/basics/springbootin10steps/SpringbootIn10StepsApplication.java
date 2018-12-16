package com.in28minutes.springboot.basics.springbootin10steps;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//acts Spring context file/enables auto configuration/enables auto component scan
public class SpringbootIn10StepsApplication {

	public static void main(String[] args) {
		
		//used to run spring context
		//SpringApplication.run(SpringbootIn10StepsApplication.class, args);
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootIn10StepsApplication.class, args);
		
		/*for(String name:applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}*/
	
	}

}

