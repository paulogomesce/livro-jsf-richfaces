package br.com.testes;

public class GuiaInternacao extends Guia{

	@Override
	public void dizerOla() {
		System.out.println("Metodo sobrecarregado: Ol�, " + this.getClass().getSimpleName());
	}

}
