package com.ems.faultmns.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * Comment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Comment {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime commentTime;

  private String commentUserId;

  private String commentSystemId;

  private String commentText;

  public Comment commentTime(OffsetDateTime commentTime) {
    this.commentTime = commentTime;
    return this;
  }

  /**
   * Get commentTime
   * @return commentTime
  */
  @Valid 
  @Schema(name = "commentTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commentTime")
  public OffsetDateTime getCommentTime() {
    return commentTime;
  }

  public void setCommentTime(OffsetDateTime commentTime) {
    this.commentTime = commentTime;
  }

  public Comment commentUserId(String commentUserId) {
    this.commentUserId = commentUserId;
    return this;
  }

  /**
   * Get commentUserId
   * @return commentUserId
  */
  
  @Schema(name = "commentUserId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commentUserId")
  public String getCommentUserId() {
    return commentUserId;
  }

  public void setCommentUserId(String commentUserId) {
    this.commentUserId = commentUserId;
  }

  public Comment commentSystemId(String commentSystemId) {
    this.commentSystemId = commentSystemId;
    return this;
  }

  /**
   * Get commentSystemId
   * @return commentSystemId
  */
  
  @Schema(name = "commentSystemId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commentSystemId")
  public String getCommentSystemId() {
    return commentSystemId;
  }

  public void setCommentSystemId(String commentSystemId) {
    this.commentSystemId = commentSystemId;
  }

  public Comment commentText(String commentText) {
    this.commentText = commentText;
    return this;
  }

  /**
   * Get commentText
   * @return commentText
  */
  
  @Schema(name = "commentText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commentText")
  public String getCommentText() {
    return commentText;
  }

  public void setCommentText(String commentText) {
    this.commentText = commentText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.commentTime, comment.commentTime) &&
        Objects.equals(this.commentUserId, comment.commentUserId) &&
        Objects.equals(this.commentSystemId, comment.commentSystemId) &&
        Objects.equals(this.commentText, comment.commentText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentTime, commentUserId, commentSystemId, commentText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    sb.append("    commentTime: ").append(toIndentedString(commentTime)).append("\n");
    sb.append("    commentUserId: ").append(toIndentedString(commentUserId)).append("\n");
    sb.append("    commentSystemId: ").append(toIndentedString(commentSystemId)).append("\n");
    sb.append("    commentText: ").append(toIndentedString(commentText)).append("\n");
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

