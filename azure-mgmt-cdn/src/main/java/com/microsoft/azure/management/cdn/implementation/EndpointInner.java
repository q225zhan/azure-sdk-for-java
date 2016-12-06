/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.implementation;

import java.util.List;
import com.microsoft.azure.management.cdn.QueryStringCachingBehavior;
import com.microsoft.azure.management.cdn.GeoFilter;
import com.microsoft.azure.management.cdn.DeepCreatedOrigin;
import com.microsoft.azure.management.cdn.EndpointResourceState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * CDN endpoint is the entity within a CDN profile containing configuration
 * information regarding caching behaviors and origins. The CDN endpoint is
 * exposed using the URL format &lt;endpointname&gt;.azureedge.net by
 * default, but custom domains can also be created.
 */
@JsonFlatten
public class EndpointInner extends Resource {
    /**
     * The host header the CDN provider will send along with content requests
     * to origins. The default value is the host name of the origin.
     */
    @JsonProperty(value = "properties.originHostHeader")
    private String originHostHeader;

    /**
     * The path used for origin requests.
     */
    @JsonProperty(value = "properties.originPath")
    private String originPath;

    /**
     * List of content types on which compression will be applied. The value
     * for the elements should be a valid MIME type.
     */
    @JsonProperty(value = "properties.contentTypesToCompress")
    private List<String> contentTypesToCompress;

    /**
     * Indicates whether content compression is enabled. The default value is
     * false. If compression is enabled, the content transferred from the CDN
     * endpoint to the end user will be compressed. The requested content
     * must be larger than 1 byte and smaller than 1 MB.
     */
    @JsonProperty(value = "properties.isCompressionEnabled")
    private Boolean isCompressionEnabled;

    /**
     * Indicates whether HTTP traffic is allowed on the endpoint. Default
     * value is true. At least one protocol (HTTP or HTTPS) must be allowed.
     */
    @JsonProperty(value = "properties.isHttpAllowed")
    private Boolean isHttpAllowed;

    /**
     * Indicates whether HTTPS traffic is allowed on the endpoint. Default
     * value is true. At least one protocol (HTTP or HTTPS) must be allowed.
     */
    @JsonProperty(value = "properties.isHttpsAllowed")
    private Boolean isHttpsAllowed;

    /**
     * Defines the query string caching behavior. Possible values include:
     * 'IgnoreQueryString', 'BypassCaching', 'UseQueryString', 'NotSet'.
     */
    @JsonProperty(value = "properties.queryStringCachingBehavior")
    private QueryStringCachingBehavior queryStringCachingBehavior;

    /**
     * Customer can specify what scenario they want this CDN endpoint to
     * optimize. (e.g. Download, Media services, and etc.) With this
     * information we can apply scenario driven optimization.
     */
    @JsonProperty(value = "properties.optimizationType")
    private String optimizationType;

    /**
     * The list of geo filters for the CDN endpoint.
     */
    @JsonProperty(value = "properties.geoFilters")
    private List<GeoFilter> geoFilters;

    /**
     * The host name of the endpoint {endpointName}.{DNSZone}.
     */
    @JsonProperty(value = "properties.hostName", access = JsonProperty.Access.WRITE_ONLY)
    private String hostName;

    /**
     * The set of origins for the CDN endpoint. When multiple origins exist,
     * the first origin will be used as primary and rest will be used as
     * failover options.
     */
    @JsonProperty(value = "properties.origins", required = true)
    private List<DeepCreatedOrigin> origins;

    /**
     * Resource status of the endpoint. Possible values include: 'Creating',
     * 'Deleting', 'Running', 'Starting', 'Stopped', 'Stopping'.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private EndpointResourceState resourceState;

    /**
     * Provisioning status of the endpoint.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the originHostHeader value.
     *
     * @return the originHostHeader value
     */
    public String originHostHeader() {
        return this.originHostHeader;
    }

    /**
     * Set the originHostHeader value.
     *
     * @param originHostHeader the originHostHeader value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withOriginHostHeader(String originHostHeader) {
        this.originHostHeader = originHostHeader;
        return this;
    }

    /**
     * Get the originPath value.
     *
     * @return the originPath value
     */
    public String originPath() {
        return this.originPath;
    }

