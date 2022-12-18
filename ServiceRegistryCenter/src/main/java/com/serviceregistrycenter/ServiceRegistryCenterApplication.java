package com.serviceregistrycenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Alliance
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceRegistryCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryCenterApplication.class, args);
    }

}
