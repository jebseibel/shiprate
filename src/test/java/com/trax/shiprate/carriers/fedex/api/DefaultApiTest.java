
package com.trax.shiprate.carriers.fedex.api;

import com.trax.shiprate.carriers.fedex.api.model.Response;
import org.junit.jupiter.api.Test;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * API Authorization
     *
     * Use this endpoint to request the OAuth token (bearer token) to authorize your application to access FedEx resources. You can pass this bearer token in your subsequent individual FedEx API endpoint requests.&lt;br/&gt;&lt;i&gt;Note: FedEx APIs do not support Cross-Origin Resource Sharing (CORS) mechanism.&lt;/i&gt;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void aPIAuthorizationTest() throws Exception {
        String grantType = "client_credentials";

        String clientId = "l7417fdc9322b84bcd83c76f75aeb5e5c7";
        String clientSecret = "3e445198e7dc469bbfff6618a6e120db";
        String contentType = "application/x-www-form-urlencoded";
        Response response = api.aPIAuthorization(grantType, clientId, clientSecret, clientId, clientSecret, contentType);
        System.out.println(response);
    }
}
