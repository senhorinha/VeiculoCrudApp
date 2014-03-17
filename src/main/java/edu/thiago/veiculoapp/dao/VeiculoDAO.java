package edu.thiago.veiculoapp.dao;

import org.hibernate.Session;

import edu.thiago.veiculoapp.model.Veiculo;

public class VeiculoDAO {

	public void criar(Veiculo v) {
		Session session = null;
		try {
			session = HibernateUtils.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(v);
			session.getTransaction().commit();
		} finally {
			session.close();
		}

	}

	public void remover(Veiculo v) {
		Session session = null;

		try {
			session = HibernateUtils.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(v);
			session.getTransaction().commit();

		} finally {
			session.close();

		}
	}

	// TODO: Finalizar método
	public void editar(Veiculo v) {
	}

}
