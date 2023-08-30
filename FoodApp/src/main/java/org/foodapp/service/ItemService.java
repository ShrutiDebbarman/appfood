package org.foodapp.service;

import org.foodapp.model.Item;
//import org.item.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    public Item addItem(Item item);
    public Item updateItem(Item item);
    public Item viewItem(Integer itemId);
    public Item removeItem(Integer itemId);
    public List<Item> viewAllItems();
    //public List<Item> viewAllItems(Restaurant rest);
    //public List<Item> viewAllItemsByName(String name);


}
