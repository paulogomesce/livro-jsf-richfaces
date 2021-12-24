package br.com.jsf.resource.managedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.jsf.presentation.to.Cliente;

@ManagedBean
@SessionScoped
public class ClienteBean implements Serializable {

	private static final long serialVersionUID = 7706893174382975513L;
	
	private static int codigoSequencial = 0;
	
	private Cliente cliente;
	
	private List<Cliente> listaCliente = new ArrayList<Cliente>();
	private DataModel<Cliente> model;
	
	@PostConstruct
	public void init() {
		this.cliente = new Cliente();
	}
	
	public String novo() {
		this.limparCampos();
		return null;
	}
	
	public String salvar() {
		if( getClienteSafe().getCodigo() == 0) {
			codigoSequencial++;
			this.cliente.setCodigo(codigoSequencial);
			listaCliente.add(cliente);
		}else {
			int indexRegistro = listaCliente.indexOf(cliente);
			listaCliente.add(indexRegistro, cliente);
		}		
		model = new ListDataModel<Cliente>(this.listaCliente);
		this.limparCampos();
		return null;
	}
	
	public String selecionarAlterar() {
		this.cliente = (Cliente)model.getRowData();
		return null;
	}
	
	public void limparCampos() {
		this.cliente = new Cliente();
	}
	
	public String excluir() {
		int index = model.getRowIndex();
		this.listaCliente.remove(index);
		model = new ListDataModel<Cliente>(this.listaCliente);
		return null;
	}
	
	
	public Cliente getClienteSafe() {
		if(this.cliente == null) {
			return new Cliente();
		}
		return this.cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<Cliente> getListaCliente() {
		return listaCliente;
	}

	public DataModel<Cliente> getModel() {
		return model;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	public void setModel(DataModel<Cliente> model) {
		this.model = model;
	}	

}
