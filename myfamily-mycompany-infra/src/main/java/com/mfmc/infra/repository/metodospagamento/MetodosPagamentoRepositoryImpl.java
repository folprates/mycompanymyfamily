package com.mfmc.infra.repository.metodospagamento;

import org.springframework.stereotype.Repository;

import com.mfmc.domain.entity.metodospagamento.MetodoPagamento;
import com.mfmc.domain.repository.metodospagamento.MetodosPagamentoRepository;
import com.mfmc.infra.repository.RepositoryImpl;

@Repository
public class MetodosPagamentoRepositoryImpl extends RepositoryImpl<MetodoPagamento> implements MetodosPagamentoRepository {

  private static final String pathFireBase = "cadastro/metodospagamento.json";

  @Override
  protected Class<MetodoPagamento> getClazz() {
    return MetodoPagamento.class;
  }

  @Override
  protected String getPathFireBase() {
    return pathFireBase;
  }

}
