package br.com.jsf.presentation.managedBean;

import java.io.Serializable;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import br.com.jsf.presentation.modelo.Usuario;

@SessionScoped
@ManagedBean
public class CadastrarUsuario implements Serializable{
	
	private static final long serialVersionUID = 1L;	
	
	public String nome; 
	public String email;
	public String senha;
	public String confirmar;
	public String endereco;	
	private Usuario usuario;
	
	public void cadastrarUsuario(ActionEvent event) {
		this.usuario = new Usuario();
		usuario.setNome(this.nome);
		usuario.setEmail(this.email);
		usuario.setSenha(this.senha);
		usuario.setConfirmar(this.confirmar);
		usuario.setEndereco(this.endereco);
	}
	
	public String idiomaPortugues() {
		Locale local = new Locale("pt");
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(local);
		return null;
	}
	
	public String idiomaEnglish() {
		Locale local = new Locale("en");
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(local);
		return null;
	}
		
	public CadastrarUsuario() {
		System.out.println("Início");
	}
	
	@PostConstruct
	public void criar() {
		System.out.println("Abrir conexão");
	}
	
	@PreDestroy
	public void destruir() {
		System.out.println("Fechar conexão.");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmar() {
		return confirmar;
	}

	public void setConfirmar(String confirmar) {
		this.confirmar = confirmar;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
