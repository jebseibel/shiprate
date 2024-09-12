package com.trax.shiprate.shippers.ups.api;

import com.trax.shiprate.carriers.ups.api.UpsApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class UpsAppTest {

    @Autowired
    private UpsApp upsApp;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAccessToken() throws IOException, InterruptedException {
        upsApp.getAccessToken();
    }
}