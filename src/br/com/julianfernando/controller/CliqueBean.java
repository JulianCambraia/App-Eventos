package br.com.julianfernando.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UICommand;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

@ManagedBean
public class CliqueBean implements ActionListener {

	public void mudaTexto(ActionEvent e) {
		UICommand command = (UICommand) e.getComponent();
		command.setValue("Clicado...");
	}

	@Override
	public void processAction(ActionEvent event) throws AbortProcessingException {
		UICommand c = (UICommand) event.getComponent();		
		c.getAttributes().put("style","color:red;");
	}
}
