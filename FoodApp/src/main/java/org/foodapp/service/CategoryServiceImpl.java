package org.foodapp.service;

import java.util.List;
import java.util.Optional;

import org.foodapp.model.Category;
import org.foodapp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("caegoryServiceImpl")
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepository;
	@Override
	public Category addCategory(Category category) {
	
		return categoryRepository.save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		return categoryRepository.save(category);
	}

	
	@Override
	public List<Category> viewAllCategory() {
		return categoryRepository.findAll();
	}

	@Override
	public Category removeCategory(Integer catId) {
		
		Category cat = categoryRepository.findById(catId).get();
		categoryRepository.deleteById(catId);
		return cat;
	}

	@Override
	public Category viewCategory(Integer catId) {
		Optional<Category> opt = categoryRepository.findById(catId);
		if(opt.isPresent()) {
			return opt.get();
		}
		else {
			return null;
		}
	}

}
