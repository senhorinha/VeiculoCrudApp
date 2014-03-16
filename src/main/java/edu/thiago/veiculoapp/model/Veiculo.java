package edu.thiago.veiculoapp.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity
@Table(name = "veiculos")
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	private final Marca marca;
	private final String modelo;
	private final int ano;
	@Min(value = 0)
	private final BigDecimal valor;
	@Column(name = "numero_de_portas")
	private final int portas;
	private final Componentes componentes;

	public Veiculo(Marca marca, String modelo, int ano, BigDecimal valor,
			int portas, Componentes componentes) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
		this.portas = portas;
		this.componentes = componentes;
	}

	public Marca getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getPortas() {
		return portas;
	}

	public Componentes getComponentes() {
		return componentes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
