package br.com.jsf.presentation.managedBean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.validator.ValidatorException;

import br.com.jsf.presentation.modelo.Cliente;

@ManagedBean
@SessionScoped
public class ValidacaoBean implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private Cliente cliente;
	private String confirmacaoSenha;
	
	
	@PostConstruct
	public void init(){
		this.cliente = new Cliente();		
	}
	
	public void validaIdade(FacesContext context, UIComponent component, Object valor) {
		Integer idade = (Integer)valor;
		if(idade < 18) {
			FacesMessage mensagem = new FacesMessage();
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			mensagem.setDetail("Cadastro não permitido para menores de 18 anos.");
			throw new ValidatorException(mensagem);
		}		
	}
	
	public void validaSenha(ComponentSystemEvent event) {
		UIComponent componentes = event.getComponent();
		UIInput campoSenha 		 = (UIInput)componentes.findComponent("senha");
		UIInput senhaConfirmacao = (UIInput)componentes.findComponent("confirmacaoSenha");
		
		String senha     = campoSenha.getValue().toString();
		String confirmar = senhaConfirmacao.getValue().toString();
		FacesContext context = FacesContext.getCurrentInstance();
		
		if (!senha.equals(confirmar)) {
			FacesMessage mensagem = new FacesMessage();
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			mensagem.setDetail("As duas senhas não são iguais.");
			context.addMessage(null, mensagem);
			context.renderResponse();
		}
	
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

	public String getConfirmacaoSenha() {
		return confirmacaoSenha;
	}

	public void setConfirmacaoSenha(String confirmacaoSenha) {
		this.confirmacaoSenha = confirmacaoSenha;
	}
	

}
