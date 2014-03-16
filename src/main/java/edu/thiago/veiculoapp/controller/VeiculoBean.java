package edu.thiago.veiculoapp.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import edu.thiago.veiculoapp.dao.VeiculoDAO;
import edu.thiago.veiculoapp.model.Marca;
import edu.thiago.veiculoapp.model.Veiculo;

@ManagedBean(name = "veiculoBean")
public class VeiculoBean {

	private VeiculoDAO dao;
	private ComponentesBean componentesBean;

	private String marca;
	private String modelo;
	private int portas;
	private int ano;
	private BigDecimal valor;
	private BigDecimal valorInicial;
	private BigDecimal valorFinal;

	public BigDecimal getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(BigDecimal valorFinal) {
		this.valorFinal = valorFinal;
	}

	public BigDecimal getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(BigDecimal valorInicial) {
		this.valorInicial = valorInicial;
	}

	public String getModelo() {
		return modelo;
	}

	public List<String> getMarcas() {
		List<String> marcas = new ArrayList<String>();
		for (Marca m : Marca.values()) {
			marcas.add(m.toString());
		}
		return marcas;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public ComponentesBean getComponentesBean() {
		return componentesBean;
	}

	public void setComponentesBean(ComponentesBean componentesBean) {
		this.componentesBean = componentesBean;
	}

	public Veiculo getVeiculo() {

		return new Veiculo(Marca.valueOf(marca.toUpperCase()), modelo, ano,
				valor, portas, componentesBean.getComponentes());
	}

	public void adicionar() {
		dao.criar(getVeiculo());
	}

	public void remover() {
		dao.remover(getVeiculo());

	}

	public void editar() {
		dao.editar(getVeiculo());
	}

	public void salvar() {
		System.out.printf("Marca: %s\n", marca);
		System.out.printf("Modelo: %s\n", modelo);

	}

	public int portaConverter(String porta) {
		return Integer.valueOf(porta);
	}

}
