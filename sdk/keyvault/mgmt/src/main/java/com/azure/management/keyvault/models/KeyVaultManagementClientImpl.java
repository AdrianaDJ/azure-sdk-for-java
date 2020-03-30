// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.keyvault.models;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.AzureEnvironment;
import com.azure.management.AzureServiceClient;

/**
 * Initializes a new instance of the KeyVaultManagementClientImpl type.
 */
public final class KeyVaultManagementClientImpl extends AzureServiceClient {
    /**
     * Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     */
    private String subscriptionId;

    /**
     * Gets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     * 
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     * 
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself.
     */
    KeyVaultManagementClientImpl setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * server parameter.
     */
    private String host;

    /**
     * Gets server parameter.
     * 
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Sets server parameter.
     * 
     * @param host the host value.
     * @return the service client itself.
     */
    KeyVaultManagementClientImpl setHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * The API version to use for this operation.
     */
    private String apiVersion;

    /**
     * Gets The API version to use for this operation.
     * 
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Sets The API version to use for this operation.
     * 
     * @param apiVersion the apiVersion value.
     * @return the service client itself.
     */
    KeyVaultManagementClientImpl setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The VaultsInner object to access its operations.
     */
    private VaultsInner vaults;

    /**
     * Gets the VaultsInner object to access its operations.
     * 
     * @return the VaultsInner object.
     */
    public VaultsInner vaults() {
        return this.vaults;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * 
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * Initializes an instance of KeyVaultManagementClient client.
     */
    public KeyVaultManagementClientImpl() {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy()).build(), AzureEnvironment.AZURE);
    }

    /**
     * Initializes an instance of KeyVaultManagementClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public KeyVaultManagementClientImpl(HttpPipeline httpPipeline) {
        this(httpPipeline, AzureEnvironment.AZURE);
    }

    /**
     * Initializes an instance of KeyVaultManagementClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param environment The Azure environment.
     */
    public KeyVaultManagementClientImpl(HttpPipeline httpPipeline, AzureEnvironment environment) {
        super(httpPipeline, environment);
        this.httpPipeline = httpPipeline;
        this.vaults = new VaultsInner(this);
        this.operations = new OperationsInner(this);
    }
}