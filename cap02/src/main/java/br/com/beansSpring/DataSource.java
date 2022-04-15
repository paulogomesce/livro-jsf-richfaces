package br.com.beansSpring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("request")
public class DataSource implements IDataSource{
	
	public void exibirConfiguracao() {
		System.out.println("Exibindo configurações do datasource DataSource");
	}

}
