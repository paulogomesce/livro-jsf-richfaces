package br.com.jsf.presentation.managedBean;

import java.awt.MenuBar;
import java.io.Serializable;

import javax.el.MethodExpression;
import javax.el.ValueExpression;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;

import org.richfaces.component.UICommandLink;
import org.richfaces.component.UIToolbar;
import org.richfaces.component.UIToolbarGroup;
@ManagedBean
@SessionScoped
public class ToolbarBean implements Serializable{

	

	public void setMenuBar(UIToolbar menuBar) {
		this.menuBar = menuBar;
	}
	private static final long serialVersionUID = 1L;

	private UIToolbar menuBar;
	private String textoPesquisa;
	
	public void salvar() {
		System.out.println("Método Salvar...");
	}
	public void abrir() {
		System.out.println("Método Abrir...");
	}
	public void mostrarGrafico() {
		System.out.println("Método Mostrar Gráfico...");
	}
	public void exportarRelatorio() {
		System.out.println("Método exportar relatório...");
	}
	public void pesquisar() {
		System.out.println("Método Pesquisar...");
	}
	
	public UIToolbar getMenuBar() {
		
		FacesContext ctx = FacesContext.getCurrentInstance();
		
		//Cria o Toolbar
		menuBar = this.newUIToolbar(ctx, "toolbar");
		menuBar.setItemSeparator("line");
		
		//Cria os grupos da barra de ferramenta
		UIToolbarGroup toolGroup1 = this.newUIToolbarGroup(ctx, "tg1");
		UIToolbarGroup toolGroup2 = this.newUIToolbarGroup(ctx, "tg2");
		UIToolbarGroup toolGroup3 = this.newUIToolbarGroup(ctx, "tg3");
		
		
		//Cria e adiciona o botão Salvar
		UICommandLink bt_salvar = this.newUICommandLink(ctx, "bt_salvar");
		bt_salvar.setActionExpression(newMethodExpression(ctx, "#{toolbarBean.salvar}"));
		bt_salvar.getChildren().add(newHtmlGraphicImage(ctx, "icone_salvar", "/resources/imagens/ico_salvar.png"));
		
		//Cria e adiciona o botão
		UICommandLink bt_abrir = this.newUICommandLink(ctx, "bt_abrir");
		bt_abrir.setActionExpression(this.newMethodExpression(ctx, "#{toolbarBean.abrir}"));
		bt_abrir.getChildren().add(newHtmlGraphicImage(ctx, "icone_abrir", "/resources/imagens/ico_abrir.png"));
		
		
		//Adiciona os botões
		toolGroup1.getChildren().add(bt_salvar);
		toolGroup1.getChildren().add(bt_abrir);
		
		//Cria e adiciona o botão gráfico
		UICommandLink bt_grafico = this.newUICommandLink(ctx, "bt_grafico");
		bt_grafico.setActionExpression(newMethodExpression(ctx, "#{toolbarBean.mostrarGrafico}"));
		bt_grafico.getChildren().add(this.newHtmlGraphicImage(ctx, "icone_grafico", "/resources/imagens/ico_grafico.png"));
		
		toolGroup2.setItemSeparator("square");
		toolGroup2.getChildren().add(bt_grafico);
		
		
		menuBar.getChildren().add(toolGroup1);
		menuBar.getChildren().add(toolGroup2);
		menuBar.getChildren().add(toolGroup3);		
		
		return menuBar;
		
	}
	
	public void setUIToolbar(UIToolbar menuBar) {
		this.menuBar = menuBar;
	}
	
	
	private UIToolbar newUIToolbar(FacesContext ctx, String id) {
		UIToolbar toolbar = (UIToolbar)ctx.getApplication().createComponent(ctx, UIToolbar.COMPONENT_TYPE, "org.richfaces.component.ToolbarRenderer");
		toolbar.setId(id);
		return toolbar;
	}
	
	private UIToolbarGroup newUIToolbarGroup(FacesContext ctx, String id) {
		UIToolbarGroup tGroup = (UIToolbarGroup)ctx.getApplication()
				.createComponent(ctx, UIToolbarGroup.COMPONENT_TYPE, "org.richfaces.component.UIToolbarGroup");
		tGroup.setId(id);
		return tGroup;
	}
	
	private UICommandLink newUICommandLink(FacesContext ctx, String id) {
		UICommandLink commandLink = (UICommandLink)ctx.getApplication()
				.createComponent(ctx, UICommandLink.COMPONENT_TYPE, "org.richfaces.component.UICommandLink");
		commandLink.setId(id);
		return commandLink;
	}
	
	private HtmlGraphicImage newHtmlGraphicImage(FacesContext ctx, String id, String icone) {
		HtmlGraphicImage graphicImage = (HtmlGraphicImage)ctx.getApplication()
				.createComponent(ctx, HtmlGraphicImage.COMPONENT_TYPE, "org.richfaces.component.HtmlGraphicImage");
		graphicImage.setId(id);
		graphicImage.setValue(icone);
		graphicImage.setWidth("30");
		return graphicImage;
	}
	
	private HtmlInputText newHtmlInputText(FacesContext ctx, String id) {
		HtmlInputText inputText = (HtmlInputText)ctx.getApplication()
				.createComponent(ctx, UICommandLink.COMPONENT_TYPE, "org.richfaces.component.HtmlInputText");
		inputText.setId(id);
		return inputText;	
	}
	
	
	private MethodExpression newMethodExpression(FacesContext ctx, String action) {
		MethodExpression me = ctx.getApplication().getExpressionFactory()
				.createMethodExpression(ctx.getELContext(), action, String.class, new Class[0]);
		return me;
	}
	
	private ValueExpression newValueExpression(FacesContext ctx, String valueExpression, Class<?> valueType) {
		return ctx.getApplication().getExpressionFactory()
				.createValueExpression(ctx.getELContext(), valueExpression, valueType);
	}
	
	public String getTextoPesquisa() {
		return textoPesquisa;
	}
	public void setTextoPesquisa(String textoPesquisa) {
		this.textoPesquisa = textoPesquisa;
	}
	
	
	
	
}
