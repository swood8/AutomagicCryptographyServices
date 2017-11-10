package com.revature.acs.createmessage.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AcsCreateMessageApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcsCreateMessageApplication.class, args);
	}
}
