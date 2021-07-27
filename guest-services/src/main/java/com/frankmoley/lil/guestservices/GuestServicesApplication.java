package com.frankmoley.lil.guestservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//Esta marcação permite que o microserviço seja gerenciado pelo Eureka
@EnableDiscoveryClient
public class GuestServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuestServicesApplication.class, args);
    }

}
