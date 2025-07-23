package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.ems.faultmns.model.AlarmListAlignmentRequirement;
import com.ems.faultmns.model.NotificationType;
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
 * NotifyAlarmListRebuilt
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class NotifyAlarmListRebuilt {

  private String href;

  private Integer notificationId;

  private NotificationType notificationType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime eventTime;

  private String systemDN;

  private String reason;

  private AlarmListAlignmentRequirement alarmListAlignmentRequirement;

  public NotifyAlarmListRebuilt() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NotifyAlarmListRebuilt(String href, Integer notificationId, NotificationType notificationType, OffsetDateTime eventTime, String systemDN, String reason) {
    this.href = href;
    this.notificationId = notificationId;
    this.notificationType = notificationType;
    this.eventTime = eventTime;
    this.systemDN = systemDN;
    this.reason = reason;
  }

  public NotifyAlarmListRebuilt href(String href) {
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

  public NotifyAlarmListRebuilt notificationId(Integer notificationId) {
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

  public NotifyAlarmListRebuilt notificationType(NotificationType notificationType) {
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

  public NotifyAlarmListRebuilt eventTime(OffsetDateTime eventTime) {
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

  public NotifyAlarmListRebuilt systemDN(String systemDN) {
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

  public NotifyAlarmListRebuilt reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  */
  @NotNull 
  @Schema(name = "reason", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public NotifyAlarmListRebuilt alarmListAlignmentRequirement(AlarmListAlignmentRequirement alarmListAlignmentRequirement) {
    this.alarmListAlignmentRequirement = alarmListAlignmentRequirement;
    return this;
  }

  /**
   * Get alarmListAlignmentRequirement
   * @return alarmListAlignmentRequirement
  */
  @Valid 
  @Schema(name = "alarmListAlignmentRequirement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alarmListAlignmentRequirement")
  public AlarmListAlignmentRequirement getAlarmListAlignmentRequirement() {
    return alarmListAlignmentRequirement;
  }

  public void setAlarmListAlignmentRequirement(AlarmListAlignmentRequirement alarmListAlignmentRequirement) {
    this.alarmListAlignmentRequirement = alarmListAlignmentRequirement;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyAlarmListRebuilt notifyAlarmListRebuilt = (NotifyAlarmListRebuilt) o;
    return Objects.equals(this.href, notifyAlarmListRebuilt.href) &&
        Objects.equals(this.notificationId, notifyAlarmListRebuilt.notificationId) &&
        Objects.equals(this.notificationType, notifyAlarmListRebuilt.notificationType) &&
        Objects.equals(this.eventTime, notifyAlarmListRebuilt.eventTime) &&
        Objects.equals(this.systemDN, notifyAlarmListRebuilt.systemDN) &&
        Objects.equals(this.reason, notifyAlarmListRebuilt.reason) &&
        Objects.equals(this.alarmListAlignmentRequirement, notifyAlarmListRebuilt.alarmListAlignmentRequirement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, notificationId, notificationType, eventTime, systemDN, reason, alarmListAlignmentRequirement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyAlarmListRebuilt {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    systemDN: ").append(toIndentedString(systemDN)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    alarmListAlignmentRequirement: ").append(toIndentedString(alarmListAlignmentRequirement)).append("\n");
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

