package br.com.beansSpring;

import org.springframework.stereotype.Repository;

@Repository
public class DAOProduto {
	
	public void gravar() {
		System.out.println("Gravando " + this.getClass().getSimpleName());
	}

}
