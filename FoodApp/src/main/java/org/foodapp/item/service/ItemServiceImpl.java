package org.foodapp.item.service;

import java.util.List;

import org.foodapp.category.model.Category;
import org.foodapp.item.model.Item;
import org.foodapp.item.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemServiceImpl")
public class ItemServiceImpl implements ItemService{

	@Autowired
	private ItemRepository itemRepository;
	@Override
	public Item addItem(Item item) {
		return itemRepository.save(item);
	}

	@Override
	public Item updateItem(Item item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item viewItem(Item item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item removeItem(Item item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> viewAllItems(Category cat) {
		// TODO Auto-generated method stub
		return null;
	}

}
