package edu.thiago.veiculoapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import edu.thiago.veiculoapp.model.Veiculo;

public class VeiculoDAO {

	private SessionFactory sessionFactory;

	private Session getCurruntSession() {
		return sessionFactory.getCurrentSession();
	}

	public void criar(Veiculo v) {
		getCurruntSession().save(v);
	}

	public void remover(Veiculo v) {
		getCurruntSession().delete(v);

	}

	// TODO: Finalizar método
	public void editar(Veiculo v) {
	}

	public Veiculo getVeiculo(Long id) {
		Veiculo veiculo = (Veiculo) getCurruntSession().get(Veiculo.class, id);
		return veiculo;
	}
}
