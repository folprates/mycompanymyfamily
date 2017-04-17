package com.mfmc.domain.entity.metodospagamento;

public class MetodoPagamento {

	private String sigla;

	private String descricao;

	public MetodoPagamento() {
	}

	public MetodoPagamento(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
