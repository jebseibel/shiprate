package com.shiprate;

import com.shiprate.config.DhlConfig;
import com.shiprate.config.FedexConfig;
import com.shiprate.config.GenericConfig;
import com.shiprate.config.UpsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestConfig implements CommandLineRunner {

    @Autowired
    GenericConfig genericConfig;

    @Autowired
    UpsConfig upsConfig;

    @Autowired
    FedexConfig fedexConfig;

    @Autowired
    DhlConfig dhlConfig;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(fedexConfig);
        System.out.println(upsConfig);
        System.out.println(dhlConfig);
        System.out.println(genericConfig);
    }
}
