package br.com.testes;

public class RunTestes {
	
	
	
	
	public static void main(String[] args) {
		Guia guia;
		guia = new GuiaConsulta();
		
		System.out.println(guia.getClass().getCanonicalName());
		System.out.println(guia.getClass().getName());
		System.out.println(guia.getClass().getSimpleName());
		System.out.println(guia.getClass().getTypeName());
		System.out.println(guia.getClass().getPackage());
		System.out.println(guia.getClass().getSuperclass().getSimpleName());
		System.out.println("---------------------------------------------------");
		guia.dizerOla();
		guia.dizerOlaSuperClasse();		
	}

}
