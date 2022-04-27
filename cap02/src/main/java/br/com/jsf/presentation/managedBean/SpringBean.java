package br.com.jsf.presentation.managedBean;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.beansSpring.DAOProduto;
import br.com.beansSpring.DAOUsuario;
import br.com.beansSpring.IDataSource;
import br.com.beansSpring.Processador;
import br.com.springDao.DAOPessoas;
import br.com.springModel.Pessoa;

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
	
	@Autowired
	private DAOPessoas daoPessoas;
	
	
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
	
	public void testarConfigAOP() throws IOException {
		try {
			Pessoa[] pessoas = {new Pessoa("Paulo"), new Pessoa("Adejanny"), new Pessoa("Felipe")};
			File file = new File("C:\\Users\\paulo.gomes\\teste-aop.txt");	
			daoPessoas.persistir(pessoas, file);
		}catch (Exception e) {
			System.out.println("Ocorreu erro ao gravar dados no arquivo.");
			e.printStackTrace();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
