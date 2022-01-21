package br.com.jsf.presentation.validator;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import br.com.jsf.presentation.validator.impl.CpfValidator;

@Target({ FIELD, METHOD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = CpfValidator.class)
public @interface Cpf {
	
	String message() default "{my.message.cpf}";
	String regex() default "[0-9]{3}?\\.[0-9]{3}?\\.[0-9]{3}?\\-[0-9]{2}?";
	
	Class[] groups() default {};
	
	Class <? extends Payload>[] payload() default {};

}
