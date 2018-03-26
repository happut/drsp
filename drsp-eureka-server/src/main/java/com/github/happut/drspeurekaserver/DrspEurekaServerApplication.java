package com.github.happut.drspeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DrspEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrspEurekaServerApplication.class, args);
	}
}
