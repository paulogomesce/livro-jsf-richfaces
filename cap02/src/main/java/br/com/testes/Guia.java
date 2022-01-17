package br.com.testes;

public abstract class Guia {
	
	public abstract void dizerOla();
	
	public void dizerOlaSuperClasse() {
		System.out.println("Método da superClasse: Olá, " + this.getClass().getSimpleName());
	}

}
