package com.fondomon.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.fondomon.repositories")
@EntityScan(basePackages="com.fondomon.entities")
@ComponentScan(basePackages={"com.fondomon.controllers", "com.fondomon.repositories","com.fondomon.entities"})
@EnableAutoConfiguration
@EnableWebMvc
public class FondoWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FondoWsApplication.class, args);
	}
}
