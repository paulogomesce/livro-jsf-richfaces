package br.com.jsf.presentation.managedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.jsf.presentation.modelo.Produto;

@ManagedBean
@SessionScoped
public class AutoCompleteBean implements Serializable {
	
	private static final long serialVersionUID = -830686215145788510L;
	
	private String alimento;
	private List<String> listaAlimentos = new ArrayList<String>();
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	
	
	@PostConstruct
	public void iniciar() {
		listaAlimentos.add("Abacaxi");
		listaAlimentos.add("Abobora");
		listaAlimentos.add("Banana");
		listaAlimentos.add("Batata");
		listaAlimentos.add("Beterraba");
		listaAlimentos.add("Cebola");
		listaAlimentos.add("Cenoura");
		listaAlimentos.add("Cereja");
		listaAlimentos.add("Laranja");
		listaAlimentos.add("Limão");
		listaAlimentos.add("Mação");
		listaAlimentos.add("Morango");
		listaAlimentos.add("Uva");
		
		listaProdutos.add(new Produto("Abacaxi", "Fruta", "abacaxi.jpg"));
		listaProdutos.add(new Produto("Abobora", "Legume", "abobora.jpg"));
		listaProdutos.add(new Produto("Banana", "Fruta", "banana.jpg"));
		listaProdutos.add(new Produto("Batata", "Legume", "batata.jpg"));
		listaProdutos.add(new Produto("Beterraba", "Legume", "beterraba.jpg"));
		listaProdutos.add(new Produto("Cebola", "Legume", "cebola.jpg"));
		listaProdutos.add(new Produto("Cereja", "Fruta", "cereja.jpg"));
		listaProdutos.add(new Produto("Laranja", "Fruta", "laranja.jpg"));
		listaProdutos.add(new Produto("Limão", "Fruta", "limao.jpg"));
		listaProdutos.add(new Produto("Maçã", "Fruta", "maca.jpg"));
		listaProdutos.add(new Produto("Morango", "Fruta", "morango.jpg"));
		listaProdutos.add(new Produto("Uva", "Fruta", "uva.jpg"));
	}
	
	public List<String> montaListaSugestoes(String entrada){
		List<String> listaSugestoes = new ArrayList<String>();
		
		for(String alimento : listaAlimentos) {
			if(alimento.toUpperCase().startsWith(entrada.toUpperCase())) {
				listaSugestoes.add(alimento);
			}
		}
		
		return listaSugestoes;
	}
	
	public List<Produto> montarListaSugestoesProdutos(String entrada){
		List<Produto> listaSugestoes = new ArrayList<Produto>();
		for(Produto produto : listaProdutos) {
			if(produto.getNome().toUpperCase().startsWith(entrada.toUpperCase())) {
				listaSugestoes.add(produto);
			}
		}
		return listaSugestoes;
	}
	
	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public List<String> getListaAlimentos() {
		return listaAlimentos;
	}

	public void setListaAlimentos(List<String> listaAlimentos) {
		this.listaAlimentos = listaAlimentos;
	}
	
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
}
