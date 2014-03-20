package edu.thiago.veiculoapp.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtils {

	private static SessionFactory sessionFactory = null;

	@SuppressWarnings("deprecation")
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = new AnnotationConfiguration().configure()
					.buildSessionFactory();
		}
		return sessionFactory;
	}

	public static void setSessionFactory(SessionFactory sessionFactory) {
		HibernateUtils.sessionFactory = sessionFactory;
	}

}
