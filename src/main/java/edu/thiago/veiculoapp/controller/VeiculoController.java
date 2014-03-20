package edu.thiago.veiculoapp.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import edu.thiago.veiculoapp.dao.VeiculoDAO;
import edu.thiago.veiculoapp.model.Marca;
import edu.thiago.veiculoapp.model.Veiculo;

@ManagedBean
@ViewScoped
public class VeiculoController {

	private Veiculo veiculo;
	private ConsultaBean consulta;

	private boolean atualizarLista = true;
	private boolean consultaRealizada = false;

	private VeiculoDAO dao;
	private DataModel veiculos;

	private List<Veiculo> veiculosConsultados;
	private String valorAux;

	public DataModel listarVeiculos() {
		if (atualizarLista) {
			List<Veiculo> lista;
			if (consultaRealizada) {
				lista = veiculosConsultados;
			} else {
				dao = new VeiculoDAO();
				lista = dao.listarTodos();
			}
			veiculos = new ListDataModel(lista);
		}
		atualizarLista = false;
		return veiculos;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void prepararAdicao(ActionEvent actionEvent) {
		valorAux = "";
		veiculo = new Veiculo();
	}

	public void prepararConsulta(ActionEvent actionEvent) {
		consulta = new ConsultaBean();
	}

	public void prepararAlteracao(ActionEvent actionEvent) {
		veiculo = (Veiculo) (veiculos.getRowData());
		valorAux = String.valueOf(veiculo.getValor());
	}

	public String excluir() {
		atualizarLista = true;
		consultaRealizada = false;
		Veiculo v = (Veiculo) (veiculos.getRowData());
		dao.remover(v);
		return "index";
	}

	public void adicionar(ActionEvent actionEvent) {
		atualizarLista = true;
		consultaRealizada = false;
		VeiculoDAO dao = new VeiculoDAO();
		dao.salvar(veiculo);
	}

	public void consultar() {
		atualizarLista = true;
		consultaRealizada = true;
		System.out.println("CONSULTANDO!!!");
		veiculosConsultados = consulta.consultar();
	}

	public List<String> listarMarcasDisponiveis() {
		List<String> marcasDisponiveis = new ArrayList<String>();
		for (Marca m : Marca.values()) {
			marcasDisponiveis.add(m.toString());
		}
		return marcasDisponiveis;
	}

	public String getValorAux() {
		return valorAux;
	}

	public void setValorAux(String valorAux) {
		this.valorAux = valorAux;
		valorAux.replace(".", "");
		valorAux.replace(",", ".");
		veiculo.setValor(new BigDecimal(Double.valueOf(valorAux)));
	}

	public ConsultaBean getConsulta() {
		return consulta;
	}

	public void setConsulta(ConsultaBean consulta) {
		this.consulta = consulta;
	}

}
