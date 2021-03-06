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

import io.swagger.client.ApiException;
import io.swagger.client.model.Activation;
import io.swagger.client.model.ActivationLogs;
import io.swagger.client.model.ActivationResult;
import io.swagger.client.model.EntityBrief;
import io.swagger.client.model.ErrorMessage;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActivationsApi
 */
@Ignore
public class ActivationsApiTest {

    private final ActivationsApi api = new ActivationsApi();

    
    /**
     * Get activation information
     *
     * Get activation information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActivationByIdTest() throws ApiException {
        String namespace = null;
        String activationid = null;
        Activation response = api.getActivationById(namespace, activationid);

        // TODO: test validations
    }
    
    /**
     * Get activation ids
     *
     * Get activation ids.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActivationsTest() throws ApiException {
        String namespace = null;
        String name = null;
        Integer limit = null;
        Integer skip = null;
        Integer since = null;
        Integer upto = null;
        Boolean docs = null;
        List<EntityBrief> response = api.getActivations(namespace, name, limit, skip, since, upto, docs);

        // TODO: test validations
    }
    
    /**
     * Get the logs for an activation
     *
     * Get activation logs information.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void namespacesNamespaceActivationsActivationidLogsGetTest() throws ApiException {
        String namespace = null;
        String activationid = null;
        ActivationLogs response = api.namespacesNamespaceActivationsActivationidLogsGet(namespace, activationid);

        // TODO: test validations
    }
    
    /**
     * Get the result of an activation
     *
     * Get activation result.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void namespacesNamespaceActivationsActivationidResultGetTest() throws ApiException {
        String namespace = null;
        String activationid = null;
        ActivationResult response = api.namespacesNamespaceActivationsActivationidResultGet(namespace, activationid);

        // TODO: test validations
    }
    
}
