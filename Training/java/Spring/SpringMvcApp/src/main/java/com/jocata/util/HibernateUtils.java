package com.jocata.util;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateUtils {
	
	@Autowired
	SessionFactory sessionFactory;
	
	private Session getSession() {
		//if(sessionFactory.getCurrentSession() != null) 
			//	return sessionFactory.getCurrentSession();
		
		return sessionFactory.openSession();
	}
	
	private void closeSession(Session session) {
		session.close();
	}	
	
	@SuppressWarnings("unchecked")
	public <T> T save(T entity) { //Hibernate always returns the new primarykey of successful insert
		Session session = getSession();
		Serializable serializable = null;
		try {
			serializable = session.save(entity);
		}catch(Exception e) {e.printStackTrace(); return null;}
		finally {closeSession(session);}		
		return (T) serializable;
	}
	public <T> T update(T entity) { 
		Session session = getSession();
		
		try {
			session.update(entity);
		}catch(Exception e) {e.printStackTrace();}
		finally {closeSession(session);}
		return null;
	}
	public <T> T delete(T entity) {
		Session session = getSession();
		try {
			session.delete(entity);
		}catch(Exception e) {e.printStackTrace();}
		finally {closeSession(session);}		
		return null;
	}
	@SuppressWarnings("unchecked")
	public <T> T getEntityById(T entity, Serializable pkId) {
		Session session = getSession();
		T obj = null;
		try {
			obj = (T) session.get(entity.getClass(), pkId);
		}catch(Exception e) {e.printStackTrace();}
		finally {closeSession(session);}
		return obj;
	}
	@SuppressWarnings("unchecked")
	public <T> List<T> loadEntity(T entity) {
		Session session = getSession();
		List<T> objList = null;		
		try {
			objList = (List<T>) session.createQuery("from " + entity.getClass().getName()).list();
		}catch(Exception e) {e.printStackTrace();}
		finally {closeSession(session);}
		return objList;
	}
	@SuppressWarnings("unchecked")
	public <T> List<T> loadEntityByHQL(String hql) {
		Session session = getSession();
		List<T> objList = null;		
		try {
			objList = (List<T>) session.createQuery(hql).list();
		}catch(Exception e) {e.printStackTrace();}
		finally {closeSession(session);}
		return objList;
	}

}
