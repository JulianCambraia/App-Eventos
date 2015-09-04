package br.com.julianfernando.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;

@ManagedBean
public class BotoesBean {
	
	public void sorteiaBotao(ActionEvent event) {
		
		UIComponent formulario = event.getComponent().getParent();
		UIComponent botaoGravar = formulario.findComponent("botao-gravar");
		UIComponent botaoListar = formulario.findComponent("botao-listar");
		UIComponent botaoGerarPDF = formulario.findComponent("botao-pdf");
		UIComponent botaoNovo = formulario.findComponent("botao-novo");
		
		botaoGravar.getAttributes().put("disabled", true);
		botaoListar.getAttributes().put("disabled", true);
		botaoGerarPDF.getAttributes().put("disabled", true);
		botaoNovo.getAttributes().put("disabled", true);
				
		double numero = Math.random();
		
		if (numero < 1.0/3.0) {
			botaoGravar.getAttributes().put("disabled", false);
		} else if (numero < 2.0/3.0) {
			botaoGerarPDF.getAttributes().put("disabled", false);
		} else if (numero < 3.0/4.0) {
			botaoListar.getAttributes().put("disabled", false);
		} else {
			botaoNovo.getAttributes().put("disabled", false);
		}
	}

}
