package com.mfmc.domain.repository;

import java.util.List;
import java.util.function.Predicate;

public interface Repository<T> {

  List<T> findAll();

  T findOne(Predicate<? super T> predicate);

  void save(T t);

  void delete(String id);

  boolean exists(Predicate<? super T> predicate);

}
