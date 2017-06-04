package com.mfmc.domain.entity.responseerror;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseEntityError extends ResponseEntity<ResponseError> {

  public ResponseEntityError(String message, HttpStatus status) {
    super(new ResponseError(status.value(), message), status);
  }

}
