package edu.thiago.veiculoapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "componentes")
public class Componentes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private final boolean arCondicionado;
	private final boolean direcaoHidraulica;
	private final boolean vidrosEletricos;
	private final boolean travaEletrica;
	private final boolean airbag;
	private final boolean abs;

	public Componentes(boolean arCondicionado, boolean direcaoHidraulica,
			boolean vidrosEletricos, boolean travaEletrica, boolean airbag,
			boolean abs) {
		this.arCondicionado = arCondicionado;
		this.direcaoHidraulica = direcaoHidraulica;
		this.vidrosEletricos = vidrosEletricos;
		this.travaEletrica = travaEletrica;
		this.airbag = airbag;
		this.abs = abs;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public boolean isDirecaoHidraulica() {
		return direcaoHidraulica;
	}

	public boolean isVidrosEletricos() {
		return vidrosEletricos;
	}

	public boolean isTravaEletrica() {
		return travaEletrica;
	}

	public boolean isAirbag() {
		return airbag;
	}

	public boolean isAbs() {
		return abs;
	}

}
