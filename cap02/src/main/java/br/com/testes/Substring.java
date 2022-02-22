package br.com.testes;

public class Substring {
	public static void main(String[] args) {
		
		String numero = "202232587";
		
		Long ano = Long.parseLong(numero.substring(0, 4));
		Long aut = Long.parseLong(numero.substring(4));
		
		System.out.println(ano);
		System.out.println(aut);
	}

}
