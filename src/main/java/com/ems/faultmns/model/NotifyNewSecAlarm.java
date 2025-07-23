package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.ems.faultmns.model.AlarmType;
import com.ems.faultmns.model.CorrelatedNotification;
import com.ems.faultmns.model.NotificationType;
import com.ems.faultmns.model.PerceivedSeverity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * NotifyNewSecAlarm
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class NotifyNewSecAlarm {

  private String href;

  private Integer notificationId;

  private NotificationType notificationType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime eventTime;

  private String systemDN;

  private String alarmId;

  private AlarmType alarmType;

  private Integer probableCause = null;

  private PerceivedSeverity perceivedSeverity;

  @Valid
  private List<@Valid CorrelatedNotification> correlatedNotifications;

  private String additionalText;

  @Valid
  private Map<String, Object> additionalInformation = new HashMap<>();

  private Boolean rootCauseIndicator;

  private String serviceUser;

  private String serviceProvider;

  private String securityAlarmDetector;

  public NotifyNewSecAlarm() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NotifyNewSecAlarm(String href, Integer notificationId, NotificationType notificationType, OffsetDateTime eventTime, String systemDN, String alarmId, AlarmType alarmType, Integer probableCause, PerceivedSeverity perceivedSeverity, String serviceUser, String serviceProvider, String securityAlarmDetector) {
    this.href = href;
    this.notificationId = notificationId;
    this.notificationType = notificationType;
    this.eventTime = eventTime;
    this.systemDN = systemDN;
    this.alarmId = alarmId;
    this.alarmType = alarmType;
    this.probableCause = probableCause;
    this.perceivedSeverity = perceivedSeverity;
    this.serviceUser = serviceUser;
    this.serviceProvider = serviceProvider;
    this.securityAlarmDetector = securityAlarmDetector;
  }

  public NotifyNewSecAlarm href(String href) {
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

  public NotifyNewSecAlarm notificationId(Integer notificationId) {
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

  public NotifyNewSecAlarm notificationType(NotificationType notificationType) {
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

  public NotifyNewSecAlarm eventTime(OffsetDateTime eventTime) {
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

  public NotifyNewSecAlarm systemDN(String systemDN) {
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

  public NotifyNewSecAlarm alarmId(String alarmId) {
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

  public NotifyNewSecAlarm alarmType(AlarmType alarmType) {
    this.alarmType = alarmType;
    return this;
  }

  /**
   * Get alarmType
   * @return alarmType
  */
  @NotNull @Valid 
  @Schema(name = "alarmType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alarmType")
  public AlarmType getAlarmType() {
    return alarmType;
  }

  public void setAlarmType(AlarmType alarmType) {
    this.alarmType = alarmType;
  }

  public NotifyNewSecAlarm probableCause(Integer probableCause) {
    this.probableCause = probableCause;
    return this;
  }

  /**
   * Get probableCause
   * @return probableCause
  */
  @NotNull 
  @Schema(name = "probableCause", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("probableCause")
  public Integer getProbableCause() {
    return probableCause;
  }

  public void setProbableCause(Integer probableCause) {
    this.probableCause = probableCause;
  }

  public NotifyNewSecAlarm perceivedSeverity(PerceivedSeverity perceivedSeverity) {
    this.perceivedSeverity = perceivedSeverity;
    return this;
  }

  /**
   * Get perceivedSeverity
   * @return perceivedSeverity
  */
  @NotNull @Valid 
  @Schema(name = "perceivedSeverity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("perceivedSeverity")
  public PerceivedSeverity getPerceivedSeverity() {
    return perceivedSeverity;
  }

  public void setPerceivedSeverity(PerceivedSeverity perceivedSeverity) {
    this.perceivedSeverity = perceivedSeverity;
  }

  public NotifyNewSecAlarm correlatedNotifications(List<@Valid CorrelatedNotification> correlatedNotifications) {
    this.correlatedNotifications = correlatedNotifications;
    return this;
  }

  public NotifyNewSecAlarm addCorrelatedNotificationsItem(CorrelatedNotification correlatedNotificationsItem) {
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
  @Valid 
  @Schema(name = "correlatedNotifications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("correlatedNotifications")
  public List<@Valid CorrelatedNotification> getCorrelatedNotifications() {
    return correlatedNotifications;
  }

  public void setCorrelatedNotifications(List<@Valid CorrelatedNotification> correlatedNotifications) {
    this.correlatedNotifications = correlatedNotifications;
  }

  public NotifyNewSecAlarm additionalText(String additionalText) {
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

  public NotifyNewSecAlarm additionalInformation(Map<String, Object> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  public NotifyNewSecAlarm putAdditionalInformationItem(String key, Object additionalInformationItem) {
    if (this.additionalInformation == null) {
      this.additionalInformation = new HashMap<>();
    }
    this.additionalInformation.put(key, additionalInformationItem);
    return this;
  }

  /**
   * The key of this map is the attribute name, and the value the attribute value.
   * @return additionalInformation
  */
  @Size(min = 1) 
  @Schema(name = "additionalInformation", description = "The key of this map is the attribute name, and the value the attribute value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additionalInformation")
  public Map<String, Object> getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(Map<String, Object> additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public NotifyNewSecAlarm rootCauseIndicator(Boolean rootCauseIndicator) {
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

  public NotifyNewSecAlarm serviceUser(String serviceUser) {
    this.serviceUser = serviceUser;
    return this;
  }

  /**
   * Get serviceUser
   * @return serviceUser
  */
  @NotNull 
  @Schema(name = "serviceUser", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceUser")
  public String getServiceUser() {
    return serviceUser;
  }

  public void setServiceUser(String serviceUser) {
    this.serviceUser = serviceUser;
  }

  public NotifyNewSecAlarm serviceProvider(String serviceProvider) {
    this.serviceProvider = serviceProvider;
    return this;
  }

  /**
   * Get serviceProvider
   * @return serviceProvider
  */
  @NotNull 
  @Schema(name = "serviceProvider", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceProvider")
  public String getServiceProvider() {
    return serviceProvider;
  }

  public void setServiceProvider(String serviceProvider) {
    this.serviceProvider = serviceProvider;
  }

  public NotifyNewSecAlarm securityAlarmDetector(String securityAlarmDetector) {
    this.securityAlarmDetector = securityAlarmDetector;
    return this;
  }

  /**
   * Get securityAlarmDetector
   * @return securityAlarmDetector
  */
  @NotNull 
  @Schema(name = "securityAlarmDetector", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("securityAlarmDetector")
  public String getSecurityAlarmDetector() {
    return securityAlarmDetector;
  }

  public void setSecurityAlarmDetector(String securityAlarmDetector) {
    this.securityAlarmDetector = securityAlarmDetector;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyNewSecAlarm notifyNewSecAlarm = (NotifyNewSecAlarm) o;
    return Objects.equals(this.href, notifyNewSecAlarm.href) &&
        Objects.equals(this.notificationId, notifyNewSecAlarm.notificationId) &&
        Objects.equals(this.notificationType, notifyNewSecAlarm.notificationType) &&
        Objects.equals(this.eventTime, notifyNewSecAlarm.eventTime) &&
        Objects.equals(this.systemDN, notifyNewSecAlarm.systemDN) &&
        Objects.equals(this.alarmId, notifyNewSecAlarm.alarmId) &&
        Objects.equals(this.alarmType, notifyNewSecAlarm.alarmType) &&
        Objects.equals(this.probableCause, notifyNewSecAlarm.probableCause) &&
        Objects.equals(this.perceivedSeverity, notifyNewSecAlarm.perceivedSeverity) &&
        Objects.equals(this.correlatedNotifications, notifyNewSecAlarm.correlatedNotifications) &&
        Objects.equals(this.additionalText, notifyNewSecAlarm.additionalText) &&
        Objects.equals(this.additionalInformation, notifyNewSecAlarm.additionalInformation) &&
        Objects.equals(this.rootCauseIndicator, notifyNewSecAlarm.rootCauseIndicator) &&
        Objects.equals(this.serviceUser, notifyNewSecAlarm.serviceUser) &&
        Objects.equals(this.serviceProvider, notifyNewSecAlarm.serviceProvider) &&
        Objects.equals(this.securityAlarmDetector, notifyNewSecAlarm.securityAlarmDetector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, notificationId, notificationType, eventTime, systemDN, alarmId, alarmType, probableCause, perceivedSeverity, correlatedNotifications, additionalText, additionalInformation, rootCauseIndicator, serviceUser, serviceProvider, securityAlarmDetector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyNewSecAlarm {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    systemDN: ").append(toIndentedString(systemDN)).append("\n");
    sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
    sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
    sb.append("    probableCause: ").append(toIndentedString(probableCause)).append("\n");
    sb.append("    perceivedSeverity: ").append(toIndentedString(perceivedSeverity)).append("\n");
    sb.append("    correlatedNotifications: ").append(toIndentedString(correlatedNotifications)).append("\n");
    sb.append("    additionalText: ").append(toIndentedString(additionalText)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    rootCauseIndicator: ").append(toIndentedString(rootCauseIndicator)).append("\n");
    sb.append("    serviceUser: ").append(toIndentedString(serviceUser)).append("\n");
    sb.append("    serviceProvider: ").append(toIndentedString(serviceProvider)).append("\n");
    sb.append("    securityAlarmDetector: ").append(toIndentedString(securityAlarmDetector)).append("\n");
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

