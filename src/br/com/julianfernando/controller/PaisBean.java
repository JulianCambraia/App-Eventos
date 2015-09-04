package br.com.julianfernando.controller;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="pais")
@SessionScoped
public class PaisBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String codeLocale = "AL";
	
	private static Map<String, String> paises;
	
	static {
		String[] locales = Locale.getISOCountries();
		
		paises = new LinkedHashMap<String, String>();
		
		for (String countryCode : locales) {
			Locale obj = new Locale("", countryCode);
			paises.put(obj.getDisplayCountry(),obj.getCountry());
		}
		
	}

	public String getCodeLocale() {
		return codeLocale;
	}

	public void setCodeLocale(String codeLocale) {
		this.codeLocale = codeLocale;
	}

	public Map<String, String> getPaises() {
		return paises;
	}
	
}
