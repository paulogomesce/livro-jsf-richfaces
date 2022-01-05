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

import br.com.jsf.presentation.modelo.Cidade;

@ManagedBean
@SessionScoped
public class InformacoesBean implements Serializable{

	private static final long serialVersionUID = 7538199003345922174L;
	
	private String nome;
	private String email;
	private String sexo;
	private String estado;
	private String cidade;
	
	private List<SelectItem> listaEstados = new ArrayList<SelectItem>();
	private List<Cidade> listaCidades = new ArrayList<Cidade>();
	
	private String[] regioesSelecionadas;
	private String[] lugaresSelecionados;
	
	private boolean maisInformacoes;
	
	private SelectItem[] listaSudes = {
		new SelectItem("ES", "Espirito Santo"),
		new SelectItem("MG", "Minas Gerais"),
		new SelectItem("RJ", "Rio de Janeiro"),
		new SelectItem("SP", "São paulo")
	};	
	
	private SelectItem[] listaSul = {
			new SelectItem("PR", "Paraná"),
			new SelectItem("SC", "Santa Catarina"),
			new SelectItem("RS", "Rio Grande do Sul")
		};
	
	private SelectItem[] listaCentroOeste = {
			new SelectItem("MT", "Mato Grosso"),
			new SelectItem("MS", "Mato Grosso do Sul"),
			new SelectItem("GO", "Goiás"),
			new SelectItem("DF", "Distrito Federal")
		};
	
	private SelectItemGroup listaGrupoSudeste = new SelectItemGroup("SUDESTE", "SUDESTE", false, listaSudes);
	private SelectItemGroup listaGrupoSul = new SelectItemGroup("SUL", "SUL", false, listaSul);
	private SelectItemGroup listaGrupoCentroOeste = new SelectItemGroup("CENTRO OESTE", "CENTRO OESTE", false, listaCentroOeste);
	
	private SelectItem[] listaRegiaoInteresse = {
			listaGrupoSudeste,
			listaGrupoSul,
			listaGrupoCentroOeste
	};
	
	private SelectItem[] listaGastronomia = {
		new SelectItem("Bares", "Bares"),	
		new SelectItem("Restaurantes", "Restaurantes"),	
		new SelectItem("Lanchonetes", "Lanchonetes")	
	};
	
	private SelectItem[] listaLazer = {
			new SelectItem("Praias","Praias"),
			new SelectItem("Piscinas","Piscinas"),
			new SelectItem("Cachoeiras","Cachoeiras"),
			new SelectItem("Parques","Parques")
	};
	
	private SelectItem[] listaNegocios = {
			new SelectItem("Seminários", "Seminários"),
			new SelectItem("Cursos", "Cursos"),
			new SelectItem("Eventos", "Eventos")
	};
	
	
	private SelectItemGroup listaGrupoGastronomia = new SelectItemGroup("GASTRONOMIA", "GASTRONOMIA", false, listaGastronomia);
	private SelectItemGroup listaGrupoLazer = new SelectItemGroup("LAZER", "LAZER", false, listaLazer);
	private SelectItemGroup listaGrupoNegocios = new SelectItemGroup("NEGÓCIOS", "NEGÓCIOS", false, listaNegocios);

	
	private SelectItem[] listaLugaresInteressantes = {
			listaGrupoGastronomia,
			listaGrupoLazer,
			listaGrupoNegocios
	};
	
	public void montarListaDeEstados() {
		this.listaEstados.add(new SelectItem("ES", "Espirito Santo"));
		this.listaEstados.add(new SelectItem("RJ", "Rio de Janeiro"));
		this.listaEstados.add(new SelectItem("SP", "São Paulo"));
	}
	
	@PostConstruct
	public void iniciar() {
		this.montarListaDeEstados();
	}
	
	public void enviar(ActionEvent event) {
		System.out.println("Realizar outras atividades caso necessário.");
	}
	
