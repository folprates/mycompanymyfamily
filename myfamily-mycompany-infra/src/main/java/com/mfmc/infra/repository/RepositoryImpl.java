package com.mfmc.infra.repository;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.mfmc.domain.helper.JsonHelper;
import com.mfmc.domain.repository.FirebaseURL;
import com.mfmc.domain.repository.Repository;

public abstract class RepositoryImpl<T> implements Repository<T> {

  protected abstract Class<T> getClazz();

  @Override
  public List<T> getList() {
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> response = restTemplate.getForEntity(FirebaseURL.URL, String.class);
    JsonHelper<T> jsonHelper = new JsonHelper<T>();
    return jsonHelper.getListValuesByJson(response.getBody(), getClazz());
  }

  @Override
  public void add(T t) {
    RestTemplate restTemplate = new RestTemplate();
    restTemplate.postForEntity(FirebaseURL.URL, t, String.class);
  }

}