package br.com.beansSpring;

import java.util.GregorianCalendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public DAOUsuario daoUsuario() {
		return new DAOUsuario();
	}
	
	@Bean(name={"daoProduto", "produtoDao"})
	public DAOProduto criarDAOProduto() {
		return new DAOProduto();
	}
	
	@Bean(name="dataSource")
	public IDataSource getDataSource() {
		System.out.println("Hora: " + GregorianCalendar.HOUR_OF_DAY);
		IDataSource ds = null;
		GregorianCalendar data = new GregorianCalendar();
		if(data.get(GregorianCalendar.HOUR_OF_DAY) < 1) {
			ds = new DataSourceUsuarios();
		}else {
			ds = new DataSource();
		}
		return ds;
	}

}
