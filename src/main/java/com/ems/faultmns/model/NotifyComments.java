package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.ems.faultmns.model.AlarmType;
import com.ems.faultmns.model.Comment;
import com.ems.faultmns.model.NotificationType;
import com.ems.faultmns.model.PerceivedSeverity;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.HashMap;
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
 * NotifyComments
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class NotifyComments {

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
  private Map<String, Comment> comments = new HashMap<>();

  public NotifyComments() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NotifyComments(String href, Integer notificationId, NotificationType notificationType, OffsetDateTime eventTime, String systemDN, String alarmId, AlarmType alarmType, Integer probableCause, PerceivedSeverity perceivedSeverity, Map<String, Comment> comments) {
    this.href = href;
    this.notificationId = notificationId;
    this.notificationType = notificationType;
    this.eventTime = eventTime;
    this.systemDN = systemDN;
    this.alarmId = alarmId;
    this.alarmType = alarmType;
    this.probableCause = probableCause;
    this.perceivedSeverity = perceivedSeverity;
    this.comments = comments;
  }

  public NotifyComments href(String href) {
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

  public NotifyComments notificationId(Integer notificationId) {
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

  public NotifyComments notificationType(NotificationType notificationType) {
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

  public NotifyComments eventTime(OffsetDateTime eventTime) {
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

  public NotifyComments systemDN(String systemDN) {
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

  public NotifyComments alarmId(String alarmId) {
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

  public NotifyComments alarmType(AlarmType alarmType) {
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

  public NotifyComments probableCause(Integer probableCause) {
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

  public NotifyComments perceivedSeverity(PerceivedSeverity perceivedSeverity) {
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

  public NotifyComments comments(Map<String, Comment> comments) {
    this.comments = comments;
    return this;
  }

  public NotifyComments putCommentsItem(String key, Comment commentsItem) {
    if (this.comments == null) {
      this.comments = new HashMap<>();
    }
    this.comments.put(key, commentsItem);
    return this;
  }

  /**
   * Collection of comments. The comment identifiers are allocated by the MnS producer and used as key in the map.
   * @return comments
  */
  @NotNull @Valid 
  @Schema(name = "comments", description = "Collection of comments. The comment identifiers are allocated by the MnS producer and used as key in the map.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("comments")
  public Map<String, Comment> getComments() {
    return comments;
  }

  public void setComments(Map<String, Comment> comments) {
    this.comments = comments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyComments notifyComments = (NotifyComments) o;
    return Objects.equals(this.href, notifyComments.href) &&
        Objects.equals(this.notificationId, notifyComments.notificationId) &&
        Objects.equals(this.notificationType, notifyComments.notificationType) &&
        Objects.equals(this.eventTime, notifyComments.eventTime) &&
        Objects.equals(this.systemDN, notifyComments.systemDN) &&
        Objects.equals(this.alarmId, notifyComments.alarmId) &&
        Objects.equals(this.alarmType, notifyComments.alarmType) &&
        Objects.equals(this.probableCause, notifyComments.probableCause) &&
        Objects.equals(this.perceivedSeverity, notifyComments.perceivedSeverity) &&
        Objects.equals(this.comments, notifyComments.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, notificationId, notificationType, eventTime, systemDN, alarmId, alarmType, probableCause, perceivedSeverity, comments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyComments {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    systemDN: ").append(toIndentedString(systemDN)).append("\n");
    sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
    sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
    sb.append("    probableCause: ").append(toIndentedString(probableCause)).append("\n");
    sb.append("    perceivedSeverity: ").append(toIndentedString(perceivedSeverity)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

