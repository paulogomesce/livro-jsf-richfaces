package br.com.jsf.presentation.modelo;

import java.io.Serializable;

public class Cidade implements Serializable{

	private static final long serialVersionUID = 461050819069261108L;
	
	private String nome;
	
	public Cidade(String nome) {
		this.nome = nome;
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

}
