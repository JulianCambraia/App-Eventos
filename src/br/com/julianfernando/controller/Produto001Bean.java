package br.com.julianfernando.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
public class Produto001Bean {
	
	private Double precoAntigo = 0.00;
	
	private Double precoNovo = 0.0;
	
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
		if (vce.getOldValue() == null) {
			String precoNew = String.valueOf(vce.getNewValue());
			this.precoNovo = Double.parseDouble(precoNew);
		} else {
			String precoNew = String.valueOf(vce.getNewValue());
			this.precoNovo = Double.parseDouble(precoNew);
			
			String precoOld = String.valueOf(vce.getOldValue());
			this.precoAntigo = Double.parseDouble(precoOld);
		}
		
	}

	public void mudaOpcaoMarcada(ValueChangeEvent event) {
		if (event.getOldValue()== null) {
			this.setOpcaoNew(String.valueOf(event.getNewValue()));			
		} else {
			this.setOpcaoNew(String.valueOf(event.getNewValue()));
			this.setOpcaoOld(String.valueOf(event.getOldValue()));
		}
	}
	
	public void codigoDoPaisModificado(ValueChangeEvent event) {
		this.localeCode = event.getNewValue().toString();
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
