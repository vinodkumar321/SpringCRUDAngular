package com.jocata.tcl.dataloader.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jocata.tcl.dataloader.dao.LASDAO;
import com.jocata.tcl.dataloader.utils.HibernateUtils;



@Repository
public abstract class LASDAOImpl implements LASDAO {
	
	@Autowired
	HibernateUtils hibernateUtils;

	@Override
	public <T> T save(T entity) {
		// TODO Auto-generated method stub
		return hibernateUtils.save(entity);
	}

	@Override
	public <T> T update(T entity) {
		// TODO Auto-generated method stub
		return hibernateUtils.update(entity);
	}

	@Override
	public <T> T delete(T entity) {
		// TODO Auto-generated method stub
		return hibernateUtils.delete(entity);
	}

	@Override
	public <T> T findEntityById(T entity, Serializable pk) {
		// TODO Auto-generated method stub
		return hibernateUtils.findEntityById(entity, pk);
	}

	@Override
	public <T> List<T> loadEntity(Class<T> entityClass) {
		// TODO Auto-generated method stub
		return hibernateUtils.loadEntity(entityClass);
	}

}
