package br.com.jsf.presentation.managedBean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@SessionScoped
public class SkinBean {
	
	private String nomeSkin = "deepMarine";
	private Date dataAtual;
	private String[] opcoesSkins = {"DEFAULT", "plain", "emeraldTown", "blueSky", "wine", "japanCherry", "ruby", "classic", "deepMarine"};
	
	public void processar() {
		this.dataAtual = new Date();
	}
	
	public void alteraSkin(ValueChangeEvent event) {
		this.nomeSkin = (String)event.getNewValue();
	}
	
	public void testaStatus() {
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getNomeSkin() {
		return nomeSkin;
	}

	public void setNomeSkin(String nomeSkin) {
		this.nomeSkin = nomeSkin;
	}

	public String[] getOpcoesSkins() {
		return opcoesSkins;
	}

	public void setOpcoesSkins(String[] opcoesSkins) {
		this.opcoesSkins = opcoesSkins;
	}

	public Date getDataAtual() {
		return dataAtual;
	}

	public void setDataAtual(Date dataAtual) {
		this.dataAtual = dataAtual;
	}
	
	
	

}
