package com.mfmc.application.service.acesso;

import org.springframework.http.ResponseEntity;

public interface AcessoServiceCriacao {

  ResponseEntity<?> criarUsuario(String email, String primeiroNome, String ultimoNome, String dataNascimento, String primeiroAcesso);

}
