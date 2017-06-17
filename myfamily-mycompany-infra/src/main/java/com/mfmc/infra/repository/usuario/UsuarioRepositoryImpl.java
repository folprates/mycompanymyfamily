package com.mfmc.infra.repository.usuario;

import org.springframework.stereotype.Repository;

import com.mfmc.domain.entity.usuario.Usuario;
import com.mfmc.domain.repository.metodospagamento.UsuarioRepository;
import com.mfmc.infra.repository.RepositoryImpl;

@Repository
public class UsuarioRepositoryImpl extends RepositoryImpl<Usuario> implements UsuarioRepository {

  private static final String pathFireBase = "usuarios.json";
  
  @Override
  protected Class<Usuario> getClazz() {
    return Usuario.class;
  }

  @Override
  protected String getPathFireBase() {
    return pathFireBase;
  }
  
}
