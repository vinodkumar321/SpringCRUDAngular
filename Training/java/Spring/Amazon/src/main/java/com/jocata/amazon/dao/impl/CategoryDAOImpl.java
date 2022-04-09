package com.jocata.amazon.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jocata.amazon.dao.CategoryDAO;
import com.jocata.amazon.model.Category;
import com.jocata.amazon.util.AmazonBeanFactory;

public class CategoryDAOImpl extends AmazonDAOImpl implements CategoryDAO{

	
	public boolean save(Object entity) {
		Category category = (Category) entity;
		this.sql = "insert into category(catname) values('"+category.getCatName()+"')";
		return super.save(entity);
	}

	public boolean update(Object entity) {
		Category category = (Category) entity;
		this.sql = "update category set catname='"+category.getCatName()+"' where id="+category.getId();
		return super.update(entity);
	}

	public boolean delete(Object entity) {
		Category category = (Category) entity;
		this.sql = "delete from category where id="+category.getId();
		return super.delete(entity);
	}

	public Object get(Integer pkId) {
		this.sql = "select id, catname from category where id="+pkId;
		ResultSet rs = null;
		Category category = (Category)AmazonBeanFactory.getBean("category");
		try {
			  rs = getResultSet();
			  if(rs.next()) {
				  category.setId(rs.getInt("id"));
				  category.setCatName(rs.getString("catname"));
			  }
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			if(rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return category;
	}

	public List<Object> list() {
		this.sql = "select id, catname from category";
		ResultSet rs = null;
		List<Object> categoryList = new ArrayList<>();
		try {
			  rs = getResultSet();
			  while(rs.next()) {
				  Category category = (Category)AmazonBeanFactory.getBean("category");
				  category.setId(rs.getInt("id"));
				  category.setCatName(rs.getString("catname"));
				  categoryList.add(category);
			  }
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			if(rs != null) {
				try {
					rs.close();
					rs = null;
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return categoryList;
	}

}
