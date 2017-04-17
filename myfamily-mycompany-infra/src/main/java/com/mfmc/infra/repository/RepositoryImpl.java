package com.mfmc.infra.repository;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.mfmc.domain.repository.FirebaseURL;
import com.mfmc.domain.repository.Repository;
import com.mfmc.infra.firebase.JsonHelper;

public abstract class RepositoryImpl<T> implements Repository<T> {

  @Override
  public List<T> getList() throws Exception {
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> response = restTemplate.getForEntity(FirebaseURL.URL, String.class);
    JsonHelper<T> jsonHelper = new JsonHelper<T>();
    return jsonHelper.getListValuesByJson(response.getBody(), getClazz());
  }

  protected abstract Class<T> getClazz();

  @Override
  public HttpStatus addMetodoPagamento(T t) {
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> response = restTemplate.postForEntity(FirebaseURL.URL, t, String.class);
    return response.getStatusCode();
  }

}