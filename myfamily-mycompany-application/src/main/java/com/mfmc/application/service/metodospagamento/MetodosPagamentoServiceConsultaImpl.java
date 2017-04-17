package com.mfmc.application.service.metodospagamento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfmc.domain.entity.metodospagamento.MetodoPagamento;
import com.mfmc.domain.repository.metodospagamento.MetodosPagamentoRepository;

@Service
public class MetodosPagamentoServiceConsultaImpl implements MetodosPagamentoServiceConsulta {

  @Autowired
  private MetodosPagamentoRepository metodosPagamentoRepository;

  @Override
  public List<MetodoPagamento> getMetodosPagamento() {
    try {
      return metodosPagamentoRepository.getList();
    } catch (Exception e) {
      return null;
    }
  }

}
