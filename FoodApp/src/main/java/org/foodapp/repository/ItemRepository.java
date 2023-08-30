package org.foodapp.repository;
import java.util.List;

import org.foodapp.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<Item , Integer>{
	public List<Item> findByItemName(String ItemName);
}