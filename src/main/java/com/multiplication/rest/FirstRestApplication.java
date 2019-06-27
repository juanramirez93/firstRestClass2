package com.multiplication.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FirstRestApplication {

    public static void main(String[] args) {
	SpringApplication.run(FirstRestApplication.class, args);
    }

}
