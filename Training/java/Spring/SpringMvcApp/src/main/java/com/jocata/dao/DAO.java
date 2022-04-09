package com.jocata.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface DAO {
	public <T> T save(T entity);
	public <T> T update(T entity);
	public <T> T delete(T entity);
	public <T> T getEntityById(T entity, Serializable pkId);
	public <T> List<T> loadEntity(T entity);
	public <T> List<T> loadEntityByHql(String hql);

}
