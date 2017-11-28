/*
 * OpenWhisk REST API
 * API for OpenWhisk
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Activation;
import io.swagger.client.model.ActivationLogs;
import io.swagger.client.model.ActivationResponse;
import io.swagger.client.model.EntityBrief;
import io.swagger.client.model.ErrorMessage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActivationsApi {
    private ApiClient apiClient;

    public ActivationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ActivationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getActivationById
     * @param namespace The entity namespace (required)
     * @param activationid Name of activation to fetch (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getActivationByIdCall(String namespace, String activationid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/namespaces/{namespace}/activations/{activationid}"
            .replaceAll("\\{" + "namespace" + "\\}", apiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "activationid" + "\\}", apiClient.escapeString(activationid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getActivationByIdValidateBeforeCall(String namespace, String activationid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getActivationById(Async)");
        }
        
        // verify the required parameter 'activationid' is set
        if (activationid == null) {
            throw new ApiException("Missing the required parameter 'activationid' when calling getActivationById(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getActivationByIdCall(namespace, activationid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get activation information
     * Get activation information.
     * @param namespace The entity namespace (required)
     * @param activationid Name of activation to fetch (required)
     * @return Activation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Activation getActivationById(String namespace, String activationid) throws ApiException {
        ApiResponse<Activation> resp = getActivationByIdWithHttpInfo(namespace, activationid);
        return resp.getData();
    }

    /**
     * Get activation information
     * Get activation information.
     * @param namespace The entity namespace (required)
     * @param activationid Name of activation to fetch (required)
     * @return ApiResponse&lt;Activation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Activation> getActivationByIdWithHttpInfo(String namespace, String activationid) throws ApiException {
        com.squareup.okhttp.Call call = getActivationByIdValidateBeforeCall(namespace, activationid, null, null);
        Type localVarReturnType = new TypeToken<Activation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get activation information (asynchronously)
     * Get activation information.
     * @param namespace The entity namespace (required)
     * @param activationid Name of activation to fetch (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getActivationByIdAsync(String namespace, String activationid, final ApiCallback<Activation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getActivationByIdValidateBeforeCall(namespace, activationid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Activation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getActivations
     * @param namespace The entity namespace (required)
     * @param name Name of item (optional)
     * @param limit Number of entities to include in the result. (optional)
     * @param skip Number of entities to skip in the result. (optional)
     * @param since Only include entities later than this timestamp (measured in milliseconds since Thu, 01 Jan 1970) (optional)
     * @param upto Only include entities earlier than this timestamp (measured in milliseconds since Thu, 01 Jan 1970) (optional)
     * @param docs Whether to include full entity description. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getActivationsCall(String namespace, String name, Integer limit, Integer skip, Integer since, Integer upto, Boolean docs, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/namespaces/{namespace}/activations"
            .replaceAll("\\{" + "namespace" + "\\}", apiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
        if (since != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "since", since));
        if (upto != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "upto", upto));
        if (docs != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "docs", docs));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getActivationsValidateBeforeCall(String namespace, String name, Integer limit, Integer skip, Integer since, Integer upto, Boolean docs, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getActivations(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getActivationsCall(namespace, name, limit, skip, since, upto, docs, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get activation ids
     * Get activation ids.
     * @param namespace The entity namespace (required)
     * @param name Name of item (optional)
     * @param limit Number of entities to include in the result. (optional)
     * @param skip Number of entities to skip in the result. (optional)
     * @param since Only include entities later than this timestamp (measured in milliseconds since Thu, 01 Jan 1970) (optional)
     * @param upto Only include entities earlier than this timestamp (measured in milliseconds since Thu, 01 Jan 1970) (optional)
     * @param docs Whether to include full entity description. (optional)
     * @return List&lt;EntityBrief&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<EntityBrief> getActivations(String namespace, String name, Integer limit, Integer skip, Integer since, Integer upto, Boolean docs) throws ApiException {
        ApiResponse<List<EntityBrief>> resp = getActivationsWithHttpInfo(namespace, name, limit, skip, since, upto, docs);
        return resp.getData();
    }

    /**
     * Get activation ids
     * Get activation ids.
     * @param namespace The entity namespace (required)
     * @param name Name of item (optional)
     * @param limit Number of entities to include in the result. (optional)
     * @param skip Number of entities to skip in the result. (optional)
     * @param since Only include entities later than this timestamp (measured in milliseconds since Thu, 01 Jan 1970) (optional)
     * @param upto Only include entities earlier than this timestamp (measured in milliseconds since Thu, 01 Jan 1970) (optional)
     * @param docs Whether to include full entity description. (optional)
     * @return ApiResponse&lt;List&lt;EntityBrief&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<EntityBrief>> getActivationsWithHttpInfo(String namespace, String name, Integer limit, Integer skip, Integer since, Integer upto, Boolean docs) throws ApiException {
        com.squareup.okhttp.Call call = getActivationsValidateBeforeCall(namespace, name, limit, skip, since, upto, docs, null, null);
        Type localVarReturnType = new TypeToken<List<EntityBrief>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get activation ids (asynchronously)
     * Get activation ids.
     * @param namespace The entity namespace (required)
     * @param name Name of item (optional)
     * @param limit Number of entities to include in the result. (optional)
     * @param skip Number of entities to skip in the result. (optional)
     * @param since Only include entities later than this timestamp (measured in milliseconds since Thu, 01 Jan 1970) (optional)
     * @param upto Only include entities earlier than this timestamp (measured in milliseconds since Thu, 01 Jan 1970) (optional)
     * @param docs Whether to include full entity description. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getActivationsAsync(String namespace, String name, Integer limit, Integer skip, Integer since, Integer upto, Boolean docs, final ApiCallback<List<EntityBrief>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getActivationsValidateBeforeCall(namespace, name, limit, skip, since, upto, docs, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<EntityBrief>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for namespacesNamespaceActivationsActivationidLogsGet
     * @param namespace The entity namespace (required)
     * @param activationid Name of activation to fetch (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call namespacesNamespaceActivationsActivationidLogsGetCall(String namespace, String activationid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/namespaces/{namespace}/activations/{activationid}/logs"
            .replaceAll("\\{" + "namespace" + "\\}", apiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "activationid" + "\\}", apiClient.escapeString(activationid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call namespacesNamespaceActivationsActivationidLogsGetValidateBeforeCall(String namespace, String activationid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling namespacesNamespaceActivationsActivationidLogsGet(Async)");
        }
        
        // verify the required parameter 'activationid' is set
        if (activationid == null) {
            throw new ApiException("Missing the required parameter 'activationid' when calling namespacesNamespaceActivationsActivationidLogsGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = namespacesNamespaceActivationsActivationidLogsGetCall(namespace, activationid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get the logs for an activation
     * Get activation logs information.
     * @param namespace The entity namespace (required)
     * @param activationid Name of activation to fetch (required)
     * @return ActivationLogs
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ActivationLogs namespacesNamespaceActivationsActivationidLogsGet(String namespace, String activationid) throws ApiException {
        ApiResponse<ActivationLogs> resp = namespacesNamespaceActivationsActivationidLogsGetWithHttpInfo(namespace, activationid);
        return resp.getData();
    }

    /**
     * Get the logs for an activation
     * Get activation logs information.
     * @param namespace The entity namespace (required)
     * @param activationid Name of activation to fetch (required)
     * @return ApiResponse&lt;ActivationLogs&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ActivationLogs> namespacesNamespaceActivationsActivationidLogsGetWithHttpInfo(String namespace, String activationid) throws ApiException {
        com.squareup.okhttp.Call call = namespacesNamespaceActivationsActivationidLogsGetValidateBeforeCall(namespace, activationid, null, null);
        Type localVarReturnType = new TypeToken<ActivationLogs>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the logs for an activation (asynchronously)
     * Get activation logs information.
     * @param namespace The entity namespace (required)
     * @param activationid Name of activation to fetch (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call namespacesNamespaceActivationsActivationidLogsGetAsync(String namespace, String activationid, final ApiCallback<ActivationLogs> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = namespacesNamespaceActivationsActivationidLogsGetValidateBeforeCall(namespace, activationid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ActivationLogs>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for namespacesNamespaceActivationsActivationidResultGet
     * @param namespace The entity namespace (required)
     * @param activationid Name of activation to fetch (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call namespacesNamespaceActivationsActivationidResultGetCall(String namespace, String activationid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/namespaces/{namespace}/activations/{activationid}/result"
            .replaceAll("\\{" + "namespace" + "\\}", apiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "activationid" + "\\}", apiClient.escapeString(activationid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call namespacesNamespaceActivationsActivationidResultGetValidateBeforeCall(String namespace, String activationid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling namespacesNamespaceActivationsActivationidResultGet(Async)");
        }
        
        // verify the required parameter 'activationid' is set
        if (activationid == null) {
            throw new ApiException("Missing the required parameter 'activationid' when calling namespacesNamespaceActivationsActivationidResultGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = namespacesNamespaceActivationsActivationidResultGetCall(namespace, activationid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get the result of an activation
     * Get activation result.
     * @param namespace The entity namespace (required)
     * @param activationid Name of activation to fetch (required)
     * @return ActivationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ActivationResponse namespacesNamespaceActivationsActivationidResultGet(String namespace, String activationid) throws ApiException {
        ApiResponse<ActivationResponse> resp = namespacesNamespaceActivationsActivationidResultGetWithHttpInfo(namespace, activationid);
        return resp.getData();
    }

    /**
     * Get the result of an activation
     * Get activation result.
     * @param namespace The entity namespace (required)
     * @param activationid Name of activation to fetch (required)
     * @return ApiResponse&lt;ActivationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ActivationResponse> namespacesNamespaceActivationsActivationidResultGetWithHttpInfo(String namespace, String activationid) throws ApiException {
        com.squareup.okhttp.Call call = namespacesNamespaceActivationsActivationidResultGetValidateBeforeCall(namespace, activationid, null, null);
        Type localVarReturnType = new TypeToken<ActivationResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the result of an activation (asynchronously)
     * Get activation result.
     * @param namespace The entity namespace (required)
     * @param activationid Name of activation to fetch (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call namespacesNamespaceActivationsActivationidResultGetAsync(String namespace, String activationid, final ApiCallback<ActivationResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = namespacesNamespaceActivationsActivationidResultGetValidateBeforeCall(namespace, activationid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ActivationResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
