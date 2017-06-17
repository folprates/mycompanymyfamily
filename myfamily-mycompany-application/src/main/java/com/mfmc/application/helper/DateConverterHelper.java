package com.mfmc.application.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverterHelper {

  private static final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

  public static Date getDate(String date) {
    try {
      return formatter.parse(date);
    } catch (ParseException e) {
      return null;
    }
  }

}
