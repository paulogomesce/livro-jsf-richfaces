package br.com.beansSpring;

public class Processador {
	
	private FonteDadosArquivo fonteDados;
	private ImpressorImpl impressor;
	
	public FonteDadosArquivo getFonteDados() {
		return fonteDados;
	}
	public void setFonteDados(FonteDadosArquivo fonteDados) {
		this.fonteDados = fonteDados;
	}
	public ImpressorImpl getImpressor() {
		return impressor;
	}
	public void setImpressor(ImpressorImpl impressor) {
		this.impressor = impressor;
	}
	
	

}
