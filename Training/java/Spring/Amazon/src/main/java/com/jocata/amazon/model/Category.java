package com.jocata.amazon.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "category")
public class Category implements Serializable { // to represent a Database Table --> Entity

	
	private static final long serialVersionUID = 3889375456646202214L;

	
	private Integer id;
	
	// hibernate Mapping
	@Column(name = "catname")
	private String catName;
	
	public Category() {
		super();
	}
	
	public Category(String catName) {
		this.catName = catName;
	}

	// hibernates has behaviour that whenever object is saved in database it return newly created primary key back
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}
	
	
	
}
