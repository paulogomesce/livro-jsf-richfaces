package br.com.testes;

public abstract class Guia {
	
	public abstract void dizerOla();
	
	public void dizerOlaSuperClasse() {
		System.out.println("M�todo da superClasse: Ol�, " + this.getClass().getSimpleName());
	}

}
