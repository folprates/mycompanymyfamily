package com.mfmc.domain.entity.metodospagamento;

public enum EnumSiglaMetodoPagamento {

  CRED, DEB, CHEQ, DEBCONT, DIN, VA, VR, VP, OUT;

  public static EnumSiglaMetodoPagamento findSigla(String sigla) {
    for (EnumSiglaMetodoPagamento siglaMetodoPagamento : EnumSiglaMetodoPagamento.values()) {
      if (siglaMetodoPagamento.toString().equals(sigla)) {
        return siglaMetodoPagamento;
      }
    }
    return null;
  }

}
