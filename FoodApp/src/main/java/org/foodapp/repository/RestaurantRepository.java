package org.foodapp.repository;

import java.util.List;
import java.util.Optional;

import org.foodapp.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;


public interface  RestaurantRepository extends JpaRepository<Restaurant , Integer>{
	public Optional<Restaurant> findByRestaurantName(String restName);
}