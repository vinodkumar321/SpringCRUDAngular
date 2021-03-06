package com.jocata.las.utils;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateUtils {

	
	@Autowired
	public SessionFactory sessionFactory;
	
	public Session getSession() {
		Session session = null;
		try {
		session = sessionFactory.openSession();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return session;
	}
	public void closeSession(Session currentSession) {	
		
		try {			
			if(currentSession !=null) currentSession.close();				
		}catch(Exception e) {
			e.printStackTrace();
			currentSession = null;
		}		
	}
	
	public <T> T save(T entity) {
		Session session = null;
		try {
			session = getSession();
			Serializable id = session.save(entity);
			return (T)id;			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public <T> T update(T entity) {
		Session session = null;
		try {
			session = getSession();
			session.beginTransaction();
			session.saveOrUpdate(entity);
			session.getTransaction().commit();
	        
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			closeSession(session);
		}
		
		return null;
	}
	
	public <T> T delete(T entity) {
		Session session = null;
		try {
			session = getSession();
			session.beginTransaction();
			session.delete(session.merge(entity));
			session.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			closeSession(session);
		}
		
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public <T> T findEntityById(T entity, Serializable pk) {
		
		Session session = null;
		Object object = null;
		try {
			session = getSession();
			object = session.get(entity.getClass(),pk);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			closeSession(session);
		}
		return (T) object;
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> loadEntity(Class<T> entityClass){
		Session session = null;
		List<T> objList = null;
		try {
			session = getSession();
			objList = session.createQuery("from " + entityClass.getName()).list();
			//objList = session.createQuery("select * from " + entityClass.getName()).list();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			closeSession(session);
		}
		return (List<T>) objList;
	}
}
