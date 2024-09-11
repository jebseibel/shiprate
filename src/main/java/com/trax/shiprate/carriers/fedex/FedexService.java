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

    public FedexService() {

    }

    public Response getToken() throws ApiException {

        String grantType = "client_credentials";
        String contentType = "application/x-www-form-urlencoded";

        String clientId = "l7417fdc9322b84bcd83c76f75aeb5e5c7";
        String clientSecret = "3e445198e7dc469bbfff6618a6e120db";

        System.out.println(fedexConfig);

        Response response = api.aPIAuthorization(grantType, fedexConfig.getClientId(), fedexConfig.getSecret(), clientId, clientSecret, contentType);
        log.info(response.toString());
        return response;
    }
}
