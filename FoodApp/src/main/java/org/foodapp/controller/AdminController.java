package org.foodapp.controller;

import java.util.List;

import org.foodapp.model.Category;
import org.foodapp.model.Item;
import org.foodapp.service.CategoryService;
import org.foodapp.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("")
	public String admin(){
		return "admin";
	}
	
	
	@GetMapping("/categories")
	public String categories(Model model){
		List<Category> list = categoryService.viewAllCategory();
		model.addAttribute("categories",list);
		return "categories/categories";
	}
	
	@GetMapping("/categories/add")
	public String addCategory(Model model) {
		Category category = new Category();
		model.addAttribute("categories", category);
		return "categories/add";
	}
	
	@PostMapping("/categories/addcategoryprocess")
	public String addCatagoryProcess(@ModelAttribute("categories") Category category) {
		Category cat = categoryService.addCategory(category);
		if(cat==null) {
			return "categories/categoryaddunsuccess";
		}
		else {
			return "categories/categoryaddsuccess";
		}
	}
	
	@GetMapping("/categories/deletecategoryprocess")
	public String deleteCategoryProcess(@RequestParam("catId") Integer catId , Model model) {
		Category cat = categoryService.removeCategory(catId);
		if(cat==null) {
			return "categories/categorydeleteunsuccess";
		}
		else {
			List<Category> list = categoryService.viewAllCategory();
			model.addAttribute("categories",list);
			return "categories/categorydeletesuccess";
		}
	}
	
	@GetMapping("categories/modifycategory")
	public String modifyCategory(Model model) {
		Category category = new Category();
		model.addAttribute("category", category);
		return "category/modifycategory";
	}
	
	@GetMapping("/categories/categorysearchformodification")
	public String categorySearchForModification(@RequestParam("catId") Integer catId ,Model model) {
		Category cat = categoryService.viewCategory(catId);
		if(cat==null) {
			return "category/categorynotfound";
		}
		else {
			model.addAttribute("category", cat);
			return "categories/update";
		}
	}
	
	@PostMapping("/categories/updatecategoryprocess")
	public String modifyCategoryProcess(@ModelAttribute("categories") Category category,Model model) {
		Category cat = categoryService.updateCategory(category);
		if(cat==null) {
			return "item/itemmodificationunsuccess";
		}
		else {
			List<Category> list = categoryService.viewAllCategory();
			model.addAttribute("categories",list);
			return "categories/categoryupdatesuccess";
		}
	}
	
	
	
	
	@Autowired
	private ItemService itemService;
	
	
	@GetMapping("/items")
	public String items(Model model){
		List<Item> list = itemService.viewAllItems();
		model.addAttribute("items",list);
		return "items/items";
	}
	
	
	@GetMapping("/items/add")
	public String addItems(Model model) {
//		List<Category> list = categoryService.viewAllCategory();
//		model.addAttribute("categories",list);
		Item item = new Item();
		model.addAttribute("items", item);
		return "items/add";
	}
	
	@PostMapping("/items/additemprocess")
	public String addItemProcess(@ModelAttribute("items") Item item, Model model) {
		Item im = itemService.addItem(item);
		if(im==null) {
			return "item/itemaddunsuccess";
		}
		else {
			return "item/itemaddsuccess";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
