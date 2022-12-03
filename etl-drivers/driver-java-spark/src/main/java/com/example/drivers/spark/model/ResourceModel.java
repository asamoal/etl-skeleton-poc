/*
 * Driver
 * Spark Java Driver Application
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.example.drivers.spark.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.core.annotation.Nullable;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ResourceModel
 */
@JsonPropertyOrder({
  ResourceModel.JSON_PROPERTY_CONFIGURATION
})
@JsonTypeName("ResourceModel")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen")
@Introspected
public class ResourceModel {
    public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
    private Map<String, String> _configuration = null;

    public ResourceModel() {
    }

    public ResourceModel _configuration(Map<String, String> _configuration) {
        this._configuration = _configuration;
        return this;
    }

    public ResourceModel putConfigurationItem(String key, String _configurationItem) {
        if (this._configuration == null) {
            this._configuration = new HashMap<>();
        }
        this._configuration.put(key, _configurationItem);
        return this;
  }

    /**
     * Get _configuration
     * @return _configuration
     **/
    @Nullable
    @Schema(name = "configuration", required = false)
    @JsonProperty(JSON_PROPERTY_CONFIGURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, String> getConfiguration() {
        return _configuration;
    }

    @JsonProperty(JSON_PROPERTY_CONFIGURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setConfiguration(Map<String, String> _configuration) {
        this._configuration = _configuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceModel resourceModel = (ResourceModel) o;
        return Objects.equals(this._configuration, resourceModel._configuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_configuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceModel {\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}