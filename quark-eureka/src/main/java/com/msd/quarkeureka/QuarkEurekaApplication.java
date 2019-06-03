package com.msd.quarkeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class QuarkEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuarkEurekaApplication.class, args);
    }

}
