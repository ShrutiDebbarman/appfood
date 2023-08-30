package org.foodapp.service;

import java.util.List;

import org.foodapp.model.Restaurant;
import org.springframework.stereotype.Service;

@Service("repositoryService")
public interface RestaurantService {

	    public Restaurant addRestaurant(Restaurant rest);
	    public Restaurant updateRestaurant(Restaurant rest);
	    public Restaurant removeRestaurant(Integer restId);
	    public Restaurant viewRestaurant(Integer restId);
	    public List<Restaurant> viewAllRestaurant();

}
