package com.shiprate;

import com.shiprate.config.UpsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestConfig implements CommandLineRunner {

    @Autowired
    UpsConfig upsConfig;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(upsConfig);
    }
}
