package com.example.articolomodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ArticoloModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticoloModuleApplication.class, args);
    }

}
