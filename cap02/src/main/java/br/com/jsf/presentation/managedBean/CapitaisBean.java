package br.com.jsf.presentation.managedBean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CapitaisBean {
	
	private String capital = "Vit�ria - Espirito Santo";
	private int zoom = 5;
	
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public int getZoom() {
		return zoom;
	}
	public void setZoom(int zoom) {
		this.zoom = zoom;
	}
	
	

}
