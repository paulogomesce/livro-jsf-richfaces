package br.com.beansSpring;

import org.springframework.stereotype.Repository;

@Repository
public class DAOUsuario {
	
	public void gravar() {
		System.out.println("Gravando " + this.getClass().getSimpleName());
	}

}
