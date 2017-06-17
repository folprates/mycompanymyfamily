package com.mfmc.domain.entity.metodospagamento;

import org.springframework.util.StringUtils;

import com.mfmc.domain.exception.ValidationException;
import com.mfmc.domain.helper.MessageBundle;
import com.mfmc.domain.helper.MessageConstantes;

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
    if (StringUtils.isEmpty(sigla)) {
      throw new ValidationException(MessageBundle.getMessages(MessageConstantes.CAMPO_OBRIGATORIO, "Sigla"));
    }
    this.sigla = sigla;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    if (StringUtils.isEmpty(descricao)) {
      throw new ValidationException(MessageBundle.getMessages(MessageConstantes.CAMPO_OBRIGATORIO, "Descricao"));
    }
    this.descricao = descricao;
  }

}
