package com.mfmc.domain.exception;

public class JsonException extends RuntimeException {

  private static final long serialVersionUID = 162037131921686102L;

  public JsonException() {
    super();
  }

  public JsonException(String message) {
    super(message);
  }

  public JsonException(Throwable throwable) {
    super(throwable);
  }

  public JsonException(String message, Throwable throwable) {
    super(message, throwable);
  }

}
