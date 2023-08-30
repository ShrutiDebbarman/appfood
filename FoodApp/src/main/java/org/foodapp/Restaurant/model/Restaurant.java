package org.foodapp.Restaurant.model;


import java.util.List;

import org.foodapp.item.model.Item;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Restaurant {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 Integer restId;
	 String restaurantName;
	 @OneToMany
	 List<Item> item ;
	 
	 public Restaurant() {
	}

	public Restaurant(Integer restId, String restaurantName, List<Item> item) {
		super();
		this.restId = restId;
		this.restaurantName = restaurantName;
		this.item = item;
	}
	
	public Integer getRestId() {
		return restId;
	}
	public void setRestId(Integer restId) {
		this.restId = restId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public List<Item> getItem() {
		return item;
	}
	public void setItem(List<Item> item) {
		this.item = item;
	}
	

	
	
}
