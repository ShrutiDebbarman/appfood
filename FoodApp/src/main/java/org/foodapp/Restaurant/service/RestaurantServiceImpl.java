package org.foodapp.Restaurant.service;

import java.util.List;
import java.util.Optional;

import org.foodapp.Restaurant.model.Restaurant;
import org.foodapp.Restaurant.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("restaurantServiceImpl")
public class RestaurantServiceImpl implements RestaurantService{

	@Autowired
	private RestaurantRepository restaurantRepository;
	@Override

		// TODO Auto-generated method stub
		public Restaurant addRestaurant(Restaurant rest) {
			
			return restaurantRepository.save(rest);
		
	}

	@Override
	public Restaurant updateRestaurant(Restaurant rest) {
		// TODO Auto-generated method stub
		return restaurantRepository.save(rest);
	}

	@Override
	public Restaurant removeRestaurant(Integer restId) {
		// TODO Auto-generated method stub
		Restaurant cat = restaurantRepository.findById(restId).get();
		restaurantRepository.deleteById(restId);
		return cat;
	}

	@Override
	public Restaurant viewRestaurant(Integer restId) {
		// TODO Auto-generated method stub
		Optional<Restaurant> opt = restaurantRepository.findById(restId);
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
		return null;
	}

	@Override
	public List<Restaurant> viewAllRestaurant(Integer restId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
