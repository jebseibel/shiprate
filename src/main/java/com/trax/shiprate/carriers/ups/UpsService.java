package com.trax.shiprate.carriers.ups;

import com.trax.shiprate.carriers.ups.api.UpsApp;
import com.trax.shiprate.config.UpsConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.http.HttpResponse;

@Slf4j
@Service
public class UpsService {

    @Autowired
    UpsConfig upsConfig;

    @Autowired
    UpsApp upsApp;

    public UpsService() { }

    public String getAccessToken() throws IOException, InterruptedException {
        return upsApp.getAccessToken();
    }

}
