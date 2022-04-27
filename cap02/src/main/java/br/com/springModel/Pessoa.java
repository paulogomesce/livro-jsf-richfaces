package br.com.springModel;

import java.io.Serializable;

import lombok.Data;

@Data
public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = -4316605392703792627L;	
	
	private String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}

}
