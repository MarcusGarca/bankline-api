package com.dio.santander.bankline.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com.dio.santander.bankline.api.model")
@SpringBootApplication
public class BanklineApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BanklineApiApplication.class, args);
	}

}
//globalmente
//https://devweek-dio-santander-2022.herokuapp.com/swagger-ui.html
//localmente
//http://localhost:8080/swagger-ui/index.html