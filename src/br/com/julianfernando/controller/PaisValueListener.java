package br.com.julianfernando.controller;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class PaisValueListener implements ValueChangeListener {

	@Override
	public void processValueChange(ValueChangeEvent event)	throws AbortProcessingException {
		FacesContext context = FacesContext.getCurrentInstance();
		
		PaisBean paisBean = (PaisBean) context.getELContext().getELResolver().getValue(context.getELContext(), null,"pais");
		
		paisBean.setCodeLocale(event.getNewValue().toString());
		

	}

}
