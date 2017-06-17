package com.mfmc.domain.entity.usuario;

import java.util.Date;

import org.springframework.util.StringUtils;

import com.mfmc.domain.exception.ValidationException;
import com.mfmc.domain.helper.MessageBundle;
import com.mfmc.domain.helper.MessageConstantes;

public class Usuario {

  private String primeiroNome;

  private String ultimoNome;

  private String email;

  private Date dataNascimento;

  private Boolean primeiroAcesso;

  public Usuario(String primeiroNome, String ultimoNome, String email, Date dataNascimento, Boolean primeiroAcesso) {
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
      throw new ValidationException(MessageBundle.getMessages(MessageConstantes.CAMPO_OBRIGATORIO, "Primeiro Nome"));
    }
    this.primeiroNome = primeiroNome;
  }

  public String getSegundoNome() {
    return ultimoNome;
  }

  public void setUltimoNome(String ultimoNome) {
    if (StringUtils.isEmpty(ultimoNome)) {
      throw new ValidationException(MessageBundle.getMessages(MessageConstantes.CAMPO_OBRIGATORIO, "Último Nome"));
    }
    this.ultimoNome = ultimoNome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    if (StringUtils.isEmpty(email)) {
      throw new ValidationException(MessageBundle.getMessages(MessageConstantes.CAMPO_OBRIGATORIO, "Email"));
    }
    this.email = email;
  }

  public Date getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(Date dataNascimento) {
    if (StringUtils.isEmpty(dataNascimento)) {
      throw new ValidationException(MessageBundle.getMessages(MessageConstantes.CAMPO_OBRIGATORIO, "Data de Nascimento"));
    }
    this.dataNascimento = dataNascimento;
  }

  public Boolean getPrimeiroAcesso() {
    return primeiroAcesso;
  }

  public void setPrimeiroAcesso(Boolean primeiroAcesso) {
    this.primeiroAcesso = primeiroAcesso;
  }
}
