package org.foodapp.category.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Category {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 Integer catId;
	 String categoryName;
	
	public Category(String categoryName) {
		super();
		this.categoryName = categoryName;
	}

	public Category() {
		
	}

	public Integer getCatId() {
		return catId;
	}

	public void setCatId(Integer catId) {
		this.catId = catId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
}
