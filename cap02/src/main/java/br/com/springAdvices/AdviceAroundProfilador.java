package br.com.springAdvices;

import java.util.ArrayList;
import java.util.List;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AdviceAroundProfilador implements MethodInterceptor{
	
	private List<Long> tempos = new ArrayList<Long>();

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.out.println("Executado o advide AROUND.");
		
		Long momentoInicial = System.currentTimeMillis();
		Object resultado = invocation.proceed();
		
		Long tempo = System.currentTimeMillis() - momentoInicial;
		
		getTempos().add(tempo);
		System.out.println("Tempo para executar: " + tempo);	
		
		return resultado;
	}

	public List<Long> getTempos() {
		return tempos;
	}
	
	
	
	

}
