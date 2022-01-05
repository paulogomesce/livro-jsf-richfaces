package br.com.jsf.presentation.managedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

@ManagedBean
@SessionScoped
public class CarroBean implements Serializable{

	private static final long serialVersionUID = -5690460272876631649L;
	
	private final int valorInicial 		= 50000;
	private double valorFinal 			= 0;
	private String corSelecionada 		= "Cinza";
	private int[] opcionaisSelecionados;
	private String detalhesOpcoes 		= "";
	private List<SelectItem> listaCores 	 	 = new ArrayList<SelectItem>();
	private List<SelectItem> listaItensOpcionais = new ArrayList<SelectItem>();
	
	private SelectItem[] estadosNordeste;
	private SelectItem[] estadosSudeste;	
	private SelectItemGroup grupoNordeste = null;
	private SelectItemGroup grupoSudeste = null;	
	private List<SelectItemGroup> regioes = new ArrayList<SelectItemGroup>();
	private List<String> estadosSelecionados = new ArrayList<String>();
	
	
	public void selecionarOpcionais(ValueChangeEvent event) {
		int[] valores = (int[])event.getNewValue();
		this.valorFinal = valorInicial + (2000 * valores.length);
	}
	
	public void comprar(ActionEvent event) {
		for(int codigoOpcao : opcionaisSelecionados) {
			detalhesOpcoes += "[ ";
			for (SelectItem opcoes : listaItensOpcionais) {
				if((Integer)opcoes.getValue() == codigoOpcao) {
					detalhesOpcoes += " " + opcoes.getLabel();
				}
			}
		}
		detalhesOpcoes += " ]";
	}
	
	@PostConstruct
	public void criar() {
		this.valorFinal = this.valorInicial;
		this.montarListaCores();
		this.montarListaItensOpcionais();
		
		estadosNordeste = new SelectItem[4]; 
		
		estadosNordeste[0] = new SelectItem("CE", "Ceará");
		estadosNordeste[1] = new SelectItem("BA", "Bahia");
		estadosNordeste[2] = new SelectItem("PE", "Pernanbuco");
		estadosNordeste[3] = new SelectItem("RE", "Recife");
		
		estadosSudeste = new SelectItem[4];
		
		estadosSudeste[0] = new SelectItem("SP", "São Paulo");
		estadosSudeste[1] = new SelectItem("RJ", "Rio de Janeiro");
		estadosSudeste[2] = new SelectItem("MG", "Minas Gerais");
		estadosSudeste[3] = new SelectItem("ES", "Espirito Santo");
		
		grupoNordeste = new SelectItemGroup("NORDESTE","NORDESTE", false, estadosNordeste);
		grupoSudeste  = new SelectItemGroup("SUDESTE", "SUDESTE", false, estadosSudeste);
		
		regioes.add(grupoNordeste);
		regioes.add(grupoSudeste);
	}
	
	public void montarListaCores() {
		this.listaCores.add(new SelectItem("Branco", "Branco"));
		this.listaCores.add(new SelectItem("Preto", "Preto"));
		this.listaCores.add(new SelectItem("Cinza", "Cinza"));
	}
	
	public void montarListaItensOpcionais() {
		this.listaItensOpcionais.add(new SelectItem(1, "Ar-condicionado"));
		this.listaItensOpcionais.add(new SelectItem(2, "Direção Elétrica"));
		this.listaItensOpcionais.add(new SelectItem(3, "Bancos de Couro"));
		this.listaItensOpcionais.add(new SelectItem(4, "Freios ABS"));
		this.listaItensOpcionais.add(new SelectItem(5, "Airbags"));
		this.listaItensOpcionais.add(new SelectItem(6, "Computador de Bordo"));
		this.listaItensOpcionais.add(new SelectItem(7, "Teto Solar"));		
	}

	public double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}

	public String getCorSelecionada() {
		return corSelecionada;
	}

	public void setCorSelecionada(String corSelecionada) {
		this.corSelecionada = corSelecionada;
	}

	public int[] getOpcionaisSelecionados() {
		return opcionaisSelecionados;
	}

	public void setOpcionaisSelecionados(int[] opcionaisSelecionados) {
		this.opcionaisSelecionados = opcionaisSelecionados;
	}

	public String getDetalhesOpcoes() {
		return detalhesOpcoes;
	}

	public void setDetalhesOpcoes(String detalhesOpcoes) {
		this.detalhesOpcoes = detalhesOpcoes;
	}

	public List<SelectItem> getListaCores() {
		return listaCores;
	}

	public void setListaCores(List<SelectItem> listaCores) {
		this.listaCores = listaCores;
	}

	public List<SelectItem> getListaItensOpcionais() {
		return listaItensOpcionais;
	}

	public void setListaItensOpcionais(List<SelectItem> listaItensOpcionais) {
		this.listaItensOpcionais = listaItensOpcionais;
	}

	public int getValorInicial() {
		return valorInicial;
	}

	public List<SelectItemGroup> getRegioes() {
		return regioes;
	}

	public void setRegioes(List<SelectItemGroup> regioes) {
		this.regioes = regioes;
	}

	public List<String> getEstadosSelecionados() {
		return estadosSelecionados;
	}

	public void setEstadosSelecionados(List<String> estadosSelecionados) {
		this.estadosSelecionados = estadosSelecionados;
	}

	
	
	

}
