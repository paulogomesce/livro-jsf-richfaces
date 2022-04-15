package br.com.beansSpring;

import org.springframework.beans.factory.DisposableBean;

public class Processador /* implements InitializingBean */ implements DisposableBean{
	
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
	
	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("Método executado na inicialização do bean. Implementado a interface InitializingBean."); }
	 */
	
	public void metodoDeInicializacao() {
		System.out.println("Método executado na inicialização do bean configurado no xml.");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Método executado após a destruição do objeto. Implementado a classe DisposableBean");	
	}
	

}
