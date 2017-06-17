package com.mfmc.application.service.acesso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mfmc.application.fabrica.usuario.FabricaUsuario;
import com.mfmc.domain.repository.metodospagamento.UsuarioRepository;

@Service
public class AcessoServiceCriacaoImpl implements AcessoServiceCriacao {

  @Autowired
  private UsuarioRepository usuarioRepository;

  @Autowired
  private FabricaUsuario fabricaUsuario;
  
  @Override
  public ResponseEntity<?> criarUsuario(String email, String primeiroNome, String ultimoNome, String dataNascimento, String primeiroAcesso) {
    usuarioRepository.add(fabricaUsuario.criar(email, primeiroNome, ultimoNome, dataNascimento, primeiroAcesso));
    return ResponseEntity.ok().build();
  }

}
