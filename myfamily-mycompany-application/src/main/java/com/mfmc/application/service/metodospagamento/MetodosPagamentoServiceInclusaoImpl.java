package com.mfmc.application.service.metodospagamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mfmc.domain.entity.metodospagamento.MetodoPagamento;
import com.mfmc.domain.repository.metodospagamento.MetodosPagamentoRepository;

@Service
public class MetodosPagamentoServiceInclusaoImpl implements MetodosPagamentoServiceInclusao {

  @Autowired
  private MetodosPagamentoRepository metodosPagamentoRepository;

  @Override
  public ResponseEntity<?> incluirMetodoPagamento(String sigla, String descricao) {
    metodosPagamentoRepository.save(new MetodoPagamento(sigla, descricao));
    return ResponseEntity.ok().build();
  }

}
