package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.ems.faultmns.model.AlarmType;
import com.ems.faultmns.model.CorrelatedNotification;
import com.ems.faultmns.model.NotificationType;
import com.ems.faultmns.model.PerceivedSeverity;
import com.ems.faultmns.model.SpecificProblem;
import com.ems.faultmns.model.ThresholdInfo;
import com.ems.faultmns.model.TrendIndication;
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
 * NotifyChangedAlarmGeneral
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class NotifyChangedAlarmGeneral {

  private String href;

  private Integer notificationId;

  private NotificationType notificationType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime eventTime;

  private String systemDN;

  private String alarmId;

  private AlarmType alarmType;

  private Integer probableCause = null;

  private SpecificProblem specificProblem;

  private PerceivedSeverity perceivedSeverity;

  @Valid
  private List<@Valid CorrelatedNotification> correlatedNotifications;

  private Boolean backedUpStatus;

  private String backUpObject;

  private TrendIndication trendIndication;

  private ThresholdInfo thresholdInfo;

  @Valid
  private List<@Valid Map<String, Object>> stateChangeDefinition;

  @Valid
  private Map<String, Object> monitoredAttributes = new HashMap<>();

  private String proposedRepairActions;

  private String additionalText;

  @Valid
  private Map<String, Object> additionalInformation = new HashMap<>();

  private Boolean rootCauseIndicator;

  @Valid
  private Map<String, Object> changedAlarmAttributes = new HashMap<>();

  public NotifyChangedAlarmGeneral() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NotifyChangedAlarmGeneral(String href, Integer notificationId, NotificationType notificationType, OffsetDateTime eventTime, String systemDN, String alarmId, AlarmType alarmType, Integer probableCause) {
    this.href = href;
    this.notificationId = notificationId;
    this.notificationType = notificationType;
    this.eventTime = eventTime;
    this.systemDN = systemDN;
    this.alarmId = alarmId;
    this.alarmType = alarmType;
    this.probableCause = probableCause;
  }

  public NotifyChangedAlarmGeneral href(String href) {
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

  public NotifyChangedAlarmGeneral notificationId(Integer notificationId) {
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

  public NotifyChangedAlarmGeneral notificationType(NotificationType notificationType) {
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

  public NotifyChangedAlarmGeneral eventTime(OffsetDateTime eventTime) {
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

  public NotifyChangedAlarmGeneral systemDN(String systemDN) {
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

  public NotifyChangedAlarmGeneral alarmId(String alarmId) {
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

  public NotifyChangedAlarmGeneral alarmType(AlarmType alarmType) {
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

  public NotifyChangedAlarmGeneral probableCause(Integer probableCause) {
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

  public NotifyChangedAlarmGeneral specificProblem(SpecificProblem specificProblem) {
    this.specificProblem = specificProblem;
    return this;
  }

  /**
   * Get specificProblem
   * @return specificProblem
  */
  @Valid 
  @Schema(name = "specificProblem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("specificProblem")
  public SpecificProblem getSpecificProblem() {
    return specificProblem;
  }

  public void setSpecificProblem(SpecificProblem specificProblem) {
    this.specificProblem = specificProblem;
  }

  public NotifyChangedAlarmGeneral perceivedSeverity(PerceivedSeverity perceivedSeverity) {
    this.perceivedSeverity = perceivedSeverity;
    return this;
  }

  /**
   * Get perceivedSeverity
   * @return perceivedSeverity
  */
  @Valid 
  @Schema(name = "perceivedSeverity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("perceivedSeverity")
  public PerceivedSeverity getPerceivedSeverity() {
    return perceivedSeverity;
  }

  public void setPerceivedSeverity(PerceivedSeverity perceivedSeverity) {
    this.perceivedSeverity = perceivedSeverity;
  }

  public NotifyChangedAlarmGeneral correlatedNotifications(List<@Valid CorrelatedNotification> correlatedNotifications) {
    this.correlatedNotifications = correlatedNotifications;
    return this;
  }

  public NotifyChangedAlarmGeneral addCorrelatedNotificationsItem(CorrelatedNotification correlatedNotificationsItem) {
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

  public NotifyChangedAlarmGeneral backedUpStatus(Boolean backedUpStatus) {
    this.backedUpStatus = backedUpStatus;
    return this;
  }

  /**
   * Get backedUpStatus
   * @return backedUpStatus
  */
  
  @Schema(name = "backedUpStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("backedUpStatus")
  public Boolean getBackedUpStatus() {
    return backedUpStatus;
  }

  public void setBackedUpStatus(Boolean backedUpStatus) {
    this.backedUpStatus = backedUpStatus;
  }

  public NotifyChangedAlarmGeneral backUpObject(String backUpObject) {
    this.backUpObject = backUpObject;
    return this;
  }

  /**
   * Get backUpObject
   * @return backUpObject
  */
  
  @Schema(name = "backUpObject", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("backUpObject")
  public String getBackUpObject() {
    return backUpObject;
  }

  public void setBackUpObject(String backUpObject) {
    this.backUpObject = backUpObject;
  }

  public NotifyChangedAlarmGeneral trendIndication(TrendIndication trendIndication) {
    this.trendIndication = trendIndication;
    return this;
  }

  /**
   * Get trendIndication
   * @return trendIndication
  */
  @Valid 
  @Schema(name = "trendIndication", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trendIndication")
  public TrendIndication getTrendIndication() {
    return trendIndication;
  }

  public void setTrendIndication(TrendIndication trendIndication) {
    this.trendIndication = trendIndication;
  }

  public NotifyChangedAlarmGeneral thresholdInfo(ThresholdInfo thresholdInfo) {
    this.thresholdInfo = thresholdInfo;
    return this;
  }

  /**
   * Get thresholdInfo
   * @return thresholdInfo
  */
  @Valid 
  @Schema(name = "thresholdInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thresholdInfo")
  public ThresholdInfo getThresholdInfo() {
    return thresholdInfo;
  }

  public void setThresholdInfo(ThresholdInfo thresholdInfo) {
    this.thresholdInfo = thresholdInfo;
  }

  public NotifyChangedAlarmGeneral stateChangeDefinition(List<@Valid Map<String, Object>> stateChangeDefinition) {
    this.stateChangeDefinition = stateChangeDefinition;
    return this;
  }

  public NotifyChangedAlarmGeneral addStateChangeDefinitionItem(Map<String, Object> stateChangeDefinitionItem) {
    if (this.stateChangeDefinition == null) {
      this.stateChangeDefinition = new ArrayList<>();
    }
    this.stateChangeDefinition.add(stateChangeDefinitionItem);
    return this;
  }

  /**
   * The first array item contains the attribute name value pairs with the new values, and the second array item the attribute name value pairs with the optional old values.
   * @return stateChangeDefinition
  */
  @Valid @Size(min = 1, max = 2) 
  @Schema(name = "stateChangeDefinition", description = "The first array item contains the attribute name value pairs with the new values, and the second array item the attribute name value pairs with the optional old values.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateChangeDefinition")
  public List<@Valid Map<String, Object>> getStateChangeDefinition() {
    return stateChangeDefinition;
  }

  public void setStateChangeDefinition(List<@Valid Map<String, Object>> stateChangeDefinition) {
    this.stateChangeDefinition = stateChangeDefinition;
  }

  public NotifyChangedAlarmGeneral monitoredAttributes(Map<String, Object> monitoredAttributes) {
    this.monitoredAttributes = monitoredAttributes;
    return this;
  }

  public NotifyChangedAlarmGeneral putMonitoredAttributesItem(String key, Object monitoredAttributesItem) {
    if (this.monitoredAttributes == null) {
      this.monitoredAttributes = new HashMap<>();
    }
    this.monitoredAttributes.put(key, monitoredAttributesItem);
    return this;
  }

  /**
   * The key of this map is the attribute name, and the value the attribute value.
   * @return monitoredAttributes
  */
  @Size(min = 1) 
  @Schema(name = "monitoredAttributes", description = "The key of this map is the attribute name, and the value the attribute value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monitoredAttributes")
  public Map<String, Object> getMonitoredAttributes() {
    return monitoredAttributes;
  }

  public void setMonitoredAttributes(Map<String, Object> monitoredAttributes) {
    this.monitoredAttributes = monitoredAttributes;
  }

  public NotifyChangedAlarmGeneral proposedRepairActions(String proposedRepairActions) {
    this.proposedRepairActions = proposedRepairActions;
    return this;
  }

  /**
   * Get proposedRepairActions
   * @return proposedRepairActions
  */
  
  @Schema(name = "proposedRepairActions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proposedRepairActions")
  public String getProposedRepairActions() {
    return proposedRepairActions;
  }

  public void setProposedRepairActions(String proposedRepairActions) {
    this.proposedRepairActions = proposedRepairActions;
  }

  public NotifyChangedAlarmGeneral additionalText(String additionalText) {
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

  public NotifyChangedAlarmGeneral additionalInformation(Map<String, Object> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  public NotifyChangedAlarmGeneral putAdditionalInformationItem(String key, Object additionalInformationItem) {
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

  public NotifyChangedAlarmGeneral rootCauseIndicator(Boolean rootCauseIndicator) {
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

  public NotifyChangedAlarmGeneral changedAlarmAttributes(Map<String, Object> changedAlarmAttributes) {
    this.changedAlarmAttributes = changedAlarmAttributes;
    return this;
  }

  public NotifyChangedAlarmGeneral putChangedAlarmAttributesItem(String key, Object changedAlarmAttributesItem) {
    if (this.changedAlarmAttributes == null) {
      this.changedAlarmAttributes = new HashMap<>();
    }
    this.changedAlarmAttributes.put(key, changedAlarmAttributesItem);
    return this;
  }

  /**
   * The key of this map is the attribute name, and the value the attribute value.
   * @return changedAlarmAttributes
  */
  @Size(min = 1) 
  @Schema(name = "changedAlarmAttributes", description = "The key of this map is the attribute name, and the value the attribute value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changedAlarmAttributes")
  public Map<String, Object> getChangedAlarmAttributes() {
    return changedAlarmAttributes;
  }

  public void setChangedAlarmAttributes(Map<String, Object> changedAlarmAttributes) {
    this.changedAlarmAttributes = changedAlarmAttributes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotifyChangedAlarmGeneral notifyChangedAlarmGeneral = (NotifyChangedAlarmGeneral) o;
    return Objects.equals(this.href, notifyChangedAlarmGeneral.href) &&
        Objects.equals(this.notificationId, notifyChangedAlarmGeneral.notificationId) &&
        Objects.equals(this.notificationType, notifyChangedAlarmGeneral.notificationType) &&
        Objects.equals(this.eventTime, notifyChangedAlarmGeneral.eventTime) &&
        Objects.equals(this.systemDN, notifyChangedAlarmGeneral.systemDN) &&
        Objects.equals(this.alarmId, notifyChangedAlarmGeneral.alarmId) &&
        Objects.equals(this.alarmType, notifyChangedAlarmGeneral.alarmType) &&
        Objects.equals(this.probableCause, notifyChangedAlarmGeneral.probableCause) &&
        Objects.equals(this.specificProblem, notifyChangedAlarmGeneral.specificProblem) &&
        Objects.equals(this.perceivedSeverity, notifyChangedAlarmGeneral.perceivedSeverity) &&
        Objects.equals(this.correlatedNotifications, notifyChangedAlarmGeneral.correlatedNotifications) &&
        Objects.equals(this.backedUpStatus, notifyChangedAlarmGeneral.backedUpStatus) &&
        Objects.equals(this.backUpObject, notifyChangedAlarmGeneral.backUpObject) &&
        Objects.equals(this.trendIndication, notifyChangedAlarmGeneral.trendIndication) &&
        Objects.equals(this.thresholdInfo, notifyChangedAlarmGeneral.thresholdInfo) &&
        Objects.equals(this.stateChangeDefinition, notifyChangedAlarmGeneral.stateChangeDefinition) &&
        Objects.equals(this.monitoredAttributes, notifyChangedAlarmGeneral.monitoredAttributes) &&
        Objects.equals(this.proposedRepairActions, notifyChangedAlarmGeneral.proposedRepairActions) &&
        Objects.equals(this.additionalText, notifyChangedAlarmGeneral.additionalText) &&
        Objects.equals(this.additionalInformation, notifyChangedAlarmGeneral.additionalInformation) &&
        Objects.equals(this.rootCauseIndicator, notifyChangedAlarmGeneral.rootCauseIndicator) &&
        Objects.equals(this.changedAlarmAttributes, notifyChangedAlarmGeneral.changedAlarmAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, notificationId, notificationType, eventTime, systemDN, alarmId, alarmType, probableCause, specificProblem, perceivedSeverity, correlatedNotifications, backedUpStatus, backUpObject, trendIndication, thresholdInfo, stateChangeDefinition, monitoredAttributes, proposedRepairActions, additionalText, additionalInformation, rootCauseIndicator, changedAlarmAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotifyChangedAlarmGeneral {\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    systemDN: ").append(toIndentedString(systemDN)).append("\n");
    sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
    sb.append("    alarmType: ").append(toIndentedString(alarmType)).append("\n");
    sb.append("    probableCause: ").append(toIndentedString(probableCause)).append("\n");
    sb.append("    specificProblem: ").append(toIndentedString(specificProblem)).append("\n");
    sb.append("    perceivedSeverity: ").append(toIndentedString(perceivedSeverity)).append("\n");
    sb.append("    correlatedNotifications: ").append(toIndentedString(correlatedNotifications)).append("\n");
    sb.append("    backedUpStatus: ").append(toIndentedString(backedUpStatus)).append("\n");
    sb.append("    backUpObject: ").append(toIndentedString(backUpObject)).append("\n");
    sb.append("    trendIndication: ").append(toIndentedString(trendIndication)).append("\n");
    sb.append("    thresholdInfo: ").append(toIndentedString(thresholdInfo)).append("\n");
    sb.append("    stateChangeDefinition: ").append(toIndentedString(stateChangeDefinition)).append("\n");
    sb.append("    monitoredAttributes: ").append(toIndentedString(monitoredAttributes)).append("\n");
    sb.append("    proposedRepairActions: ").append(toIndentedString(proposedRepairActions)).append("\n");
    sb.append("    additionalText: ").append(toIndentedString(additionalText)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    rootCauseIndicator: ").append(toIndentedString(rootCauseIndicator)).append("\n");
    sb.append("    changedAlarmAttributes: ").append(toIndentedString(changedAlarmAttributes)).append("\n");
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

