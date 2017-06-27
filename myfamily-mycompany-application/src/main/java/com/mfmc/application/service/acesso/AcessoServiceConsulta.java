package com.mfmc.application.service.acesso;

import org.springframework.http.ResponseEntity;

public interface AcessoServiceConsulta {

  ResponseEntity<?> consultarUsuario(String email);

}
