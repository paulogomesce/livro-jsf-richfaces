package br.com.springAdvices;

import java.io.File;
import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class AdviceBeforeProfilador implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println("Executado o advide BEFORE.");
		
		if(method.getName().equals("persistir") && args[1] != null) {
			File arquivoAlvo = (File)args[1];
			if(arquivoAlvo.exists()) {
				System.out.println("Before advice: arquivo já existe.");
				args[1] = null;
			}
		}
	}

}
