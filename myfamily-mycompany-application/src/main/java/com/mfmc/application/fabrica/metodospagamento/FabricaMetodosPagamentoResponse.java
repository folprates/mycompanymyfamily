package com.mfmc.application.fabrica.metodospagamento;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mfmc.domain.entity.metodospagamento.MetodoPagamento;

@Service
public class FabricaMetodosPagamentoResponse {

  public ResponseEntity<?> criarParaController(List<MetodoPagamento> metodosPagamento) {
    return ResponseEntity.ok(metodosPagamento);
  }

}
