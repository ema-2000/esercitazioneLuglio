package com.example.recensionemodule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RecensioneModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecensioneModuleApplication.class, args);
    }

}
