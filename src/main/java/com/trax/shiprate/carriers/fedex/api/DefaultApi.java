package com.trax.shiprate.carriers.fedex.api;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.trax.shiprate.carriers.fedex.api.model.Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for aPIAuthorization
     * @param grantType  (required)
     * @param clientId  (required)
     * @param clientSecret  (required)
     * @param childKey  (required)
     * @param childSecret  (required)
     * @param contentType This is used to indicate the media type of the resource. The media type is a string sent along with the file indicating format of the file.&lt;br&gt; Example: application/x-www-form-urlencoded (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call aPIAuthorizationCall(String grantType, String clientId, String clientSecret, String childKey, String childSecret, String contentType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/oauth/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (contentType != null)
        localVarHeaderParams.put("content-type", apiClient.parameterToString(contentType));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (grantType != null)
        localVarFormParams.put("grant_type", grantType);
        if (clientId != null)
        localVarFormParams.put("client_id", clientId);
        if (clientSecret != null)
        localVarFormParams.put("client_secret", clientSecret);
        if (childKey != null)
        localVarFormParams.put("child_Key", childKey);
        if (childSecret != null)
        localVarFormParams.put("child_secret", childSecret);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call aPIAuthorizationValidateBeforeCall(String grantType, String clientId, String clientSecret, String childKey, String childSecret, String contentType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new ApiException("Missing the required parameter 'grantType' when calling aPIAuthorization(Async)");
        }
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling aPIAuthorization(Async)");
        }
        // verify the required parameter 'clientSecret' is set
        if (clientSecret == null) {
            throw new ApiException("Missing the required parameter 'clientSecret' when calling aPIAuthorization(Async)");
        }
        // verify the required parameter 'childKey' is set
        if (childKey == null) {
            throw new ApiException("Missing the required parameter 'childKey' when calling aPIAuthorization(Async)");
        }
        // verify the required parameter 'childSecret' is set
        if (childSecret == null) {
            throw new ApiException("Missing the required parameter 'childSecret' when calling aPIAuthorization(Async)");
        }
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling aPIAuthorization(Async)");
        }
        
        com.squareup.okhttp.Call call = aPIAuthorizationCall(grantType, clientId, clientSecret, childKey, childSecret, contentType, progressListener, progressRequestListener);
        return call;
    }

    /**
     * API Authorization
     * Use this endpoint to request the OAuth token (bearer token) to authorize your application to access FedEx resources. You can pass this bearer token in your subsequent individual FedEx API endpoint requests.&lt;br/&gt;&lt;i&gt;Note: FedEx APIs do not support Cross-Origin Resource Sharing (CORS) mechanism.&lt;/i&gt;
     * @param grantType  (required)
     * @param clientId  (required)
     * @param clientSecret  (required)
     * @param childKey  (required)
     * @param childSecret  (required)
     * @param contentType This is used to indicate the media type of the resource. The media type is a string sent along with the file indicating format of the file.&lt;br&gt; Example: application/x-www-form-urlencoded (required)
     * @return Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Response aPIAuthorization(String grantType, String clientId, String clientSecret, String childKey, String childSecret, String contentType) throws ApiException {
        ApiResponse<Response> resp = aPIAuthorizationWithHttpInfo(grantType, clientId, clientSecret, childKey, childSecret, contentType);
        return resp.getData();
    }

    /**
     * API Authorization
     * Use this endpoint to request the OAuth token (bearer token) to authorize your application to access FedEx resources. You can pass this bearer token in your subsequent individual FedEx API endpoint requests.&lt;br/&gt;&lt;i&gt;Note: FedEx APIs do not support Cross-Origin Resource Sharing (CORS) mechanism.&lt;/i&gt;
     * @param grantType  (required)
     * @param clientId  (required)
     * @param clientSecret  (required)
     * @param childKey  (required)
     * @param childSecret  (required)
     * @param contentType This is used to indicate the media type of the resource. The media type is a string sent along with the file indicating format of the file.&lt;br&gt; Example: application/x-www-form-urlencoded (required)
     * @return ApiResponse&lt;Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Response> aPIAuthorizationWithHttpInfo(String grantType, String clientId, String clientSecret, String childKey, String childSecret, String contentType) throws ApiException {
        com.squareup.okhttp.Call call = aPIAuthorizationValidateBeforeCall(grantType, clientId, clientSecret, childKey, childSecret, contentType, null, null);
        Type localVarReturnType = new TypeToken<Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * API Authorization (asynchronously)
     * Use this endpoint to request the OAuth token (bearer token) to authorize your application to access FedEx resources. You can pass this bearer token in your subsequent individual FedEx API endpoint requests.&lt;br/&gt;&lt;i&gt;Note: FedEx APIs do not support Cross-Origin Resource Sharing (CORS) mechanism.&lt;/i&gt;
     * @param grantType  (required)
     * @param clientId  (required)
     * @param clientSecret  (required)
     * @param childKey  (required)
     * @param childSecret  (required)
     * @param contentType This is used to indicate the media type of the resource. The media type is a string sent along with the file indicating format of the file.&lt;br&gt; Example: application/x-www-form-urlencoded (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call aPIAuthorizationAsync(String grantType, String clientId, String clientSecret, String childKey, String childSecret, String contentType, final ApiCallback<Response> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = aPIAuthorizationValidateBeforeCall(grantType, clientId, clientSecret, childKey, childSecret, contentType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
