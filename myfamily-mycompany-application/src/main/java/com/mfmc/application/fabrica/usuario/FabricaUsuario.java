package com.mfmc.application.fabrica.usuario;

import org.springframework.stereotype.Service;

import com.mfmc.domain.entity.usuario.Usuario;

@Service
public class FabricaUsuario {

  public Usuario criar(String email, String primeiroNome, String ultimoNome, String dataNascimento, String primeiroAcesso) {
    return new Usuario(primeiroNome, ultimoNome, email, dataNascimento, primeiroAcesso);
  }

}
