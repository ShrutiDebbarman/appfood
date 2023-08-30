package org.foodapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Restaurant {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 Integer restId;
	 String restaurantName;
	 
	 public Restaurant() {
	}

	public Restaurant(Integer restId, String restaurantName) {
		super();
		this.restId = restId;
		this.restaurantName = restaurantName;
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
	
	
}
