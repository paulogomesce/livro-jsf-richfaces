package br.com.jsf.resource.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;

@ManagedBean
@RequestScoped
public class TesteBean {
	
	private int valor1;
	private int valor2;
	private int valor3;
	
	public void realizarProcessamento(ComponentSystemEvent vent) {
		FacesContext fc = FacesContext.getCurrentInstance();
		String param1 = fc.getExternalContext().getRequestParameterMap().get("param1");
		String param2 = fc.getExternalContext().getRequestParameterMap().get("param2");
		String param3 = fc.getExternalContext().getRequestParameterMap().get("param3");
		
		valor1 = Integer.parseInt(param1);
		valor2 = Integer.parseInt(param2);
		valor3 = Integer.parseInt(param3);
		
		System.out.println(param1 + param2 + param3);
	}	
	
	public int getValor1() {
		return valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public int getValor3() {
		return valor3;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public void setValor3(int valor3) {
		this.valor3 = valor3;
	}


	
	

}
