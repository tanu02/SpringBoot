package com.example.Setup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootSetupApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootSetupApplication.class, args);

		User user = context.getBean(User.class);
		System.out.println(user.getS().serviceFrom());
	}
}
