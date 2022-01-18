package br.com.jsf.presentation.managedBean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.jsf.presentation.modelo.Cliente;

@ManagedBean
@SessionScoped
public class ValidacaoBean implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private Cliente cliente;
	
	@PostConstruct
	public void init(){
		this.cliente = new Cliente();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void testar() {
		System.out.println("Teste.");
	}
	

}
