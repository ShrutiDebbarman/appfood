package org.foodapp.service;

import java.util.List;
import java.util.Optional;

import org.foodapp.model.Restaurant;
import org.foodapp.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("restaurantServiceImpl")
public class RestaurantServiceImpl implements RestaurantService{

	@Autowired
	private RestaurantRepository restaurantRepository;
	@Override


		public Restaurant addRestaurant(Restaurant rest) {
			return restaurantRepository.save(rest);
		
	}

	@Override
	public Restaurant updateRestaurant(Restaurant rest) {
		return restaurantRepository.save(rest);
	}

	@Override
	public Restaurant removeRestaurant(Integer restId) {
		Restaurant rest = restaurantRepository.findById(restId).get();
		restaurantRepository.deleteById(restId);
		return rest;
	}

	@Override
	public Restaurant viewRestaurant(Integer restId) {
		Optional<Restaurant> opt = restaurantRepository.findById(restId);
		if(opt.isPresent()) {
			return opt.get();
		}
		else {
			return null;
		}
	}
	
	public Restaurant viewRestaurant(String restaurantName) {
		Optional<Restaurant> opt = restaurantRepository.findByRestaurantName(restaurantName);
		if(opt.isPresent()) {
			return opt.get();
		}
		else {
			return null;
		}
	}

	@Override
	public List<Restaurant> viewAllRestaurant() {
		// TODO Auto-generated method stub
		return restaurantRepository.findAll();
	}

	
	
}
