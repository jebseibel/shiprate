package com.trax.shiprate.shippers.ups.api;

import com.trax.shiprate.carriers.ups.api.ClientApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class ClientAppTest {

    @Autowired
    private ClientApp clientApp;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getToken() throws IOException, InterruptedException {
        clientApp.getToken();
    }
}