package com.revature.acs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AcsLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcsLoginApplication.class, args);
	}
}
