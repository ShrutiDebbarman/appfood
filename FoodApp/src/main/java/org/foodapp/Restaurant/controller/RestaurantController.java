package org.foodapp.Restaurant.controller;

import org.foodapp.Restaurant.model.Restaurant;
import org.foodapp.Restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/restaurant")
public class RestaurantController {
    @Autowired
	private RestaurantService restaurantService;
	
    @GetMapping("/addrestaurant")
    public String addRestaurant(Model model) {
    	Restaurant restaurant = new Restaurant();
    	model.addAttribute("restaurant", restaurant);
    	return "restaurant/addrestaurant";
    }
	
	@PostMapping("/addrestaurantprocess")
	public String addRestaurantProcess(@ModelAttribute("restaurant") Restaurant restaurant) {
		Restaurant rest = restaurantService.addRestaurant(restaurant);
		if(rest==null) {
			return "restaurant/restaurantaddunsuccess";
			
		}else {
			return "restaurant/restaurantaddsuccess";
		}
	}
	
	@GetMapping("/modifyrestaurant")
	public String modifyRestaurant(Model model) {
		Restaurant restaurant = new Restaurant();
		model.addAttribute("restaurant", restaurant);
		return "restaurant/modifyrestaurant";
	}
	
	@GetMapping("/restaurantsearchformodification")
	public String restaurantSearchForModification(@ModelAttribute("restaurant") Restaurant restaurant,Model model) {
		Restaurant rest = restaurantService.viewRestaurant(restaurant.getRestId());
		if(rest==null) {
			return "restaurant/restaurantnotfound";
		}
		else {
			model.addAttribute("restaurant", rest);
			return "restaurant/restaurantmodifysearch";
		}
	}
	
	@PostMapping("/modifyrestaurantprocess")
	public String modifyRestaurantProcess(@ModelAttribute("restaurant") Restaurant restaurant) {
		Restaurant rest = restaurantService.updateRestaurant(restaurant);
		if(rest==null) {
			return "restaurant/restaurantmodificationunsuccess";
		}
		else {
			return "restaurant/restaurantmodificationsuccess";
		}
	}




@GetMapping("/deleterestaurant")
public String deleteRestaurant(Model model) {
	Restaurant restaurant = new Restaurant();
	model.addAttribute("restaurant", restaurant);
	return "restaurant/deleterestaurant";
}

@GetMapping("/restaurantsearchfordeletion")
public String restaurantSearchFordeletion(@ModelAttribute("restaurant")Restaurant restaurant,Model model) {
	Restaurant rest = restaurantService.viewRestaurant(restaurant.getRestId());
	if(rest==null) {
		return "restaurant/restaurantnotfound";
	}
	else {
		model.addAttribute("restaurant", rest);
		return "restaurant/restaurantdeletesearch";
	}
}

@PostMapping("/deleterestaurantprocess")
public String deleteRestaurantProcess(@ModelAttribute("restaurant") Restaurant restaurant) {
	Restaurant rest = restaurantService.removeRestaurant(restaurant.getRestId());
	if(rest==null) {
		return "restaurant/restaurantdeletionunsuccess";
	}
	else {
		return "restaurant/restaurantdeletionsuccess";
	}
}
}


	
	

