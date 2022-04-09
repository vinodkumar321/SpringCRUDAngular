package com.jocata.amazon.dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.jocata.amazon.dao.ProductDAO;
import com.jocata.amazon.util.AmazonBeanFactory;

public class ProductDAOImpl extends AmazonDAOImpl implements ProductDAO {

	public boolean save(Object entity) {
		Product product = (Product) entity;
		this.sql = "insert into product(catid,pname,price,quantity,description) values("+product.getCatId()+",'"+product.getPname()+"',"+product.getPrice()+","+product.getQuantity()+",'"+product.getDescription()+"')";
		return super.save(entity);
	}

	public boolean update(Object entity) {
		Product product = (Product) entity;
		this.sql = "update product set pname='"+product.getPname()+"' where id="+product.getId();
		return super.update(entity);
	}

	public boolean delete(Object entity) {
		Product product = (Product) entity;
		this.sql = "delete from product where id="+product.getId();
		return super.delete(entity);
	}
	
	public Object get(Integer pkId) {
	    this.sql = "select id,catid,pname,price,quantity,description from product where pid="+pkId;
		Product product = (Product)AmazonBeanFactory.getBean("product");
		ResultSet rs = null;
	  try {	
		     rs = getResultSet();
		     if(rs.next()) {
		       product.setCatId(pkId);
		       product.setCatId(rs.getInt("catid"));
		       product.setPname(rs.getString("pname"));
		       product.setPrice(rs.getInt("price"));
		       product.setQuantity(rs.getInt("quantity"));
		       product.setDescription(rs.getString("description"));
		     }
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
		
	    return product;
	}

	public List<Object> list() {
		this.sql = "select id,catid,pname,price,quantity,description from product";
		List<Object> productList = new ArrayList<>();
		ResultSet rs = null;
	  try {	
		     rs = getResultSet();
		     while(rs.next()) {
		       Product product = (Product)AmazonBeanFactory.getBean("product");
		       product.setCatId(rs.getInt("id"));
		       product.setCatId(rs.getInt("catid"));
		       product.setPname(rs.getString("pname"));
		       product.setPrice(rs.getInt("price"));
		       product.setQuantity(rs.getInt("quantity"));
		       product.setDescription(rs.getString("description"));
		       
		       productList.add(product);
		     }
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
		
	    return productList;

	}

}
