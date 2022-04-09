package com.jocata.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jocata.util.HibernateUtils;

@Repository
public class SpringMvcAppDAOImpl implements DAO{

	@Autowired
	HibernateUtils hibernateUtils;
	
	@Override
	@Transactional
	public <T> T save(T entity) {
		// TODO Auto-generated method stub
		return hibernateUtils.save(entity);
	}

	@Override
	@Transactional
	public <T> T update(T entity) {
		// TODO Auto-generated method stub
		return hibernateUtils.update(entity);
	}

	@Override
	@Transactional
	public <T> T delete(T entity) {
		// TODO Auto-generated method stub
		return hibernateUtils.delete(entity);
	}

	@Override
	@Transactional
	public <T> T getEntityById(T entity, Serializable pkId) {
		// TODO Auto-generated method stub
		return hibernateUtils.getEntityById(entity, pkId);
	}

	@Override
	@Transactional
	public <T> List<T> loadEntity(T entity) {
		// TODO Auto-generated method stub
		return hibernateUtils.loadEntity(entity);
	}

	@Override
	@Transactional
	public <T> List<T> loadEntityByHql(String hql) {
		// TODO Auto-generated method stub
		return hibernateUtils.loadEntityByHQL(hql);
	}

}
