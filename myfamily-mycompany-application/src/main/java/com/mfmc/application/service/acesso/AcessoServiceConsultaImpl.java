package com.mfmc.application.service.acesso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mfmc.domain.entity.responseerror.ResponseEntityError;
import com.mfmc.domain.entity.usuario.Usuario;
import com.mfmc.domain.repository.metodospagamento.UsuarioRepository;

@Service
public class AcessoServiceConsultaImpl implements AcessoServiceConsulta {

  @Autowired
  private UsuarioRepository usuarioRepository;

  @Override
  public ResponseEntity<?> consultarUsuario(String email) {
    Usuario usuario = usuarioRepository.findOne(u -> email.equals(u.getEmail()));
    if (usuario != null) {
      return ResponseEntity.ok(usuario);
    }

    return new ResponseEntityError("Usuário não encontrado.", HttpStatus.NOT_FOUND);
  }

}
