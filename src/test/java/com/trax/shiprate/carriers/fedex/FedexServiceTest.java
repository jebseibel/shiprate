package com.trax.shiprate.carriers.fedex;

import com.trax.shiprate.carriers.fedex.api.ApiException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FedexServiceTest {

    @Autowired
    FedexService fedexService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getToken() throws ApiException {
        var response = fedexService.getToken();
    }
}