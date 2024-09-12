package com.trax.shiprate.carriers.ups;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UpsServiceTest {

    @Autowired
    private UpsService upsService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getToken() throws IOException, InterruptedException {
        String accesstoken = upsService.getAccessToken();
        assertNotNull(accesstoken);
    }
}