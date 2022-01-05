package br.com.jsf.presentation.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean
@SessionScoped
public class LoginBean {
	
	private String login;
	private String senha;
	
	FacesContext context = FacesContext.getCurrentInstance();
	HttpSession session  = (HttpSession)context.getExternalContext().getSession(false);;
	
	public String logar() {
		if(login.equals("carlos") && senha.equals("123456")) {
			session.setAttribute("usuario", login);
			return "cadastrar";
		}else {
			return "login";
		}
	}
	
	public String logout() {
		session.removeAttribute(login);
		return "login";
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
