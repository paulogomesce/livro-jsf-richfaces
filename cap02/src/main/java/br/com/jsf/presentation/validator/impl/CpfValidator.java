package br.com.jsf.presentation.validator.impl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import br.com.jsf.presentation.validator.Cpf;

public class CpfValidator implements ConstraintValidator<Cpf, String>{

	@Override
	public void initialize(Cpf arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		return false;
	}

}
