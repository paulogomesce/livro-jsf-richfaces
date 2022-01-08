package br.com.jsf.presentation;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class ClimaActionListener implements ActionListener{

	@Override
	public void processAction(ActionEvent event) throws AbortProcessingException {
		System.out.println(this.getClass().getName()+": processando... "+event.getComponent().getId());
		
	}	

}
