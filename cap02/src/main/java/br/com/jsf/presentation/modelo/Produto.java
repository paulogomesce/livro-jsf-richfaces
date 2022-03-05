package br.com.jsf.presentation.modelo;

import java.io.Serializable;

public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String tipo;
	private String imagem;
	
	public Produto(String nome, String tipo, String imagem) {
		this.nome = nome;
		this.tipo = tipo;
		this.imagem = imagem;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

}
