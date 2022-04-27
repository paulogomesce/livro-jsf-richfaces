package br.com.beansSpring;

//@Repository
//@Scope("request")
public class DataSource implements IDataSource{
	
	public void exibirConfiguracao() {
		System.out.println("Exibindo configurações do datasource DataSource");
	}

}
