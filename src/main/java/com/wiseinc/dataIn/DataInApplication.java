package com.wiseinc.dataIn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DataInApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataInApplication.class, args);
	}

}
