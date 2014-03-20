package edu.thiago.veiculoapp.dao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import edu.thiago.veiculoapp.model.Veiculo;

public class VeiculoDAO implements Serializable {

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

	public void salvar(Veiculo v) {
		Session session = HibernateUtils.getSessionFactory().openSession();

		try {
			session = HibernateUtils.getSessionFactory().openSession();
			session.beginTransaction();
			session.saveOrUpdate(v);
			session.getTransaction().commit();
		} finally {
			session.close();

		}
	}

	@SuppressWarnings("deprecation")
	public List<Veiculo> procurarVeiculosCom(String marca, String modelo,
			int anoInicial, int anoFinal, double valorInicial,
			double valorFinal, int numeroDePortas, boolean opcionais,
			boolean arCondicionado, boolean direcaoHidraulica,
			boolean vidrosEletricos, boolean travaEletrica, boolean airbag,
			boolean abs) {

		Session session = HibernateUtils.getSessionFactory().openSession();
		try {
			Criteria criteria = session.createCriteria(Veiculo.class);
			if (marca != null && !marca.isEmpty()) {
				criteria.add(Restrictions.eq("marca", marca));
			} else {
				criteria.add(Restrictions.isNotNull("marca"));
			}
			if (modelo != null && !modelo.isEmpty()) {
				criteria.add(Restrictions.eq("modelo", modelo));
			} else {
				criteria.add(Restrictions.isNotNull("modelo"));
			}
			if (numeroDePortas != 0) {
				criteria.add(Restrictions.eq("numeroDePortas", numeroDePortas));
			} else {
				criteria.add(Restrictions.ne("numeroDePortas", 0));
			}

			if (anoInicial == 0 && anoFinal == 0) {
				criteria.add(Restrictions.ne("ano", 0));
			} else if (anoInicial != 0 && anoFinal == 0) {
				criteria.add(Restrictions.gt("ano", anoInicial));
			} else if (anoInicial == 0 && anoFinal != 0) {
				criteria.add(Restrictions.lt("ano", anoFinal));
			} else {
				criteria.add(Restrictions.between("ano", anoInicial, anoFinal));
			}
			if (valorInicial == 0 && valorFinal == 0) {
				criteria.add(Restrictions.ne("valor", new BigDecimal(0)));
			} else if (valorInicial != 0 && valorFinal == 0) {
				criteria.add(Restrictions.gt("valor", new BigDecimal(
						valorInicial)));
			} else if (valorInicial == 0 && valorFinal != 0) {
				criteria.add(Restrictions.lt("valor",
						new BigDecimal(valorFinal)));
			} else {
				criteria.add(Restrictions.between("valor", new BigDecimal(
						valorInicial), new BigDecimal(valorFinal)));
			}

			if (opcionais) {
				criteria.add(Restrictions.eq("direcaoHidraulica",
						direcaoHidraulica));
				criteria.add(Restrictions.eq("arCondicionado", arCondicionado));
				criteria.add(Restrictions
						.eq("vidrosEletricos", vidrosEletricos));
				criteria.add(Restrictions.eq("travaEletrica", travaEletrica));
				criteria.add(Restrictions.eq("airbag", airbag));
				criteria.add(Restrictions.eq("abs", abs));
			} else {
				criteria.add(Restrictions.isNotNull("direcaoHidraulica"));
				criteria.add(Restrictions.isNotNull("arCondicionado"));
				criteria.add(Restrictions.isNotNull("vidrosEletricos"));
				criteria.add(Restrictions.isNotNull("travaEletrica"));
				criteria.add(Restrictions.isNotNull("airbag"));
				criteria.add(Restrictions.isNotNull("abs"));
			}

			List<Veiculo> resultado = criteria.list();
			return resultado;
		} finally {
			session.close();

		}

	}

	public List<Veiculo> listarTodos() {
		Session session = HibernateUtils.getSessionFactory().openSession();

		try {
			Criteria cri = session.createCriteria(Veiculo.class);
			return cri.list();
		} finally {
			session.close();

		}
	}

}
