package com.mfmc.domain.repository;

import java.util.List;

public interface Repository<T> {

  List<T> getList();

  void add(T t);

}
