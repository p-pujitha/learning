package com.pujitha.springsecuritybasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScans({@ComponentScan("com.pujitha.springsecuritybasic.config") , @ComponentScan("com.pujitha.springsecuritybasic.controller")})
@EnableJpaRepositories("com.pujitha.springsecuritybasic.repository")
@EntityScan("com.pujitha.springsecuritybasic.model")

public class SpringsecuritybasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecuritybasicApplication.class, args);
	}

}
