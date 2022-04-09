package com.jocata.tcl.dataloader.dao;

import java.io.Serializable;
import java.util.List;

public interface LASDAO {
	
	public <T> T save(T entity);
	public <T> T update(T entity);
	public <T> T delete(T entity);
	public <T> T findEntityById(T entity, Serializable pk);
	public <T> List<T> loadEntity(Class<T> entityClass);
}
