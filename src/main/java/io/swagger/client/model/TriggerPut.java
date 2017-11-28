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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.KeyValue;
import io.swagger.client.model.TriggerLimits;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A restricted Trigger view that elides properties that are auto-assigned or derived from the URI (i.e., the namespace and name).
 */
@ApiModel(description = "A restricted Trigger view that elides properties that are auto-assigned or derived from the URI (i.e., the namespace and name).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-28T00:15:16.400+07:00")
public class TriggerPut {
  @SerializedName("version")
  private String version = null;

  @SerializedName("publish")
  private Boolean publish = null;

  @SerializedName("annotations")
  private List<KeyValue> annotations = null;

  @SerializedName("parameters")
  private List<KeyValue> parameters = null;

  @SerializedName("limits")
  private TriggerLimits limits = null;

  public TriggerPut version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Semantic version of the item
   * @return version
  **/
  @ApiModelProperty(value = "Semantic version of the item")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public TriggerPut publish(Boolean publish) {
    this.publish = publish;
    return this;
  }

   /**
   * Whether to publish the item or not
   * @return publish
  **/
  @ApiModelProperty(value = "Whether to publish the item or not")
  public Boolean getPublish() {
    return publish;
  }

  public void setPublish(Boolean publish) {
    this.publish = publish;
  }

  public TriggerPut annotations(List<KeyValue> annotations) {
    this.annotations = annotations;
    return this;
  }

  public TriggerPut addAnnotationsItem(KeyValue annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<KeyValue>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

   /**
   * annotations on the item
   * @return annotations
  **/
  @ApiModelProperty(value = "annotations on the item")
  public List<KeyValue> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<KeyValue> annotations) {
    this.annotations = annotations;
  }

  public TriggerPut parameters(List<KeyValue> parameters) {
    this.parameters = parameters;
    return this;
  }

  public TriggerPut addParametersItem(KeyValue parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<KeyValue>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * parameter bindings included in the context passed to the trigger
   * @return parameters
  **/
  @ApiModelProperty(value = "parameter bindings included in the context passed to the trigger")
  public List<KeyValue> getParameters() {
    return parameters;
  }

  public void setParameters(List<KeyValue> parameters) {
    this.parameters = parameters;
  }

  public TriggerPut limits(TriggerLimits limits) {
    this.limits = limits;
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
  @ApiModelProperty(value = "")
  public TriggerLimits getLimits() {
    return limits;
  }

  public void setLimits(TriggerLimits limits) {
    this.limits = limits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriggerPut triggerPut = (TriggerPut) o;
    return Objects.equals(this.version, triggerPut.version) &&
        Objects.equals(this.publish, triggerPut.publish) &&
        Objects.equals(this.annotations, triggerPut.annotations) &&
        Objects.equals(this.parameters, triggerPut.parameters) &&
        Objects.equals(this.limits, triggerPut.limits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, publish, annotations, parameters, limits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriggerPut {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    publish: ").append(toIndentedString(publish)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

