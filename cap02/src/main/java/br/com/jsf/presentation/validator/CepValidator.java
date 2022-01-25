package br.com.jsf.presentation.validator;

import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator
public class CepValidator implements Validator{
	
	private final String REGEX_CEP = "[0-9]{5}-[0-9]{3}";

	@Override
	public void validate(FacesContext context, UIComponent component, Object valor) throws ValidatorException {
		Pattern p = Pattern.compile(REGEX_CEP);
		Matcher m = p.matcher(valor.toString());
		if(!m.matches()) {
			ResourceBundle budle = ResourceBundle.getBundle("resource.ApplicationResources", context.getViewRoot().getLocale());
			String msg = budle.getString("message.cep.erro");
			FacesMessage message = new FacesMessage(msg);
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(message);
		}
	}

}
