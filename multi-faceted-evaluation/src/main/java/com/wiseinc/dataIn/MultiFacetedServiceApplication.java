package com.wiseinc.dataIn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MultiFacetedServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MultiFacetedServiceApplication.class, args);
    }
}

