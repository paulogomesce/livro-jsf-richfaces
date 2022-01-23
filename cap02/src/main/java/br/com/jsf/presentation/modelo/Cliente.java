package br.com.jsf.presentation.modelo;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Pattern;

import br.com.jsf.presentation.validator.Cpf;

public class Cliente implements Serializable{

	private static final long serialVersionUID = 7795640734668747587L;
	
	
	private int codigo;
	@Pattern(regexp = "[A-Z]{5,60}", message = "{my.message.only.upper}")
	private String nome;
	private String email;
	private String telefone;
	private String status;
	private String endereco;
	@Cpf(message = "CPF inválido.")
	private String cpf;
	private Integer idade;
		
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getStatus() {
		return status;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return codigo == other.codigo;
	}	

}
