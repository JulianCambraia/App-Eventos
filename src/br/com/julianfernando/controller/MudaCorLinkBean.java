package br.com.julianfernando.controller;

import javax.faces.component.UICommand;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class MudaCorLinkBean implements ActionListener {

	@Override
	public void processAction(ActionEvent event) throws AbortProcessingException {
		UICommand c = (UICommand) event.getComponent();
		c.getAttributes().put("style", "color:green;");

	}

}
