package br.com.jsf.presentation.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@SessionScoped
public class TempoBean {

	private String codigoCapital = "84";
	private String skin = "";
	
	private SelectItem[] listaSudeste = {
		new SelectItem("107","Bele Horizonte - MG"),
		new SelectItem("84","Vitória - ES"),
		new SelectItem("9979","Rio de Janeiro - RJ"),
		new SelectItem("558","São Paulo - SP")
	};
	
	private SelectItem[] skins = {
			new SelectItem("&SKIN=padrao","Padrão"),
			new SelectItem("&SKIN=azul","Azul"),
			new SelectItem("&SKIN=verde","Verde"),
			new SelectItem("&SKIN=laranja","Laranja"),
			new SelectItem("&SKIN=preto","Preto")
	};
	
	public String mostrarClima() {
		System.out.println("Executa alguma action...");
		return null;
	}

	public String getCodigoCapital() {
		return codigoCapital;
	}

	public void setCodigoCapital(String codigoCapital) {
		this.codigoCapital = codigoCapital;
	}

	public String getSkin() {
		return skin;
	}

	public void setSkin(String skin) {
		this.skin = skin;
	}

	public SelectItem[] getListaSudeste() {
		return listaSudeste;
	}

	public void setListaSudeste(SelectItem[] listaSudeste) {
		this.listaSudeste = listaSudeste;
	}

	public SelectItem[] getSkins() {
		return skins;
	}

	public void setSkins(SelectItem[] skins) {
		this.skins = skins;
	}
	
		
	
}
