package br.com.julianfernando.controller;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;

import br.com.julianfernando.model.Extrato;

@ManagedBean
public class ExtratoBean {

	private Extrato extrato = new Extrato();

	public Extrato getExtrato() {
		return extrato;
	}

	public void setExtrato(Extrato extrato) {
		this.extrato = extrato;
	}
	
	public void validaDatas(ComponentSystemEvent event) {
		UIComponent source = event.getComponent();
		UIInput dataInicialEntrada = (UIInput) source.findComponent("data-inicial");
		UIInput dataFinalEntrada = (UIInput) source.findComponent("data-final");
		
		if (dataFinalEntrada.isValid() && dataFinalEntrada.isValid()) {
			
			Date dataInicialEscolhida = (Date) dataInicialEntrada.getLocalValue();
			Date dataFinalEscolhida = (Date) dataFinalEntrada.getLocalValue();
			
			if (dataFinalEscolhida.before(dataInicialEscolhida)) {
				FacesMessage message = new FacesMessage("A data final não pode vir antes da data inicial.");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				FacesContext context = FacesContext.getCurrentInstance();
				context.addMessage(source.getClientId(), message);
				
				context.renderResponse();
			}
		} 
	}
	
	public void geraExtrato() {
		FacesMessage message = new FacesMessage("Extrato gerado com sucesso.");
		message.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, message);
	}
}
