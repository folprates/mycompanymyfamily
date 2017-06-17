package com.mfmc.domain.helper;

import java.util.Locale;

import org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration;
import org.springframework.context.MessageSource;

public class MessageBundle {

  private static final MessageSource message = new MessageSourceAutoConfiguration().messageSource();

  public static String getMessage(String code) {
    return message.getMessage(code, null, new Locale("pt", "BR"));
  }

  public static String getMessages(String code, String... args) {
    return message.getMessage(code, args, new Locale("pt", "BR"));
  }

}
