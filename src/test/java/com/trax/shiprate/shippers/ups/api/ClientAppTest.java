package com.trax.shiprate.shippers.ups.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

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