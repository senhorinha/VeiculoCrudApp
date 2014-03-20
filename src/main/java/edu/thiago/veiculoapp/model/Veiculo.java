package edu.thiago.veiculoapp.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;

;

@Entity
@Table(name = "veiculos")
public class Veiculo {

	@Id
	@GeneratedValue
	private Long id;

	private String marca;
	private String modelo;
	private int ano;
	@Min(value = 0)
	private BigDecimal valor;
	@Column(name = "numero_de_portas")
	private int numeroDePortas;

	@Transient
	private List<String> opcionais;

	@Column(name = "ar_condicionado", columnDefinition = "BIT", length = 1)
	private boolean arCondicionado;
	@Column(name = "direcao_hidraulica", columnDefinition = "BIT", length = 1)
	private boolean direcaoHidraulica;
	@Column(name = "vidro_eletrico", columnDefinition = "BIT", length = 1)
	private boolean vidrosEletricos;
	@Column(name = "trava_eletrica", columnDefinition = "BIT", length = 1)
	private boolean travaEletrica;
	@Column(name = "airbag", columnDefinition = "BIT", length = 1)
	private boolean airbag;
	@Column(name = "abs", columnDefinition = "BIT", length = 1)
	private boolean abs;

	public Veiculo(String marca, String modelo, int ano, BigDecimal valor,
			int portas, boolean arCondicionado, boolean direcaoHidraulica,
			boolean vidrosEletricos, boolean travaEletrica, boolean airbag,
			boolean abs) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
		this.numeroDePortas = portas;
		this.arCondicionado = arCondicionado;
		this.direcaoHidraulica = direcaoHidraulica;
		this.vidrosEletricos = vidrosEletricos;
		this.travaEletrica = travaEletrica;
		this.airbag = airbag;
		this.abs = abs;
	}

	public Veiculo() {
		// TODO Auto-generated constructor stub
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

	public String getMarca() {
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

	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getOpcionais() {
		if (opcionais == null) {
			opcionais = new ArrayList<String>();
			if (arCondicionado) {
				opcionais.add("ar condicicionado");
			}
			if (direcaoHidraulica) {
				opcionais.add("direção hidráulica");
			}
			if (vidrosEletricos) {
				opcionais.add("vidros elétricos");
			}
			if (travaEletrica) {
				opcionais.add("trava elétrica");
			}
			if (airbag) {
				opcionais.add("air bag");
			}
			if (abs) {
				opcionais.add("abs");
			}
		}
		return opcionais;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public void setDirecaoHidraulica(boolean direcaoHidraulica) {
		this.direcaoHidraulica = direcaoHidraulica;
	}

	public void setVidrosEletricos(boolean vidrosEletricos) {
		this.vidrosEletricos = vidrosEletricos;
	}

	public void setTravaEletrica(boolean travaEletrica) {
		this.travaEletrica = travaEletrica;
	}

	public void setAirbag(boolean airbag) {
		this.airbag = airbag;
	}

	public void setAbs(boolean abs) {
		this.abs = abs;
	}

}
