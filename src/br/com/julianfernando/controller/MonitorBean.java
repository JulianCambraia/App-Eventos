package br.com.julianfernando.controller;

import javax.faces.bean.ManagedBean;

import br.com.julianfernando.model.MonitorPhaseListener;

@ManagedBean
public class MonitorBean {

	private MonitorPhaseListener monitorPhaseListener = new MonitorPhaseListener();

	public MonitorPhaseListener getMonitorPhaseListener() {
		return monitorPhaseListener;
	}

	public void setMonitorPhaseListener(MonitorPhaseListener monitorPhaseListener) {
		this.monitorPhaseListener = monitorPhaseListener;
	}
}
