package com.mfmc.domain.exception;

public class ValidationException extends RuntimeException {

  private static final long serialVersionUID = -5410375385631919L;

  public ValidationException() {
    super();
  }

  public ValidationException(String message) {
    super(message);
  }

  public ValidationException(Throwable throwable) {
    super(throwable);
  }

  public ValidationException(String message, Throwable throwable) {
    super(message, throwable);
  }

}
