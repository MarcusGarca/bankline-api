package com.dio.santander.bankline.api.dto;

public class NovoCorrentista {
	private String nome;
	private String cpf;

	/**
	 * Gettrs and Settrs da Classe NovoCorrentista
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
