package br.com.jsf.presentation.managedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.beansSpring.DAOProduto;
import br.com.beansSpring.DAOUsuario;
import br.com.beansSpring.IDataSource;
import br.com.beansSpring.Processador;

@Component(value = "springBean")
@Scope("request")
public class SpringBean {
	
	private String nome;
	
	@Autowired
	private Processador processador;
	
	@Autowired
	private IDataSource dataSource;
	
	@Autowired
	private DAOUsuario daoUsuario;
	
	@Autowired
	private DAOProduto daoProduto;
	
	
	public void testar() {
		System.out.println("Funcionando corretamente!");
		System.out.println(processador.getFonteDados().getArquivo());
		for(String arquivo : processador.getFonteDados().getArquivos()) {
			System.out.println(arquivo);
		}		
	}
	
	public void testarConfiguration() {
		
		dataSource.exibirConfiguracao();
		daoUsuario.gravar();
		daoProduto.gravar();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
