package com.mfmc.application.service.metodospagamento;

import org.springframework.http.ResponseEntity;

public interface MetodosPagamentoServiceInclusao {

  ResponseEntity<?> incluirMetodoPagamento(String sigla, String descricao);
	
}
