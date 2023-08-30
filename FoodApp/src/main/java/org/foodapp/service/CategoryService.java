package org.foodapp.service;
import java.util.List;
import org.foodapp.model.Category;
import org.springframework.stereotype.Service;

@Service("categoryService")
public interface CategoryService {

	    public Category addCategory(Category cat);
	    public Category updateCategory(Category cat);
	    public Category removeCategory(Integer integer);
	    public Category viewCategory(Integer catId);
	    public List<Category> viewAllCategory();

}
