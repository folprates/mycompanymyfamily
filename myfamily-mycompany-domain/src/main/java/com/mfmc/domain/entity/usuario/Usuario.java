package com.mfmc.domain.entity.usuario;

import org.springframework.util.StringUtils;

import com.mfmc.domain.exception.ValidationException;
import com.mfmc.domain.helper.DateConverterHelper;
import com.mfmc.domain.helper.MessageBundle;
import com.mfmc.domain.helper.MessageConstantes;

public class Usuario {

  private String primeiroNome;

  private String ultimoNome;

  private String email;

  private String dataNascimento;

  private String primeiroAcesso;

  public Usuario() {
  }

  public Usuario(String primeiroNome, String ultimoNome, String email, String dataNascimento, String primeiroAcesso) {
    setPrimeiroNome(primeiroNome);
    setUltimoNome(ultimoNome);
    setEmail(email);
    setDataNascimento(dataNascimento);
    setPrimeiroAcesso(primeiroAcesso);
  }

  public String getPrimeiroNome() {
    return primeiroNome;
  }

  public void setPrimeiroNome(String primeiroNome) {
    if (StringUtils.isEmpty(primeiroNome)) {
      throw new ValidationException(MessageBundle.getMessages(MessageConstantes.CAMPO_OBRIGATORIO, "primeironome"));
    }
    this.primeiroNome = primeiroNome;
  }

  public String getUltimoNome() {
    return ultimoNome;
  }

  public void setUltimoNome(String ultimoNome) {
    if (StringUtils.isEmpty(ultimoNome)) {
      throw new ValidationException(MessageBundle.getMessages(MessageConstantes.CAMPO_OBRIGATORIO, "ultimonome"));
    }
    this.ultimoNome = ultimoNome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    if (StringUtils.isEmpty(email)) {
      throw new ValidationException(MessageBundle.getMessages(MessageConstantes.CAMPO_OBRIGATORIO, "email"));
    }
    this.email = email;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    if (StringUtils.isEmpty(dataNascimento)) {
      throw new ValidationException(MessageBundle.getMessages(MessageConstantes.CAMPO_OBRIGATORIO, "datanascimento"));
    }

    if (DateConverterHelper.getDate(dataNascimento) == null) {
      throw new ValidationException(MessageBundle.getMessages(MessageConstantes.DATA_NASCIMENTO_INVALIDA));
    }

    this.dataNascimento = dataNascimento;
  }

  public Boolean getPrimeiroAcesso() {
    return Boolean.parseBoolean(primeiroAcesso);
  }

  public void setPrimeiroAcesso(String primeiroAcesso) {
    this.primeiroAcesso = primeiroAcesso;
  }
}
