package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.ems.faultmns.model.AckState;
import com.ems.faultmns.model.AlarmType;
import com.ems.faultmns.model.NotificationType;
import com.ems.faultmns.model.PerceivedSeverity;
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
 * NotifyAckStateChanged
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class NotifyAckStateChanged {

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

  private AckState ackState;

  private String ackUserId;

  private String ackSystemId;

  public NotifyAckStateChanged() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NotifyAckStateChanged(String href, Integer notificationId, NotificationType notificationType, OffsetDateTime eventTime, String systemDN, String alarmId, AlarmType alarmType, Integer probableCause, PerceivedSeverity perceivedSeverity, AckState ackState, String ackUserId) {
    this.href = href;
    this.notificationId = notificationId;
    this.notificationType = notificationType;
    this.eventTime = eventTime;
    this.systemDN = systemDN;
    this.alarmId = alarmId;
    this.alarmType = alarmType;
    this.probableCause = probableCause;
    this.perceivedSeverity = perceivedSeverity;
    this.ackState = ackState;
    this.ackUserId = ackUserId;
  }

  public NotifyAckStateChanged href(String href) {
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

  public NotifyAckStateChanged notificationId(Integer notificationId) {
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

  public NotifyAckStateChanged notificationType(NotificationType notificationType) {
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

  public NotifyAckStateChanged eventTime(OffsetDateTime eventTime) {
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

  public NotifyAckStateChanged systemDN(String systemDN) {
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

  public NotifyAckStateChanged alarmId(String alarmId) {
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

  public NotifyAckStateChanged alarmType(AlarmType alarmType) {
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

  public NotifyAckStateChanged probableCause(Integer probableCause) {
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

  public NotifyAckStateChanged perceivedSeverity(PerceivedSeverity perceivedSeverity) {
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

  public NotifyAckStateChanged ackState(AckState ackState) {
    this.ackState = ackState;
    return this;
  }

  /**
   * Get ackState
   * @return ackState
  */
  @NotNull @Valid 
  @Schema(name = "ackState", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ackState")
  public AckState getAckState() {
    return ackState;
  }

  public void setAckState(AckState ackState) {
    this.ackState = ackState;
  }

  public NotifyAckStateChanged ackUserId(String ackUserId) {
    this.ackUserId = ackUserId;
    return this;
  }

  /**
   * Get ackUserId
   * @return ackUserId
  */
  @NotNull 
  @Schema(name = "ackUserId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ackUserId")
  public String getAckUserId() {
    return ackUserId;
  }

  public void setAckUserId(String ackUserId) {
    this.ackUserId = ackUserId;
  }

  public NotifyAckStateChanged ackSystemId(String ackSystemId) {
    this.ackSystemId = ackSystemId;
    return this;
  }

  /**
   * Get ackSystemId
   * @return ackSystemId
  */
  
  @Schema(name = "ackSystemId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ackSystemId")
  public String getAckSystemId() {
    return ackSystemId;
  }

  public void setAckSystemId(String ackSystemId) {
    this.ackSystemId = ackSystemId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyAckStateChanged notifyAckStateChanged = (NotifyAckStateChanged) o;
    return Objects.equals(this.href, notifyAckStateChanged.href) &&
        Objects.equals(this.notificationId, notifyAckStateChanged.notificationId) &&
        Objects.equals(this.notificationType, notifyAckStateChanged.notificationType) &&
        Objects.equals(this.eventTime, notifyAckStateChanged.eventTime) &&
        Objects.equals(this.systemDN, notifyAckStateChanged.systemDN) &&
        Objects.equals(this.alarmId, notifyAckStateChanged.alarmId) &&
        Objects.equals(this.alarmType, notifyAckStateChanged.alarmType) &&
        Objects.equals(this.probableCause, notifyAckStateChanged.probableCause) &&
        Objects.equals(this.perceivedSeverity, notifyAckStateChanged.perceivedSeverity) &&
        Objects.equals(this.ackState, notifyAckStateChanged.ackState) &&
        Objects.equals(this.ackUserId, notifyAckStateChanged.ackUserId) &&
        Objects.equals(this.ackSystemId, notifyAckStateChanged.ackSystemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, notificationId, notificationType, eventTime, systemDN, alarmId, alarmType, probableCause, perceivedSeverity, ackState, ackUserId, ackSystemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyAckStateChanged {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    systemDN: ").append(toIndentedString(systemDN)).append("\n");
    sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
    sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
    sb.append("    probableCause: ").append(toIndentedString(probableCause)).append("\n");
    sb.append("    perceivedSeverity: ").append(toIndentedString(perceivedSeverity)).append("\n");
    sb.append("    ackState: ").append(toIndentedString(ackState)).append("\n");
    sb.append("    ackUserId: ").append(toIndentedString(ackUserId)).append("\n");
    sb.append("    ackSystemId: ").append(toIndentedString(ackSystemId)).append("\n");
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

