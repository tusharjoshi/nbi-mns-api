package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.ems.faultmns.model.CorrelatedNotification;
import com.ems.faultmns.model.NotificationType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NotifyCorrelatedNotificationChanged
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class NotifyCorrelatedNotificationChanged {

  private String href;

  private Integer notificationId;

  private NotificationType notificationType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime eventTime;

  private String systemDN;

  private String alarmId;

  @Valid
  private List<@Valid CorrelatedNotification> correlatedNotifications = new ArrayList<>();

  private Boolean rootCauseIndicator;

  public NotifyCorrelatedNotificationChanged() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NotifyCorrelatedNotificationChanged(String href, Integer notificationId, NotificationType notificationType, OffsetDateTime eventTime, String systemDN, String alarmId, List<@Valid CorrelatedNotification> correlatedNotifications) {
    this.href = href;
    this.notificationId = notificationId;
    this.notificationType = notificationType;
    this.eventTime = eventTime;
    this.systemDN = systemDN;
    this.alarmId = alarmId;
    this.correlatedNotifications = correlatedNotifications;
  }

  public NotifyCorrelatedNotificationChanged href(String href) {
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

  public NotifyCorrelatedNotificationChanged notificationId(Integer notificationId) {
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

  public NotifyCorrelatedNotificationChanged notificationType(NotificationType notificationType) {
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

  public NotifyCorrelatedNotificationChanged eventTime(OffsetDateTime eventTime) {
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

  public NotifyCorrelatedNotificationChanged systemDN(String systemDN) {
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

  public NotifyCorrelatedNotificationChanged alarmId(String alarmId) {
    this.alarmId = alarmId;
    return this;
  }

  /**
   * Get alarmId
   * @return alarmId
  */
  @NotNull 
  @Schema(name = "alarmId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alarmId")
  public String getAlarmId() {
    return alarmId;
  }

  public void setAlarmId(String alarmId) {
    this.alarmId = alarmId;
  }

  public NotifyCorrelatedNotificationChanged correlatedNotifications(List<@Valid CorrelatedNotification> correlatedNotifications) {
    this.correlatedNotifications = correlatedNotifications;
    return this;
  }

  public NotifyCorrelatedNotificationChanged addCorrelatedNotificationsItem(CorrelatedNotification correlatedNotificationsItem) {
    if (this.correlatedNotifications == null) {
      this.correlatedNotifications = new ArrayList<>();
    }
    this.correlatedNotifications.add(correlatedNotificationsItem);
    return this;
  }

  /**
   * Get correlatedNotifications
   * @return correlatedNotifications
  */
  @NotNull @Valid 
  @Schema(name = "correlatedNotifications", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("correlatedNotifications")
  public List<@Valid CorrelatedNotification> getCorrelatedNotifications() {
    return correlatedNotifications;
  }

  public void setCorrelatedNotifications(List<@Valid CorrelatedNotification> correlatedNotifications) {
    this.correlatedNotifications = correlatedNotifications;
  }

  public NotifyCorrelatedNotificationChanged rootCauseIndicator(Boolean rootCauseIndicator) {
    this.rootCauseIndicator = rootCauseIndicator;
    return this;
  }

  /**
   * Get rootCauseIndicator
   * @return rootCauseIndicator
  */
  
  @Schema(name = "rootCauseIndicator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rootCauseIndicator")
  public Boolean getRootCauseIndicator() {
    return rootCauseIndicator;
  }

  public void setRootCauseIndicator(Boolean rootCauseIndicator) {
    this.rootCauseIndicator = rootCauseIndicator;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyCorrelatedNotificationChanged notifyCorrelatedNotificationChanged = (NotifyCorrelatedNotificationChanged) o;
    return Objects.equals(this.href, notifyCorrelatedNotificationChanged.href) &&
        Objects.equals(this.notificationId, notifyCorrelatedNotificationChanged.notificationId) &&
        Objects.equals(this.notificationType, notifyCorrelatedNotificationChanged.notificationType) &&
        Objects.equals(this.eventTime, notifyCorrelatedNotificationChanged.eventTime) &&
        Objects.equals(this.systemDN, notifyCorrelatedNotificationChanged.systemDN) &&
        Objects.equals(this.alarmId, notifyCorrelatedNotificationChanged.alarmId) &&
        Objects.equals(this.correlatedNotifications, notifyCorrelatedNotificationChanged.correlatedNotifications) &&
        Objects.equals(this.rootCauseIndicator, notifyCorrelatedNotificationChanged.rootCauseIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, notificationId, notificationType, eventTime, systemDN, alarmId, correlatedNotifications, rootCauseIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyCorrelatedNotificationChanged {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    systemDN: ").append(toIndentedString(systemDN)).append("\n");
    sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
    sb.append("    correlatedNotifications: ").append(toIndentedString(correlatedNotifications)).append("\n");
    sb.append("    rootCauseIndicator: ").append(toIndentedString(rootCauseIndicator)).append("\n");
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

