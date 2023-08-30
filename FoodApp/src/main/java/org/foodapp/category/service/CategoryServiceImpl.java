package org.foodapp.category.service;

import java.util.List;
import java.util.Optional;

import org.foodapp.category.model.Category;
import org.foodapp.category.repository.CategoryRepository;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category removeCategory(Integer catId) {
		// TODO Auto-generated method stub
		
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
