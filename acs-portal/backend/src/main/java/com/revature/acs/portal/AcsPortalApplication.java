package com.revature.acs.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AcsPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcsPortalApplication.class, args);
	}
}
