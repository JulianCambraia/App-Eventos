package br.com.julianfernando.model;

import java.util.ArrayList;
import java.util.List;

public class Estado {
	
	private String sigla;
	
	private String nome;
	
	private String siglaDoEstadoEscolhido;
	
	private List<String> cidades = new ArrayList<String>();
	
	public Estado() {
		super();
	}

	public String getSiglaDoEstadoEscolhido() {
		return siglaDoEstadoEscolhido;
	}

	public void setSiglaDoEstadoEscolhido(String siglaDoEstadoEscolhido) {
		this.siglaDoEstadoEscolhido = siglaDoEstadoEscolhido;
	}

	public List<String> getCidades() {
		return cidades;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSigla() {
		return sigla;
	}


	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
