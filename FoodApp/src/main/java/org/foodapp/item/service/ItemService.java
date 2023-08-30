package org.foodapp.item.service;

import org.foodapp.category.model.Category;
import org.foodapp.item.model.Item;
//import org.item.model.Restaurant;

import java.util.List;

public interface ItemService {
    public Item addItem(Item item);
    public Item updateItem(Item item);
    public Item viewItem(Item item);
    public Item removeItem(Item item);
    public List<Item> viewAllItems(Category cat);
    //public List<Item> viewAllItems(Restaurant rest);
    //public List<Item> viewAllItemsByName(String name);


}
