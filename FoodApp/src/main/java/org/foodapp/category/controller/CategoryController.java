package org.foodapp.category.controller;

import org.foodapp.category.model.Category;
import org.foodapp.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/addcategory")
	public String addCategory(Model model) {
		Category category = new Category();
		model.addAttribute("category", category);
		return "category/addcategory";
	}
	
	@PostMapping("/addcategoryprocess")
	public String addCatagoryProcess(@ModelAttribute("category") Category category) {
		Category cat = categoryService.addCategory(category);
		if(cat==null) {
			return "category/categoryaddunsuccess";
		}
		else {
			return "category/categoryaddsuccess";
		}
	}
	
	@GetMapping("/modifycategory")
	public String modifyCategory(Model model) {
		Category category = new Category();
		model.addAttribute("category", category);
		return "category/modifycategory";
	}
	
	@GetMapping("/categorysearchformodification")
	public String categorySearchForModification(@ModelAttribute("category") Category category,Model model) {
		Category cat = categoryService.viewCategory(category.getCatId());
		if(cat==null) {
			return "category/categorynotfound";
		}
		else {
			model.addAttribute("category", cat);
			return "category/categorymodifysearch";
		}
	}
	
	@PostMapping("/modifycategoryprocess")
	public String modifyCategoryProcess(@ModelAttribute("category") Category category) {
		Category cat = categoryService.updateCategory(category);
		if(cat==null) {
			return "category/categorymodificationunsuccess";
		}
		else {
			return "category/categorymodificationsuccess";
		}
	}




@GetMapping("/deletecategory")
public String deleteCategory(Model model) {
	Category category = new Category();
	model.addAttribute("category", category);
	return "category/deletecategory";
}

@GetMapping("/categorysearchfordeletion")
public String categorySearchFordeletion(@ModelAttribute("category") Category category,Model model) {
	Category cat = categoryService.viewCategory(category.getCatId());
	if(cat==null) {
		return "category/categorynotfound";
	}
	else {
		model.addAttribute("category", cat);
		return "category/categorydeletesearch";
	}
}

@PostMapping("/deletecategoryprocess")
public String deleteCategoryProcess(@ModelAttribute("category") Category category) {
	Category cat = categoryService.removeCategory(category.getCatId());
	if(cat==null) {
		return "category/categorydeletionunsuccess";
	}
	else {
		return "category/categorydeletionsuccess";
	}
}
}