    /**
     * Set the originPath value.
     *
     * @param originPath the originPath value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withOriginPath(String originPath) {
        this.originPath = originPath;
        return this;
    }

    /**
     * Get the contentTypesToCompress value.
     *
     * @return the contentTypesToCompress value
     */
    public List<String> contentTypesToCompress() {
        return this.contentTypesToCompress;
    }

    /**
     * Set the contentTypesToCompress value.
     *
     * @param contentTypesToCompress the contentTypesToCompress value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withContentTypesToCompress(List<String> contentTypesToCompress) {
        this.contentTypesToCompress = contentTypesToCompress;
        return this;
    }

    /**
     * Get the isCompressionEnabled value.
     *
     * @return the isCompressionEnabled value
     */
    public Boolean isCompressionEnabled() {
        return this.isCompressionEnabled;
    }

    /**
     * Set the isCompressionEnabled value.
     *
     * @param isCompressionEnabled the isCompressionEnabled value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withIsCompressionEnabled(Boolean isCompressionEnabled) {
        this.isCompressionEnabled = isCompressionEnabled;
        return this;
    }

    /**
     * Get the isHttpAllowed value.
     *
     * @return the isHttpAllowed value
     */
    public Boolean isHttpAllowed() {
        return this.isHttpAllowed;
    }

    /**
     * Set the isHttpAllowed value.
     *
     * @param isHttpAllowed the isHttpAllowed value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withIsHttpAllowed(Boolean isHttpAllowed) {
        this.isHttpAllowed = isHttpAllowed;
        return this;
    }

    /**
     * Get the isHttpsAllowed value.
     *
     * @return the isHttpsAllowed value
     */
    public Boolean isHttpsAllowed() {
        return this.isHttpsAllowed;
    }

    /**
     * Set the isHttpsAllowed value.
     *
     * @param isHttpsAllowed the isHttpsAllowed value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withIsHttpsAllowed(Boolean isHttpsAllowed) {
        this.isHttpsAllowed = isHttpsAllowed;
        return this;
    }

    /**
     * Get the queryStringCachingBehavior value.
     *
     * @return the queryStringCachingBehavior value
     */
    public QueryStringCachingBehavior queryStringCachingBehavior() {
        return this.queryStringCachingBehavior;
    }

    /**
     * Set the queryStringCachingBehavior value.
     *
     * @param queryStringCachingBehavior the queryStringCachingBehavior value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withQueryStringCachingBehavior(QueryStringCachingBehavior queryStringCachingBehavior) {
        this.queryStringCachingBehavior = queryStringCachingBehavior;
        return this;
    }

    /**
     * Get the optimizationType value.
     *
     * @return the optimizationType value
     */
    public String optimizationType() {
        return this.optimizationType;
    }

    /**
     * Set the optimizationType value.
     *
     * @param optimizationType the optimizationType value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withOptimizationType(String optimizationType) {
        this.optimizationType = optimizationType;
        return this;
    }

    /**
     * Get the geoFilters value.
     *
     * @return the geoFilters value
     */
    public List<GeoFilter> geoFilters() {
        return this.geoFilters;
    }

    /**
     * Set the geoFilters value.
     *
     * @param geoFilters the geoFilters value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withGeoFilters(List<GeoFilter> geoFilters) {
        this.geoFilters = geoFilters;
        return this;
    }

    /**
     * Get the hostName value.
     *
     * @return the hostName value
     */
    public String hostName() {
        return this.hostName;
    }

    /**
     * Get the origins value.
     *
     * @return the origins value
     */
    public List<DeepCreatedOrigin> origins() {
        return this.origins;
    }

    /**
     * Set the origins value.
     *
     * @param origins the origins value to set
     * @return the EndpointInner object itself.
     */
    public EndpointInner withOrigins(List<DeepCreatedOrigin> origins) {
        this.origins = origins;
        return this;
    }

    /**
     * Get the resourceState value.
     *
     * @return the resourceState value
     */
    public EndpointResourceState resourceState() {
        return this.resourceState;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

}