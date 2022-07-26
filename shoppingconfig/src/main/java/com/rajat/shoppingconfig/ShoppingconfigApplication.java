package com.rajat.shoppingconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ShoppingconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingconfigApplication.class, args);
	}

}
