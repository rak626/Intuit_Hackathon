package com.sinchan.mybookaccounting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages = "com.sinchan.mybookaccounting.Entities")
public class MyBookAccountingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBookAccountingApplication.class, args);
	}

}
