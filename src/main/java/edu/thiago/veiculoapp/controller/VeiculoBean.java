package edu.thiago.veiculoapp.controller;

import java.math.BigDecimal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;

import edu.thiago.veiculoapp.dao.VeiculoDAO;
import edu.thiago.veiculoapp.model.Marca;
import edu.thiago.veiculoapp.model.Veiculo;

@ManagedBean
@SessionScoped
public class VeiculoBean {

	@Autowired
	VeiculoDAO dao;

	private String marca;
	private String modelo;
	private int portas;
	private int ano;
	private BigDecimal valor;
	private ComponentesBean componentesBean;

	public String getModelo() {
		return modelo;
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

}
