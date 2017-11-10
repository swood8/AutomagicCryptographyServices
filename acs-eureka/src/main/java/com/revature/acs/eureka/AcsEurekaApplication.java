package com.revature.acs.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AcsEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcsEurekaApplication.class, args);
	}
}
