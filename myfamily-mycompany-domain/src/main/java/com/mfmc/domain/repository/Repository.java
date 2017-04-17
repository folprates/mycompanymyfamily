package com.mfmc.domain.repository;

import java.util.List;

import org.springframework.http.HttpStatus;

public interface Repository<T> {

	List<T> getList() throws Exception;

	HttpStatus addMetodoPagamento(T t);

}
