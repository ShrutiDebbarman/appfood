package org.foodapp.Restaurant.repository;

import java.util.List;

import org.foodapp.Restaurant.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;


public interface  RestaurantRepository extends JpaRepository<Restaurant , Integer>{
	public List<Restaurant> findByRestaurantName(String restName);
}