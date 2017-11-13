package com.revature.acs.portal;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class AcsPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcsPortalApplication.class, args);
	}
	
	//Necessary to use session factory	
	@Bean  
	public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf)
	{  
		return hemf.getSessionFactory();  
	}  
}
