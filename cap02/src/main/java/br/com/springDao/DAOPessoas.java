package br.com.springDao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.springModel.Pessoa;

public class DAOPessoas {
	
	public void persistir(Pessoa[] pessoas, File arquivo) throws IOException {
		if(pessoas == null || pessoas.length == 0) {
			throw new IllegalArgumentException("Lista de pessoas nula ou vazia.");
		}
		
		if(arquivo == null) {
			throw new IllegalArgumentException("Arquivo nulo passado como parâmetro.");
		}
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo));
		oos.writeObject(pessoas);
		oos.close();		
	}
	
	public Pessoa[] ler(File arquivo) throws FileNotFoundException, IOException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
		Pessoa[] resultado = null;
		try {
			resultado = (Pessoa[])ois.readObject();
		}catch(ClassNotFoundException ex) {
			throw new IOException("Erro ao lêr o arquivo, ClassNotFoundException", ex);
		}finally {
			ois.close();
		}
		return resultado;		
	}

}
