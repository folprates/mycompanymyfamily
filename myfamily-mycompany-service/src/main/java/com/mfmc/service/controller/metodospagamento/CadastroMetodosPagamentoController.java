package com.mfmc.service.controller.metodospagamento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mfmc.application.service.metodospagamento.MetodosPagamentoServiceConsulta;
import com.mfmc.application.service.metodospagamento.MetodosPagamentoServiceInclusao;
import com.mfmc.domain.entity.metodospagamento.MetodoPagamento;

@RestController
@RequestMapping("/cadastro/metodospagamento")
final class CadastroMetodosPagamentoController {

  @Autowired
  private MetodosPagamentoServiceConsulta metodosPagamentoServiceConsulta;

  @Autowired
  private MetodosPagamentoServiceInclusao metodosPagamentoServiceInclusao;

  @RequestMapping(method = RequestMethod.GET)
  List<MetodoPagamento> getMetodosPagamento() {
    return metodosPagamentoServiceConsulta.getMetodosPagamento();
  }

  @RequestMapping(method = RequestMethod.POST)
  HttpStatus incluirMetodosPagamento(@RequestParam("sigla") String sigla, @RequestParam("descricao") String descricao) {
    return metodosPagamentoServiceInclusao.incluirMetodoPagamento(sigla, descricao);
  }

}
