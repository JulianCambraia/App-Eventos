package br.com.julianfernando.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
public class Produto001Bean {
	
	private Double precoAntigo;
	
	private Double precoNovo;
	
	private String opcaoOld;
	
	private String opcaoNew;
	
	private static Map<String, String> paises; 
	
	private String localeCode = "UK"; 
	
	static {
		paises = new LinkedHashMap<String, String>();
		paises.put("Reino Unido", "UK");
		paises.put("França", "FR");
		paises.put("Alemanha", "AL");
		paises.put("China", "CH");
	}

	public void mudarPreco(ValueChangeEvent vce) {
		UIComponent formulario = vce.getComponent().getParent();
		UIComponent precoAntigo = formulario.findComponent("precoAntigo");
		UIComponent precoNovo = formulario.findComponent("precoNovo");
		
		if (vce.getOldValue() == null) {
			String precoNew = String.valueOf(vce.getNewValue());
			this.precoNovo = Double.parseDouble(precoNew);
			precoNovo.getAttributes().put("style", "color:yellow;");
		} else {
			String precoNew = String.valueOf(vce.getNewValue());
			this.precoNovo = Double.parseDouble(precoNew);
			
			precoNovo.getAttributes().put("style", "color:yellow;");
			
			String precoOld = String.valueOf(vce.getOldValue());
			this.precoAntigo = Double.parseDouble(precoOld);
			
			precoAntigo.getAttributes().put("style", "color:green;");
		}
		
	}

	public void mudaOpcaoMarcada(ValueChangeEvent event) {
		
		UIComponent formulario = event.getComponent().getParent();
		UIComponent opcAntigo = formulario.findComponent("opcAnterior");
		UIComponent opcProximo = formulario.findComponent("opcProxima");
		
		if (event.getOldValue()== null) {
			opcAntigo.getAttributes().put("style", "color:blue");
			this.setOpcaoNew(String.valueOf(event.getNewValue()));
			
		} else {
			opcAntigo.getAttributes().put("style", "color:blue");
			opcProximo.getAttributes().put("style", "color:blue");
			this.setOpcaoNew(String.valueOf(event.getNewValue()));
			this.setOpcaoOld(String.valueOf(event.getOldValue()));
		}
	}
	
	public void codigoDoPaisModificado(ValueChangeEvent event) {
		if (event.getNewValue() != null) {
			UIComponent formulario = event.getComponent().getParent();
			UIComponent itemPais = formulario.findComponent("Itenspais");
			itemPais.getAttributes().put("style", "color:red;");
			this.localeCode = event.getNewValue().toString();
		}
	}
	
	public Double getPrecoAntigo() {
		return precoAntigo;
	}

	public void setPrecoAntigo(Double precoAntigo) {
		this.precoAntigo = precoAntigo;
	}

	public Double getPrecoNovo() {
		return precoNovo;
	}

	public void setPrecoNovo(Double precoNovo) {
		this.precoNovo = precoNovo;
	}

	public String getOpcaoOld() {
		return opcaoOld;
	}

	public void setOpcaoOld(String opcaoOld) {
		this.opcaoOld = opcaoOld;
	}

	public String getOpcaoNew() {
		return opcaoNew;
	}

	public void setOpcaoNew(String opcaoNew) {
		this.opcaoNew = opcaoNew;
	}

	public Map<String, String> getPaises() {
		return paises;
	}

	public String getLocaleCode() {
		return localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

}
