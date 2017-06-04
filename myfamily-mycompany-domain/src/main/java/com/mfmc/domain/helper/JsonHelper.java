package com.mfmc.domain.helper;

import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mfmc.domain.exception.JsonException;

public class JsonHelper<T> {

  @SuppressWarnings("unchecked")
  public List<T> getListValuesByJson(String json, Class<T> clazz) {
    Map<String, T> result = null;
    ObjectMapper mapper = new ObjectMapper();

    try {
      Object o = mapper.readValue(json.trim(), mapper.getTypeFactory().constructMapType(Map.class, String.class, clazz));
      result = (Map<String, T>) o;

    } catch (IOException e) {
      throw new JsonException(e.getMessage(), e);
    }

    if (result == null) {
      result = new LinkedHashMap<>();
    }

    return result.values().stream().collect(toList());
  }

}
