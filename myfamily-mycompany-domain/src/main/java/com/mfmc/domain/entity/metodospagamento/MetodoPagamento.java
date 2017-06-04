package com.mfmc.domain.entity.metodospagamento;

import com.mfmc.domain.exception.ValidationException;

public class MetodoPagamento {

  private EnumSiglaMetodoPagamento sigla;

  private String descricao;

  public MetodoPagamento() {
  }

  public MetodoPagamento(String sigla, String descricao) {
    setSigla(EnumSiglaMetodoPagamento.findSigla(sigla));
    setDescricao(descricao);
  }

  public EnumSiglaMetodoPagamento getSigla() {
    return sigla;
  }

  public void setSigla(EnumSiglaMetodoPagamento sigla) {
    if (sigla == null) {
      throw new ValidationException("O campo *sigla* é obrigatório");
    }
    this.sigla = sigla;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    if (descricao == null) {
      throw new ValidationException("O campo *descricao* é obrigatório");
    }
    this.descricao = descricao;
  }

}
