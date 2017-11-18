package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.controllers.ClientController;
import com.controllers.MainControllers;

@SpringBootApplication
public class EcommerceWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceWsApplication.class, args);
	}
}
