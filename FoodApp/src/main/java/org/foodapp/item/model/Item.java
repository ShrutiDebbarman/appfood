package org.foodapp.item.model;

import org.foodapp.category.model.Category;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer itemId;
    String itemName;
    @OneToOne
    Category category;
    //Integer quantity;
    Double cost;
    //List<Restaurant> restaurants;
	
    public Item() {
	
	}

	public Item(String itemName, Category category, Double cost) {
		super();
		this.itemName = itemName;
		this.category = category;
		this.cost = cost;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}
    
    
    
}
	
