package com.ltp.contacts.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.time.LocalDateTime;

public class ErrorResponse {

  @JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
  private LocalDateTime timestamp;
  private String message;

  public ErrorResponse(String message) {
    this.timestamp = LocalDateTime.now();
    this.message = message;
  }

  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  public String getMessage() {
    return message;
  }

  public void setTimestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
