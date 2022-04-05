package br.com.jsf.presentation.managedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.beansSpring.Processador;

@Component(value = "springBean")
@Scope("session")
public class SpringBean {
	
	private String nome;
	
	@Autowired
	private Processador processador;
	
	
	public void testar() {
		System.out.println("Funcionando corretamente!");
		System.out.println(processador.getFonteDados().getArquivo());
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
