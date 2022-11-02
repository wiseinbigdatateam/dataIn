package com.wiseinc.dataIn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AhpServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AhpServiceApplication.class, args);
    }
}
