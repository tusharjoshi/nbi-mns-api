package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CorrelatedNotification
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CorrelatedNotification {

  private String sourceObjectInstance;

  @Valid
  private List<@Valid Integer> notificationIds = new ArrayList<>();

  public CorrelatedNotification() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CorrelatedNotification(String sourceObjectInstance, List<@Valid Integer> notificationIds) {
    this.sourceObjectInstance = sourceObjectInstance;
    this.notificationIds = notificationIds;
  }

  public CorrelatedNotification sourceObjectInstance(String sourceObjectInstance) {
    this.sourceObjectInstance = sourceObjectInstance;
    return this;
  }

  /**
   * Get sourceObjectInstance
   * @return sourceObjectInstance
  */
  @NotNull 
  @Schema(name = "sourceObjectInstance", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sourceObjectInstance")
  public String getSourceObjectInstance() {
    return sourceObjectInstance;
  }

  public void setSourceObjectInstance(String sourceObjectInstance) {
    this.sourceObjectInstance = sourceObjectInstance;
  }

  public CorrelatedNotification notificationIds(List<@Valid Integer> notificationIds) {
    this.notificationIds = notificationIds;
    return this;
  }

  public CorrelatedNotification addNotificationIdsItem(Integer notificationIdsItem) {
    if (this.notificationIds == null) {
      this.notificationIds = new ArrayList<>();
    }
    this.notificationIds.add(notificationIdsItem);
    return this;
  }

  /**
   * Get notificationIds
   * @return notificationIds
  */
  @NotNull 
  @Schema(name = "notificationIds", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("notificationIds")
  public List<@Valid Integer> getNotificationIds() {
    return notificationIds;
  }

  public void setNotificationIds(List<@Valid Integer> notificationIds) {
    this.notificationIds = notificationIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorrelatedNotification correlatedNotification = (CorrelatedNotification) o;
    return Objects.equals(this.sourceObjectInstance, correlatedNotification.sourceObjectInstance) &&
        Objects.equals(this.notificationIds, correlatedNotification.notificationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceObjectInstance, notificationIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorrelatedNotification {\n");
    sb.append("    sourceObjectInstance: ").append(toIndentedString(sourceObjectInstance)).append("\n");
    sb.append("    notificationIds: ").append(toIndentedString(notificationIds)).append("\n");
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

