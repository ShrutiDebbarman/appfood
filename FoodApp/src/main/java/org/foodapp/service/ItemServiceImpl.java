package org.foodapp.service;

import java.util.List;
import java.util.Optional;

import org.foodapp.model.Item;
import org.foodapp.repository.ItemRepository;
import org.foodapp.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemServiceImpl")
public class ItemServiceImpl implements ItemService{

	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	@Override
	public Item addItem(Item item) {
		restaurantRepository.save(item.getRestaurant());
		return itemRepository.save(item);
	}

	@Override
	public Item updateItem(Item item) {
		restaurantRepository.save(item.getRestaurant());
		return itemRepository.save(item);
	}

	@Override
	public Item viewItem(Integer itemId) {
		Optional<Item> opt = itemRepository.findById(itemId);
		if(opt.isPresent()) {
				return opt.get();
		}
		else {
			return null;
		}
	}


	@Override
	public Item removeItem(Integer itemId) {
		Item im = itemRepository.findById(itemId).get();
		itemRepository.deleteById(itemId);
		return im;
	}

	@Override
	public List<Item> viewAllItems() {
		return itemRepository.findAll();
	}

}