	public void montarListaCidades(ValueChangeEvent event) {
		String estado = (String)event.getNewValue();
		
		listaCidades.clear();
		
		if(estado.equals("ES")) {
			listaCidades.add(new Cidade("Vitória"));
			listaCidades.add(new Cidade("Vila Velha"));
			listaCidades.add(new Cidade("Serra"));
		}
		
		if(estado.equals("RJ")) {
			listaCidades.add(new Cidade("Rio de Janeiro"));
			listaCidades.add(new Cidade("Niteroi"));
			listaCidades.add(new Cidade("Petrópolis"));
		}
		
		if(estado.equals("SP")) {
			listaCidades.add(new Cidade("São Paulo"));
			listaCidades.add(new Cidade("Campinas"));
			listaCidades.add(new Cidade("Guarulhos"));
		}
		
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSexo() {
		return sexo;
	}

	public String getEstado() {
		return estado;
	}

	public String getCidade() {
		return cidade;
	}

	public List<SelectItem> getListaEstados() {
		return listaEstados;
	}

	public List<Cidade> getListaCidades() {
		return listaCidades;
	}

	public String[] getRegioesSelecionadas() {
		return regioesSelecionadas;
	}

	public String[] getLugaresSelecionados() {
		return lugaresSelecionados;
	}

	public boolean isMaisInformacoes() {
		return maisInformacoes;
	}

	public SelectItem[] getListaSudes() {
		return listaSudes;
	}

	public SelectItem[] getListaSul() {
		return listaSul;
	}

	public SelectItem[] getListaCentroOeste() {
		return listaCentroOeste;
	}

	public SelectItemGroup getListaGrupoSudeste() {
		return listaGrupoSudeste;
	}

	public SelectItemGroup getListaGrupoSul() {
		return listaGrupoSul;
	}

	public SelectItemGroup getListaGrupoCentroOeste() {
		return listaGrupoCentroOeste;
	}

	public SelectItem[] getListaRegiaoInteresse() {
		return listaRegiaoInteresse;
	}

	public SelectItem[] getListaGastronomia() {
		return listaGastronomia;
	}

	public SelectItem[] getListaLazer() {
		return listaLazer;
	}

	public SelectItem[] getListaNegocios() {
		return listaNegocios;
	}

	public SelectItemGroup getListaGrupoGastronomia() {
		return listaGrupoGastronomia;
	}

	public SelectItemGroup getListaGrupoLazer() {
		return listaGrupoLazer;
	}

	public SelectItemGroup getListaGrupoNegocios() {
		return listaGrupoNegocios;
	}

	public SelectItem[] getListaLugaresInteressantes() {
		return listaLugaresInteressantes;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setListaEstados(List<SelectItem> listaEstados) {
		this.listaEstados = listaEstados;
	}

	public void setListaCidades(List<Cidade> listaCidades) {
		this.listaCidades = listaCidades;
	}

	public void setRegioesSelecionadas(String[] regioesSelecionadas) {
		this.regioesSelecionadas = regioesSelecionadas;
	}

	public void setLugaresSelecionados(String[] lugaresSelecionados) {
		this.lugaresSelecionados = lugaresSelecionados;
	}

	public void setMaisInformacoes(boolean maisInformacoes) {
		this.maisInformacoes = maisInformacoes;
	}

	public void setListaSudes(SelectItem[] listaSudes) {
		this.listaSudes = listaSudes;
	}

	public void setListaSul(SelectItem[] listaSul) {
		this.listaSul = listaSul;
	}

	public void setListaCentroOeste(SelectItem[] listaCentroOeste) {
		this.listaCentroOeste = listaCentroOeste;
	}

	public void setListaGrupoSudeste(SelectItemGroup listaGrupoSudeste) {
		this.listaGrupoSudeste = listaGrupoSudeste;
	}

	public void setListaGrupoSul(SelectItemGroup listaGrupoSul) {
		this.listaGrupoSul = listaGrupoSul;
	}

	public void setListaGrupoCentroOeste(SelectItemGroup listaGrupoCentroOeste) {
		this.listaGrupoCentroOeste = listaGrupoCentroOeste;
	}

	public void setListaRegiaoInteresse(SelectItem[] listaRegiaoInteresse) {
		this.listaRegiaoInteresse = listaRegiaoInteresse;
	}

	public void setListaGastronomia(SelectItem[] listaGastronomia) {
		this.listaGastronomia = listaGastronomia;
	}

	public void setListaLazer(SelectItem[] listaLazer) {
		this.listaLazer = listaLazer;
	}

	public void setListaNegocios(SelectItem[] listaNegocios) {
		this.listaNegocios = listaNegocios;
	}

	public void setListaGrupoGastronomia(SelectItemGroup listaGrupoGastronomia) {
		this.listaGrupoGastronomia = listaGrupoGastronomia;
	}

	public void setListaGrupoLazer(SelectItemGroup listaGrupoLazer) {
		this.listaGrupoLazer = listaGrupoLazer;
	}

	public void setListaGrupoNegocios(SelectItemGroup listaGrupoNegocios) {
		this.listaGrupoNegocios = listaGrupoNegocios;
	}

	public void setListaLugaresInteressantes(SelectItem[] listaLugaresInteressantes) {
		this.listaLugaresInteressantes = listaLugaresInteressantes;
	}
	
	
	

}
