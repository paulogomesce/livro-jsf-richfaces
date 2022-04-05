package br.com.jsf.presentation.managedBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import org.richfaces.event.FileUploadEvent;
import org.richfaces.model.UploadedFile;

import br.com.jsf.presentation.modelo.Arquivo;

@ManagedBean
@ViewScoped
public class FileUploadBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Arquivo> listaArquivos = new ArrayList<Arquivo>();
	private DataModel<Arquivo> model;
	
	public void listener(FileUploadEvent event) {
		UploadedFile item = event.getUploadedFile();
		
		String nomeArquivo[] = item.getName().split("\\\\");
		
		Arquivo arquivo = new Arquivo();
		
		arquivo.setNome(nomeArquivo[nomeArquivo.length-1]);
		arquivo.setContentType(item.getContentType());
		arquivo.setTamanho(item.getSize());
		arquivo.setArquivo(item.getData());
		this.listaArquivos.add(arquivo);
		this.model = new ListDataModel<Arquivo>(this.listaArquivos);
	}	

	public void uploadArquivo(FileUploadEvent event) {
		UploadedFile item = event.getUploadedFile();
		
		System.out.println(item.getName());
		System.out.println(item.getSize());
		System.out.println(item.getContentType());
		System.out.println(item.getFileExtension());
		byte[] file = item.getData();
		System.out.println(file);		
	}
	
}
