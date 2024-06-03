package com.app.dao;

import static com.app.utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entities.User;

public class UserDaoImpl implements UserDao {
	
	@Override
	public User signIn(String email, String password){
		User user = null;
		String jpql = "select u from User u where u.email=:em and u.password=:pass";
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		try {
			
			user = session.createQuery(jpql, User.class).setParameter("em", email).setParameter("pass", password)
					.getSingleResult();
			
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

		return user;
		
		
	}


}
