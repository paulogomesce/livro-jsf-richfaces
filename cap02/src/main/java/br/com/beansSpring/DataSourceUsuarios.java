package br.com.beansSpring;

//@Repository
//@Scope("request")
public class DataSourceUsuarios implements IDataSource{
	
	public void exibirConfiguracao() {
		System.out.println("Exibindo configurações do datasource DataSourceUsuarios");
	}

}
