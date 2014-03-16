package edu.thiago.veiculoapp.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import edu.thiago.veiculoapp.model.Componentes;

@ManagedBean
@SessionScoped
public class ComponentesBean {

	private boolean abs;
	private boolean airbag;
	private boolean arCondicionado;
	private boolean direcaoHidraulica;
	private boolean travaEletrica;
	private boolean vidrosEletricos;

	public Componentes getComponentes() {
		return new Componentes(arCondicionado, direcaoHidraulica,
				vidrosEletricos, travaEletrica, airbag, abs);
	}

	public boolean isAbs() {
		return abs;
	}

	public void setAbs(boolean abs) {
		this.abs = abs;
	}

	public boolean isAirbag() {
		return airbag;
	}

	public void setAirbag(boolean airbag) {
		this.airbag = airbag;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public boolean isDirecaoHidraulica() {
		return direcaoHidraulica;
	}

	public void setDirecaoHidraulica(boolean direcaoHidraulica) {
		this.direcaoHidraulica = direcaoHidraulica;
	}

	public boolean isTravaEletrica() {
		return travaEletrica;
	}

	public void setTravaEletrica(boolean travaEletrica) {
		this.travaEletrica = travaEletrica;
	}

	public boolean isVidrosEletricos() {
		return vidrosEletricos;
	}

	public void setVidrosEletricos(boolean vidrosEletricos) {
		this.vidrosEletricos = vidrosEletricos;
	}

}
