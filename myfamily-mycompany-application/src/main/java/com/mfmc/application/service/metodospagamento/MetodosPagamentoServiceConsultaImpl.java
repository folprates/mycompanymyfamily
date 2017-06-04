package com.mfmc.application.service.metodospagamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mfmc.application.fabrica.metodospagamento.FabricaMetodosPagamento;
import com.mfmc.domain.repository.metodospagamento.MetodosPagamentoRepository;

@Service
public class MetodosPagamentoServiceConsultaImpl implements MetodosPagamentoServiceConsulta {

  @Autowired
  private MetodosPagamentoRepository metodosPagamentoRepository;

  @Autowired
  private FabricaMetodosPagamento fabricaMetodosPagamento;

  @Override
  public ResponseEntity<?> getMetodosPagamento() {
    return fabricaMetodosPagamento.criarParaController(metodosPagamentoRepository.getList());
  }

}
