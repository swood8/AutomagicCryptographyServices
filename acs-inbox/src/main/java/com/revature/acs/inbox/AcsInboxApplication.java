package com.revature.acs.inbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AcsInboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcsInboxApplication.class, args);
	}
}
