package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Subscription
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Subscription {

  private String consumerReference;

  private Integer timeTick;

  private String filter;

  public Subscription consumerReference(String consumerReference) {
    this.consumerReference = consumerReference;
    return this;
  }

  /**
   * Get consumerReference
   * @return consumerReference
  */
  
  @Schema(name = "consumerReference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("consumerReference")
  public String getConsumerReference() {
    return consumerReference;
  }

  public void setConsumerReference(String consumerReference) {
    this.consumerReference = consumerReference;
  }

  public Subscription timeTick(Integer timeTick) {
    this.timeTick = timeTick;
    return this;
  }

  /**
   * Get timeTick
   * @return timeTick
  */
  
  @Schema(name = "timeTick", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeTick")
  public Integer getTimeTick() {
    return timeTick;
  }

  public void setTimeTick(Integer timeTick) {
    this.timeTick = timeTick;
  }

  public Subscription filter(String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * The filter format shall be compliant to XPath 1.0.
   * @return filter
  */
  
  @Schema(name = "filter", description = "The filter format shall be compliant to XPath 1.0.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter")
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.consumerReference, subscription.consumerReference) &&
        Objects.equals(this.timeTick, subscription.timeTick) &&
        Objects.equals(this.filter, subscription.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerReference, timeTick, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    sb.append("    consumerReference: ").append(toIndentedString(consumerReference)).append("\n");
    sb.append("    timeTick: ").append(toIndentedString(timeTick)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

