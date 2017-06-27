package com.mfmc.service.exceptionhandler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mfmc.domain.entity.responseerror.ResponseEntityError;
import com.mfmc.domain.exception.JsonException;
import com.mfmc.domain.exception.ValidationException;

@ControllerAdvice
class GlobalDefaultExceptionHandler {

  @ExceptionHandler(value = JsonException.class)
  public ResponseEntityError defaultErrorHandler(HttpServletRequest req, JsonException e) throws Exception {
    return new ResponseEntityError("Houve um problema ao converter dados do JSON: " + e.getMessage(), HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(value = MissingServletRequestParameterException.class)
  public ResponseEntityError defaultErrorHandler(HttpServletRequest req, MissingServletRequestParameterException e) throws Exception {
    return new ResponseEntityError("É necessário preencher todos parâmetros: " + e.getParameterName(), HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(value = Exception.class)
  public ResponseEntityError defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
    return new ResponseEntityError("Houve um problema: " + e.getMessage(), HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(value = ValidationException.class)
  public ResponseEntityError defaultErrorHandler(HttpServletRequest req, ValidationException e) throws Exception {
    return new ResponseEntityError("Houve um problema ao criar a entidade: " + e.getMessage(), HttpStatus.BAD_REQUEST);
  }

}
