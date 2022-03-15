package br.com.jsf.presentation.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.richfaces.event.FileUploadEvent;
import org.richfaces.model.UploadedFile;

@ManagedBean
@ViewScoped
public class FileUploadBean {

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
