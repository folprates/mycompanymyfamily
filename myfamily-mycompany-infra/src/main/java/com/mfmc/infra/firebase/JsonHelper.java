package com.mfmc.infra.firebase;

import static java.util.stream.Collectors.toList;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonHelper<T> {

  @SuppressWarnings("unchecked")
  public List<T> getListValuesByJson(String json, Class<T> clazz) throws Exception {
    Map<String, T> result = null;
    ObjectMapper mapper = new ObjectMapper();

    Object o = mapper.readValue(json.trim(), mapper.getTypeFactory().constructMapType(Map.class, String.class, clazz));

    if (o instanceof Map) {
      result = (Map<String, T>) o;
    }

    if (result == null) {
      result = new LinkedHashMap<>();
    }

    return result.values().stream().collect(toList());
  }

}
