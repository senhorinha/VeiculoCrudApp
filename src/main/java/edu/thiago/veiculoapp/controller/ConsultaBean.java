package edu.thiago.veiculoapp.controller;

import java.util.List;

import edu.thiago.veiculoapp.dao.VeiculoDAO;
import edu.thiago.veiculoapp.model.Veiculo;

public class ConsultaBean {

	VeiculoDAO dao;

	private String marca;
	private String modelo;
	private int anoInicial;
	private int anoFinal;
	private double valorInicial;
	private double valorFinal;
	private int numeroDePortas;

	private boolean opcionais;

	private boolean arCondicionado;
	private boolean direcaoHidraulica;
	private boolean vidrosEletricos;
	private boolean travaEletrica;
	private boolean airbag;
	private boolean abs;

	public ConsultaBean() {
	}

	public List<Veiculo> consultar() {
		dao = new VeiculoDAO();
		return dao.procurarVeiculosCom(marca, modelo, anoInicial, anoFinal,
				valorInicial, valorFinal, numeroDePortas, opcionais,
				arCondicionado, direcaoHidraulica, vidrosEletricos,
				travaEletrica, airbag, abs);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoInicial() {
		return anoInicial;
	}

	public void setAnoInicial(int anoInicial) {
		this.anoInicial = anoInicial;
	}

	public int getAnoFinal() {
		return anoFinal;
	}

	public void setAnoFinal(int anoFinal) {
		this.anoFinal = anoFinal;
	}

	public double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}

	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	public boolean isOpcionais() {
		return opcionais;
	}

	public void setOpcionais(boolean opcionais) {
		this.opcionais = opcionais;
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

	public boolean isVidrosEletricos() {
		return vidrosEletricos;
	}

	public void setVidrosEletricos(boolean vidrosEletricos) {
		this.vidrosEletricos = vidrosEletricos;
	}

	public boolean isTravaEletrica() {
		return travaEletrica;
	}

	public void setTravaEletrica(boolean travaEletrica) {
		this.travaEletrica = travaEletrica;
	}

	public boolean isAirbag() {
		return airbag;
	}

	public void setAirbag(boolean airbag) {
		this.airbag = airbag;
	}

	public boolean isAbs() {
		return abs;
	}

	public void setAbs(boolean abs) {
		this.abs = abs;
	}

}
