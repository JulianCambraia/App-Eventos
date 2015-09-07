package br.com.julianfernando.model;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class MonitorPhaseListener implements PhaseListener {

	private static final long serialVersionUID = 1L;
	
	private String fase;

	@Override
	public void afterPhase(PhaseEvent event) {
		this.fase = event.getPhaseId().toString();
		System.out.println("After Phase: " + this.fase);

	}

	@Override
	public void beforePhase(PhaseEvent event) {
		this.fase = event.getPhaseId().toString();
		System.out.println("Before Fase:" + this.fase);

	}

	@Override
	public PhaseId getPhaseId() {
		// TODO Auto-generated method stub
		return PhaseId.ANY_PHASE;
	}

	public String getFase() {
		return fase;
	}

	public void setFase(String fase) {
		this.fase = fase;
	}

}
