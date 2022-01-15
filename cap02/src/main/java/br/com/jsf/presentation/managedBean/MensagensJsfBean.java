package br.com.jsf.presentation.managedBean;

import java.text.MessageFormat;
import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class MensagensJsfBean {
	
	public String mostrarMensagens() {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage mensagem1 = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Sumary do Erro!", "Descrição do erro.");
		context.addMessage(null, mensagem1);
		
		ResourceBundle budle = ResourceBundle.getBundle("resource.ApplicationResources", context.getViewRoot().getLocale());
		String msgBundle = budle.getString("mensagem.retornado.budle");
		
		FacesMessage mensagem2 = new FacesMessage(FacesMessage.SEVERITY_WARN, "Mensagem do bundle!", msgBundle);
		context.addMessage(null, mensagem2);
		
		
		String msgComParametro = budle.getString("mensagem.retornado.com.parametro");
		MessageFormat format = new MessageFormat(msgComParametro);
		Object[] parametros = {"<b>Paulo Gomes</b>", "Unimed Poa", 35};
		FacesMessage mensagem3 = new FacesMessage(FacesMessage.SEVERITY_INFO, "Mensagem com parametros!", format.format(parametros));
		
		context.addMessage(null, mensagem3);		
		
		
		return null;
	}

}
