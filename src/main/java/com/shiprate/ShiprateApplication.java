package com.shiprate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ShiprateApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ShiprateApplication.class, args);
    }
}