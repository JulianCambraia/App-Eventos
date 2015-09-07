package br.com.julianfernando.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import br.com.julianfernando.model.Cidade;
import br.com.julianfernando.model.Estado;
import br.com.julianfernando.model.Pessoa;

@ManagedBean
@SessionScoped
public class CadastroBean {
	
	private Pessoa  pessoa = new Pessoa();
	
	private Cidade cidade = new Cidade();
	
	private List<Estado> estados = new ArrayList<Estado>();
	
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	private Estado estadoSelecionado = new Estado();
	
	public CadastroBean() {
		super();
		
		Estado ac = new Estado();
		ac.setSigla("AC");
		ac.setNome("Acre");
		ac.getCidades().add("Rio Branco");
		
		this.estados.add(ac);
		
		Estado al = new Estado();
		al.setSigla("AL");
		al.setNome("Alagoas");
		al.getCidades().add("Maceió");
		
		this.estados.add(al);
		
		Estado am = new Estado();
		am.setSigla("AM");
		am.setNome("Amapá");
		am.getCidades().add("Macapá");
		
		this.estados.add(am);
		
		Estado ba = new Estado();
		ba.setSigla("BA");
		ba.setNome("Bahia");
		ba.getCidades().add("Salvador");
		
		this.estados.add(ba);
		
		Estado ce = new Estado();
		ce.setSigla("CE");
		ce.setNome("Ceará");
		ce.getCidades().add("Fortaleza");
		
		this.estados.add(ce);
		
		Estado df = new Estado();
		df.setSigla("DF");
		df.setNome("Distrito Federal");
		df.getCidades().add("Brasília");
		
		this.estados.add(df);
		
		Estado es = new Estado();
		es.setSigla("ES");
		es.setNome("Espírito Santo");
		es.getCidades().add("Vitória");
		
		this.estados.add(es);
		
		Estado go = new Estado();
		go.setSigla("GO");
		go.setNome("Goiás");
		go.getCidades().add("Goiânia");
		
		this.estados.add(go);
		
		Estado ma = new Estado();
		ma.setSigla("MA");
		ma.setNome("Maranhão");
		ma.getCidades().add("São Luíz");
		
		this.estados.add(ma);
		
		Estado mt = new Estado();
		mt.setSigla("MT");
		mt.setNome("Mato Grosso");
		mt.getCidades().add("Cuiabá");
		
		this.estados.add(mt);
		
		Estado ms = new Estado();
		ms.setSigla("MS");
		ms.setNome("Mato Grosso do Sul");
		ms.getCidades().add("Campo Grande");
		
		this.estados.add(ms);
		
		Estado mg = new Estado();
		mg.setSigla("MG");
		mg.setNome("Minas Gerais");
		mg.getCidades().add("Belo Horizonte");
		
		this.estados.add(mg);
		
		Estado pa = new Estado();
		pa.setSigla("PA");
		pa.setNome("Pará");
		pa.getCidades().add("Belém");
		
		this.estados.add(pa);
		
		Estado pb = new Estado();
		pb.setSigla("PB");
		pb.setNome("Paraiba");
		pb.getCidades().add("João Pessoa");
		
		this.estados.add(pb);
		
		Estado pr = new Estado();
		pr.setSigla("PR");
		pr.setNome("Paraná");
		pr.getCidades().add("Curitiba");
		
		this.estados.add(pr);
		
		Estado pe = new Estado();
		pe.setSigla("PE");
		pe.setNome("Pernambuco");
		pe.getCidades().add("Recife");
		
		this.estados.add(pe);
		
		Estado pi = new Estado();
		pi.setSigla("PI");
		pi.setNome("Piauí");
		pi.getCidades().add("Terezina");
		
		this.estados.add(pi);
		
		Estado rj = new Estado();
		rj.setSigla("RJ");
		rj.setNome("Rio de Janeiro");
		rj.getCidades().add("Rio de Janeiro");
		
		this.estados.add(rj);
		
		Estado rn = new Estado();
		rn.setSigla("RN");
		rn.setNome("Rio Grande do Norte");
		rn.getCidades().add("Natal");
		
		this.estados.add(rn);
		
		Estado rs = new Estado();
		rs.setSigla("RS");
		rs.setNome("Rio Grande do Sul");
		rs.getCidades().add("Porto ALegre");
		
		this.estados.add(rs);
		
		Estado ro = new Estado();
		ro.setSigla("RO");
		ro.setNome("Rondônia");
		ro.getCidades().add("Porto Velho");
		
		this.estados.add(ro);
		
		Estado rr = new Estado();
		rr.setSigla("RR");
		rr.setNome("Roraima");
		rr.getCidades().add("Boa Vista");
		
		this.estados.add(rr);
		
		Estado sc = new Estado();
		sc.setSigla("SC");
		sc.setNome("Santa Catarina");
		sc.getCidades().add("Florianópolis");
		
		this.estados.add(sc);
		
		Estado sp = new Estado();
		sp.setSigla("SP");
		sp.setNome("São Paulo");
		sp.getCidades().add("São Paulo");
		
		this.estados.add(sp);
		
		Estado se = new Estado();
		se.setSigla("SE");
		se.setNome("Sergipe");
		se.getCidades().add("Aracaju");
		
		this.estados.add(se);
		
		Estado to = new Estado();
		to.setSigla("TO");
		to.setNome("Tocantins");
		to.getCidades().add("Palmas");
		
		this.estados.add(to);
	}

	public List<Estado> getEstados() {
		return estados;
	}

	public Estado getEstadoSelecionado() {
		return estadoSelecionado;
	}

	public void setEstadoSelecionado(Estado estadoSelecionado) {
		this.estadoSelecionado = estadoSelecionado;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}


	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public void mudaEstado(ValueChangeEvent event) {
		this.estadoSelecionado.setSiglaDoEstadoEscolhido(event.getNewValue().toString());
		this.cidade.setCidadeSelecionada(event.getNewValue().toString());
		
		for (Estado estado : estados) {
			if (estado.getSigla().equals(this.estadoSelecionado.getSiglaDoEstadoEscolhido())) {
				this.estadoSelecionado = estado;
				break;
			}
		}
		
		FacesContext.getCurrentInstance().renderResponse();
	}
	
	public String cadastrar() {
		this.pessoa.setNome(this.pessoa.getNome());
		this.pessoa.setEstado(getEstadoSelecionado());
		this.pessoa.setCidade(this.getCidade().getCidadeSelecionada());
		
		this.pessoas.add(getPessoa());
		
		this.pessoa = new Pessoa();
		
		return "lista-pessoas";
	}
	
	public String voltar() {
		this.pessoa = new Pessoa();
		this.cidade = new Cidade();
		this.estadoSelecionado = new Estado();
		
		return "cadastro";
	}
}
