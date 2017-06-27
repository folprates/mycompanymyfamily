package com.mfmc.infra.repository;

import java.util.List;
import java.util.function.Predicate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.mfmc.domain.helper.JsonHelper;
import com.mfmc.domain.repository.FirebaseURL;
import com.mfmc.domain.repository.Repository;

public abstract class RepositoryImpl<T> implements Repository<T> {

  protected abstract Class<T> getClazz();

  protected abstract String getPathFireBase();

  @Override
  public List<T> findAll() {
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> response = restTemplate.getForEntity(FirebaseURL.URL.concat(getPathFireBase()), String.class);
    JsonHelper<T> jsonHelper = new JsonHelper<T>();
    return jsonHelper.getListValuesByJson(response.getBody(), getClazz());
  }

  @Override
  public T findOne(Predicate<? super T> predicate) {
    List<T> elements = findAll();
    return elements.stream().filter(predicate).findAny().orElse(null);
  }

  @Override
  public void save(T t) {
    RestTemplate restTemplate = new RestTemplate();
    restTemplate.postForEntity(FirebaseURL.URL.concat(getPathFireBase()), t, String.class);
  }

  @Override
  public void delete(String id) {
    // TODO Auto-generated method stub

  }

  @Override
  public boolean exists(Predicate<? super T> predicate) {
    List<T> elements = findAll();
    return elements.stream().filter(predicate).findAny().isPresent();
  }

}