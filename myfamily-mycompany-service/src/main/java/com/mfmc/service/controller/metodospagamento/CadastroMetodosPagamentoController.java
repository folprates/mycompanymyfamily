package com.mfmc.service.controller.metodospagamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mfmc.application.service.metodospagamento.MetodosPagamentoServiceConsulta;
import com.mfmc.application.service.metodospagamento.MetodosPagamentoServiceInclusao;

@RestController
@RequestMapping("/cadastro/metodospagamento")
final class CadastroMetodosPagamentoController {

  @Autowired
  private MetodosPagamentoServiceConsulta metodosPagamentoServiceConsulta;

  @Autowired
  private MetodosPagamentoServiceInclusao metodosPagamentoServiceInclusao;

  @RequestMapping(method = RequestMethod.GET)
  ResponseEntity<?> getMetodosPagamento() {
    return metodosPagamentoServiceConsulta.getMetodosPagamento();
  }

  @RequestMapping(method = RequestMethod.POST)
  ResponseEntity<?> incluirMetodosPagamento(@RequestParam("sigla") String sigla, @RequestParam("descricao") String descricao) {
    return metodosPagamentoServiceInclusao.incluirMetodoPagamento(sigla, descricao);
  }

}
