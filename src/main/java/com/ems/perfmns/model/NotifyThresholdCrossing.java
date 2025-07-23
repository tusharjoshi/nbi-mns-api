package com.ems.perfmns.model;

import java.net.URI;
import java.util.Objects;
import com.ems.perfmns.model.NotificationType;
import com.ems.perfmns.model.PerfMetricDirection;
import com.ems.perfmns.model.PerfMetricValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NotifyThresholdCrossing
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class NotifyThresholdCrossing {

  private String href;

  private Integer notificationId;

  private NotificationType notificationType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime eventTime;

  private String systemDN;

  private String observedPerfMetricName;

  private PerfMetricValue observedPerfMetricValue;

  private PerfMetricDirection observedPerfMetricDirection;

  private PerfMetricValue thresholdValue;

  private PerfMetricValue hysteresis;

  private Integer monitorGranularityPeriod;

  private String additionalText;

  public NotifyThresholdCrossing() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NotifyThresholdCrossing(String href, Integer notificationId, NotificationType notificationType, OffsetDateTime eventTime, String systemDN) {
    this.href = href;
    this.notificationId = notificationId;
    this.notificationType = notificationType;
    this.eventTime = eventTime;
    this.systemDN = systemDN;
  }

  public NotifyThresholdCrossing href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * @return href
  */
  @NotNull 
  @Schema(name = "href", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public NotifyThresholdCrossing notificationId(Integer notificationId) {
    this.notificationId = notificationId;
    return this;
  }

  /**
   * Get notificationId
   * @return notificationId
  */
  @NotNull 
  @Schema(name = "notificationId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("notificationId")
  public Integer getNotificationId() {
    return notificationId;
  }

  public void setNotificationId(Integer notificationId) {
    this.notificationId = notificationId;
  }

  public NotifyThresholdCrossing notificationType(NotificationType notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * Get notificationType
   * @return notificationType
  */
  @NotNull @Valid 
  @Schema(name = "notificationType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("notificationType")
  public NotificationType getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(NotificationType notificationType) {
    this.notificationType = notificationType;
  }

  public NotifyThresholdCrossing eventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Get eventTime
   * @return eventTime
  */
  @NotNull @Valid 
  @Schema(name = "eventTime", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventTime")
  public OffsetDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }

  public NotifyThresholdCrossing systemDN(String systemDN) {
    this.systemDN = systemDN;
    return this;
  }

  /**
   * Get systemDN
   * @return systemDN
  */
  @NotNull 
  @Schema(name = "systemDN", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("systemDN")
  public String getSystemDN() {
    return systemDN;
  }

  public void setSystemDN(String systemDN) {
    this.systemDN = systemDN;
  }

  public NotifyThresholdCrossing observedPerfMetricName(String observedPerfMetricName) {
    this.observedPerfMetricName = observedPerfMetricName;
    return this;
  }

  /**
   * Get observedPerfMetricName
   * @return observedPerfMetricName
  */
  
  @Schema(name = "observedPerfMetricName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("observedPerfMetricName")
  public String getObservedPerfMetricName() {
    return observedPerfMetricName;
  }

  public void setObservedPerfMetricName(String observedPerfMetricName) {
    this.observedPerfMetricName = observedPerfMetricName;
  }

  public NotifyThresholdCrossing observedPerfMetricValue(PerfMetricValue observedPerfMetricValue) {
    this.observedPerfMetricValue = observedPerfMetricValue;
    return this;
  }

  /**
   * Get observedPerfMetricValue
   * @return observedPerfMetricValue
  */
  @Valid 
  @Schema(name = "observedPerfMetricValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("observedPerfMetricValue")
  public PerfMetricValue getObservedPerfMetricValue() {
    return observedPerfMetricValue;
  }

  public void setObservedPerfMetricValue(PerfMetricValue observedPerfMetricValue) {
    this.observedPerfMetricValue = observedPerfMetricValue;
  }

  public NotifyThresholdCrossing observedPerfMetricDirection(PerfMetricDirection observedPerfMetricDirection) {
    this.observedPerfMetricDirection = observedPerfMetricDirection;
    return this;
  }

  /**
   * Get observedPerfMetricDirection
   * @return observedPerfMetricDirection
  */
  @Valid 
  @Schema(name = "observedPerfMetricDirection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("observedPerfMetricDirection")
  public PerfMetricDirection getObservedPerfMetricDirection() {
    return observedPerfMetricDirection;
  }

  public void setObservedPerfMetricDirection(PerfMetricDirection observedPerfMetricDirection) {
    this.observedPerfMetricDirection = observedPerfMetricDirection;
  }

  public NotifyThresholdCrossing thresholdValue(PerfMetricValue thresholdValue) {
    this.thresholdValue = thresholdValue;
    return this;
  }

  /**
   * Get thresholdValue
   * @return thresholdValue
  */
  @Valid 
  @Schema(name = "thresholdValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thresholdValue")
  public PerfMetricValue getThresholdValue() {
    return thresholdValue;
  }

  public void setThresholdValue(PerfMetricValue thresholdValue) {
    this.thresholdValue = thresholdValue;
  }

  public NotifyThresholdCrossing hysteresis(PerfMetricValue hysteresis) {
    this.hysteresis = hysteresis;
    return this;
  }

  /**
   * Get hysteresis
   * @return hysteresis
  */
  @Valid 
  @Schema(name = "hysteresis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hysteresis")
  public PerfMetricValue getHysteresis() {
    return hysteresis;
  }

  public void setHysteresis(PerfMetricValue hysteresis) {
    this.hysteresis = hysteresis;
  }

  public NotifyThresholdCrossing monitorGranularityPeriod(Integer monitorGranularityPeriod) {
    this.monitorGranularityPeriod = monitorGranularityPeriod;
    return this;
  }

  /**
   * Get monitorGranularityPeriod
   * @return monitorGranularityPeriod
  */
  
  @Schema(name = "monitorGranularityPeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monitorGranularityPeriod")
  public Integer getMonitorGranularityPeriod() {
    return monitorGranularityPeriod;
  }

  public void setMonitorGranularityPeriod(Integer monitorGranularityPeriod) {
    this.monitorGranularityPeriod = monitorGranularityPeriod;
  }

  public NotifyThresholdCrossing additionalText(String additionalText) {
    this.additionalText = additionalText;
    return this;
  }

  /**
   * Get additionalText
   * @return additionalText
  */
  
  @Schema(name = "additionalText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalText")
  public String getAdditionalText() {
    return additionalText;
  }

  public void setAdditionalText(String additionalText) {
    this.additionalText = additionalText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyThresholdCrossing notifyThresholdCrossing = (NotifyThresholdCrossing) o;
    return Objects.equals(this.href, notifyThresholdCrossing.href) &&
        Objects.equals(this.notificationId, notifyThresholdCrossing.notificationId) &&
        Objects.equals(this.notificationType, notifyThresholdCrossing.notificationType) &&
        Objects.equals(this.eventTime, notifyThresholdCrossing.eventTime) &&
        Objects.equals(this.systemDN, notifyThresholdCrossing.systemDN) &&
        Objects.equals(this.observedPerfMetricName, notifyThresholdCrossing.observedPerfMetricName) &&
        Objects.equals(this.observedPerfMetricValue, notifyThresholdCrossing.observedPerfMetricValue) &&
        Objects.equals(this.observedPerfMetricDirection, notifyThresholdCrossing.observedPerfMetricDirection) &&
        Objects.equals(this.thresholdValue, notifyThresholdCrossing.thresholdValue) &&
        Objects.equals(this.hysteresis, notifyThresholdCrossing.hysteresis) &&
        Objects.equals(this.monitorGranularityPeriod, notifyThresholdCrossing.monitorGranularityPeriod) &&
        Objects.equals(this.additionalText, notifyThresholdCrossing.additionalText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, notificationId, notificationType, eventTime, systemDN, observedPerfMetricName, observedPerfMetricValue, observedPerfMetricDirection, thresholdValue, hysteresis, monitorGranularityPeriod, additionalText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyThresholdCrossing {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    systemDN: ").append(toIndentedString(systemDN)).append("\n");
    sb.append("    observedPerfMetricName: ").append(toIndentedString(observedPerfMetricName)).append("\n");
    sb.append("    observedPerfMetricValue: ").append(toIndentedString(observedPerfMetricValue)).append("\n");
    sb.append("    observedPerfMetricDirection: ").append(toIndentedString(observedPerfMetricDirection)).append("\n");
    sb.append("    thresholdValue: ").append(toIndentedString(thresholdValue)).append("\n");
    sb.append("    hysteresis: ").append(toIndentedString(hysteresis)).append("\n");
    sb.append("    monitorGranularityPeriod: ").append(toIndentedString(monitorGranularityPeriod)).append("\n");
    sb.append("    additionalText: ").append(toIndentedString(additionalText)).append("\n");
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

