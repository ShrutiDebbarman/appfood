package org.foodapp.item.repository;
import java.util.List;

import org.foodapp.item.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item , Integer>{
	public List<Item> findByItemName(String ItemName);
}