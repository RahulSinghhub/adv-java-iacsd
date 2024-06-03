package com.app.dao;

import static com.app.utils.HibernateUtil.getFactory;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entities.Categaries;

public class CategoryDaoImpl implements CategoryDao {

	@Override
	public String register(Categaries categary) {
		// TODO Auto-generated method stub
		Session session = getFactory().getCurrentSession();
		Transaction tx  = session.beginTransaction();
		try {
			Serializable c  = session.save(categary);
			tx.commit();
		}catch(RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		
		
		return "done registration" ;
	}
}
