package org.foodapp.repository;
import java.util.List;

import org.foodapp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category , Integer>{
	public List<Category> findByCategoryName(String catName);
}