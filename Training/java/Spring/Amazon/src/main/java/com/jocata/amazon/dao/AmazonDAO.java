package com.jocata.amazon.dao;

import java.util.List;

public interface AmazonDAO {
    
	public boolean save(Object entity);
    public boolean update(Object entity);
    public boolean delete(Object entity);
    public Object get(Integer pkId);
    public List<Object> list();
}
