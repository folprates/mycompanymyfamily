package com.mfmc.service.controller.acesso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mfmc.application.service.acesso.AcessoServiceCriacao;

@RestController
@RequestMapping("/acesso")
public class AcessoController {

  @Autowired
  private AcessoServiceCriacao acessoServiceCriacao;

  @RequestMapping(method = RequestMethod.POST, path = "/criar")
  ResponseEntity<?> criarUsuario(@RequestParam("email") String email, @RequestParam("primeironome") String primeiroNome, @RequestParam("ultimonome") String ultimoNome, @RequestParam("datanascimento") String dataNascimento, @RequestParam("primeiroacesso") String primeiroAcesso) {
    return acessoServiceCriacao.criarUsuario(email, primeiroNome, ultimoNome, dataNascimento, primeiroAcesso);
  }

}