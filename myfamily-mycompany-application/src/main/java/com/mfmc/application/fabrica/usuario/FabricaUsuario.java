package com.mfmc.application.fabrica.usuario;

import org.springframework.stereotype.Component;

import com.mfmc.application.helper.DateConverterHelper;
import com.mfmc.domain.entity.usuario.Usuario;

@Component
public class FabricaUsuario {

  public Usuario criar(String email, String primeiroNome, String ultimoNome, String dataNascimento, String primeiroAcesso) {
    return new Usuario(primeiroNome, ultimoNome, email, DateConverterHelper.getDate(dataNascimento), Boolean.parseBoolean(primeiroAcesso));
  }

}
