package com.mfmc.application.service.metodospagamento;

import org.springframework.http.HttpStatus;

public interface MetodosPagamentoServiceInclusao {

	HttpStatus incluirMetodoPagamento(String sigla, String descricao);
	
}
