package com.trax.shiprate.carriers.fedex;

import com.trax.shiprate.carriers.fedex.api.ApiException;
import com.trax.shiprate.carriers.fedex.api.DefaultApi;
import com.trax.shiprate.carriers.fedex.api.model.Response;
import com.trax.shiprate.config.FedexConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FedexService {

    @Autowired
    FedexConfig fedexConfig;

    private final DefaultApi api = new DefaultApi();

    public FedexService() { }

    public String getAccessToken() throws ApiException {

        String grantType = "client_credentials";
        String contentType = "application/x-www-form-urlencoded";

        Response response = api.aPIAuthorization(grantType, fedexConfig.getClientId(), fedexConfig.getSecret(), fedexConfig.getClientId(), fedexConfig.getSecret(), contentType);
        log.info(response.toString());
        String token = response.getAccessToken();
        return token;
    }
}
