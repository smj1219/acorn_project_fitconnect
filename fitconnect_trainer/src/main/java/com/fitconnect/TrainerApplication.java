package com.fitconnect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

//resources/custom.properties 파일 로딩 
@PropertySource(value="classpath:custom.properties")
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class TrainerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainerApplication.class, args);
	}
}
